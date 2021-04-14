/*
 * Copyright (C) 2021 Jorge R Garcia de Alba <jorge.r.garciadealba@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.xjrga.looks.software;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.metal.MetalLookAndFeel;
import org.xjrga.looks.harmonic.Categorizer;
import org.xjrga.looks.harmonic.ColorHarmonic;
import org.xjrga.looks.harmonic.HarmonicColor;
import org.xjrga.looks.themes.Dawn180;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class PaletteViewer {

    private final JFrame frame;
    private final JRadioButton optionBackground;
    private final JRadioButton optionFont;
    private final JRadioButton optionHarmonic;
    private final JRadioButton optionBorder;
    private Color chooserColor;
    private Color borderColor;
    private Color fontColor;
    private Color backgroundColor;
    private PaletteChooserPanel paletteChooserPanel;
    private JColorChooser colorChooser;
    private JTabbedPane chooserTabbedPane;
    private JFileChooser fileChooser;

    public PaletteViewer() {
        fileChooser = new JFileChooser();
        frame = new JFrame("Palette Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        colorChooser = new JColorChooser();
        Categorizer categorizer = new Categorizer();
        paletteChooserPanel = new PaletteChooserPanel();
        colorChooser.addChooserPanel(paletteChooserPanel);
        JPanel panelOriginal = new JPanel();
        panelOriginal.setLayout(new GridLayout(0, 13, 10, 10));
        panelOriginal.setBorder(new TitledBorder("Original"));
        JPanel panelColorsTop = new JPanel();
        panelColorsTop.setOpaque(true);
        panelColorsTop.setLayout(new GridLayout(0, 13, 10, 10));
        panelColorsTop.setBorder(new TitledBorder("Complementary"));
        JPanel panelColorsBottom = new JPanel();
        panelColorsBottom.setOpaque(true);
        panelColorsBottom.setLayout(new GridLayout(0, 13, 10, 10));
        panelColorsBottom.setBorder(new TitledBorder("Analogous"));
        JPanel panelColorsLeft = new JPanel();
        panelColorsLeft.setOpaque(true);
        panelColorsLeft.setLayout(new GridLayout(0, 13, 10, 10));
        panelColorsLeft.setBorder(new TitledBorder("Left"));
        JPanel panelColorsRight = new JPanel();
        panelColorsRight.setOpaque(true);
        panelColorsRight.setLayout(new GridLayout(0, 13, 10, 10));
        panelColorsRight.setBorder(new TitledBorder("Right"));
        JPanel panelColors = new JPanel();
        panelColors.setLayout(new GridLayout(0, 1));
        TitledBorder titledBorder = new TitledBorder("Color Wheel (HSV)");
        panelColors.setBorder(titledBorder);
        titledBorder.setTitleJustification(TitledBorder.RIGHT);
        panelColors.add(panelOriginal);
        panelColors.add(panelColorsTop);
        panelColors.add(panelColorsBottom);
        panelColors.add(panelColorsLeft);
        panelColors.add(panelColorsRight);
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(panelColors);
        jScrollPane.setPreferredSize(new Dimension(600, 250));
        JPanel previewPanel = new JPanel();
        JButton previewPanelAddButton = new JButton("+");
        JButton previewPanelDeleteButton = new JButton("-");
        JButton previewPanelClearButton = new JButton("Clear");
        JButton previewPanelExportButton = new JButton("Export");
        JButton previewPanelImportButton = new JButton("Import");        
        previewPanelDeleteButton.setEnabled(false);
        previewPanelExportButton.setEnabled(false);
        previewPanelImportButton.setEnabled(false);
        previewPanel.add(previewPanelClearButton);
        previewPanel.add(previewPanelAddButton);
        previewPanel.add(previewPanelDeleteButton);
        previewPanel.add(previewPanelExportButton);
        previewPanel.add(previewPanelImportButton);
        colorChooser.setPreviewPanel(previewPanel);
        JPanel panel00 = new JPanel();
        JPanel panel01 = new JPanel();
        panel00.setLayout(new FlowLayout());
        panel01.setLayout(new BorderLayout());
        optionBackground = new JRadioButton("Background");
        optionFont = new JRadioButton("Font");
        optionHarmonic = new JRadioButton("Harmonic");
        optionBorder = new JRadioButton("Border");
        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(optionBackground);
        group.add(optionFont);
        group.add(optionHarmonic);
        group.add(optionBorder);
        group.setSelected(optionHarmonic.getModel(), true);
        panel00.add(optionBackground);
        panel00.add(optionFont);
        panel00.add(optionBorder);
        panel00.add(optionHarmonic);
        panel01.add(panel00, BorderLayout.NORTH);
        panel01.add(jScrollPane, BorderLayout.CENTER);
        JSplitPane jSplitPane = new JSplitPane();
        jSplitPane.add(colorChooser, JSplitPane.TOP);
        jSplitPane.add(panel01, JSplitPane.BOTTOM);
        frame.setContentPane(jSplitPane);
        frame.setMinimumSize(new Dimension(760, 635));
        frame.setPreferredSize(new Dimension(1496, 635));
        frame.pack();
        frame.setVisible(true);
        colorChooser.getSelectionModel().addChangeListener((var event) -> {
            ColorHarmonic colorHarmonic = new ColorHarmonic(colorChooser.getColor());
            chooserColor = colorChooser.getColor();
            if (optionFont.isSelected()) {
                fontColor = chooserColor;
                new Thread() {
                    public void run() {
                        ((TitledBorder) panelColors.getBorder()).setTitleColor(fontColor);
                        ((TitledBorder) panelOriginal.getBorder()).setTitleColor(fontColor);
                        ((TitledBorder) panelColorsLeft.getBorder()).setTitleColor(fontColor);
                        ((TitledBorder) panelColorsRight.getBorder()).setTitleColor(fontColor);
                        ((TitledBorder) panelColorsTop.getBorder()).setTitleColor(fontColor);
                        ((TitledBorder) panelColorsBottom.getBorder()).setTitleColor(fontColor);
                        Component[] componentsOriginal = panelOriginal.getComponents();
                        for (int i = 0; i < componentsOriginal.length; i++) {
                            if (componentsOriginal[i] instanceof JLabel) {
                                componentsOriginal[i].setForeground(fontColor);
                            }
                        }
                        Component[] componentsLeft = panelColorsLeft.getComponents();
                        for (int i = 0; i < componentsLeft.length; i++) {
                            if (componentsLeft[i] instanceof JLabel) {
                                componentsLeft[i].setForeground(fontColor);
                            }
                        }
                        Component[] componentsRight = panelColorsRight.getComponents();
                        for (int i = 0; i < componentsRight.length; i++) {
                            if (componentsRight[i] instanceof JLabel) {
                                componentsRight[i].setForeground(fontColor);
                            }
                        }
                        Component[] componentsTop = panelColorsTop.getComponents();
                        for (int i = 0; i < componentsTop.length; i++) {
                            if (componentsTop[i] instanceof JLabel) {
                                componentsTop[i].setForeground(fontColor);
                            }
                        }
                        Component[] componentsBottom = panelColorsBottom.getComponents();
                        for (int i = 0; i < componentsBottom.length; i++) {
                            if (componentsBottom[i] instanceof JLabel) {
                                componentsBottom[i].setForeground(fontColor);
                            }
                        }
                        frame.repaint();
                    }
                }.start();
            } else if (optionBackground.isSelected()) {
                backgroundColor = chooserColor;
                new Thread() {
                    public void run() {
                        LineBorder paneLineBorder = new LineBorder(backgroundColor);
                        panelColors.setBackground(backgroundColor);
                        panelOriginal.setBackground(backgroundColor);
                        panelColorsLeft.setBackground(backgroundColor);
                        panelColorsRight.setBackground(backgroundColor);
                        panelColorsTop.setBackground(backgroundColor);
                        panelColorsBottom.setBackground(backgroundColor);
                        ((TitledBorder) panelOriginal.getBorder()).setBorder(paneLineBorder);
                        ((TitledBorder) panelColorsTop.getBorder()).setBorder(paneLineBorder);
                        ((TitledBorder) panelColorsBottom.getBorder()).setBorder(paneLineBorder);
                        ((TitledBorder) panelColorsLeft.getBorder()).setBorder(paneLineBorder);
                        ((TitledBorder) panelColorsRight.getBorder()).setBorder(paneLineBorder);
                    }
                }.start();
            } else if (optionHarmonic.isSelected()) {
                Iterator<HarmonicColor> leftIterator = colorHarmonic.getLeftIterator();
                Iterator<HarmonicColor> rightIterator = colorHarmonic.getRightIterator();
                Iterator<HarmonicColor> topIterator = colorHarmonic.getTopIterator();
                Iterator<HarmonicColor> bottomIterator = colorHarmonic.getBottomIterator();
                new Thread() {
                    public void run() {
                        //
                        panelOriginal.removeAll();
                        panelOriginal.add(getLabel(colorHarmonic.getHarmonic0()));
                        panelOriginal.revalidate();
                        panelOriginal.repaint();
                        //
                        panelColorsLeft.removeAll();
                        while (leftIterator.hasNext()) {
                            HarmonicColor next = leftIterator.next();
                            panelColorsLeft.add(getLabel(next));
                        }
                        panelColorsLeft.revalidate();
                        panelColorsLeft.repaint();
                        //
                        panelColorsRight.removeAll();
                        while (rightIterator.hasNext()) {
                            HarmonicColor next = rightIterator.next();
                            panelColorsRight.add(getLabel(next));
                        }
                        panelColorsRight.revalidate();
                        panelColorsRight.repaint();
                        //
                        panelColorsTop.removeAll();
                        while (topIterator.hasNext()) {
                            HarmonicColor next = topIterator.next();
                            panelColorsTop.add(getLabel(next));
                        }
                        panelColorsTop.revalidate();
                        panelColorsTop.repaint();
                        //
                        panelColorsBottom.removeAll();
                        while (bottomIterator.hasNext()) {
                            HarmonicColor next = bottomIterator.next();
                            panelColorsBottom.add(getLabel(next));
                        }
                        panelColorsBottom.revalidate();
                        panelColorsBottom.repaint();
                    }

                    private JLabel getLabel(HarmonicColor harmonicColor) {
                        JLabel label = new JLabel();
                        label.setOpaque(true);
                        label.setPreferredSize(new Dimension(50, 50));
                        label.setForeground(fontColor);
                        label.setBorder(new LineBorder((borderColor)));
                        label.setText(harmonicColor.getAngle() + "");
                        label.setBackground(harmonicColor.getColor());
                        label.setHorizontalAlignment(SwingConstants.CENTER);
                        label.setVerticalAlignment(SwingConstants.CENTER);
                        categorizer.setHarmonicColor(harmonicColor);
                        StringBuilder sb = new StringBuilder();
                        sb.append("<html>");
                        sb.append("Temperature: ");
                        sb.append(String.valueOf(categorizer.getColorTemperature()));
                        sb.append("<br/>");
                        sb.append("Position: ");
                        sb.append(categorizer.getColorPositionTB());
                        sb.append(", ");
                        sb.append(categorizer.getColorPositionLR());
                        sb.append("<br/>");
                        sb.append("Type: ");
                        sb.append(categorizer.getColorCategory());
                        sb.append("<br/>");
                        sb.append("Hue: ");
                        sb.append(harmonicColor.getAngle());
                        sb.append("<br/>");
                        sb.append("Hue Change: ");
                        sb.append(harmonicColor.getAngleChange());
                        label.setToolTipText(sb.toString());
                        return label;
                    }
                }.start();
            } else if (optionBorder.isSelected()) {
                borderColor = chooserColor;
                new Thread() {
                    public void run() {
                        LineBorder labelLineBorder = new LineBorder(borderColor, 2);
                        Component[] componentsOriginal = panelOriginal.getComponents();
                        for (int i = 0; i < componentsOriginal.length; i++) {
                            if (componentsOriginal[i] instanceof JLabel) {
                                ((JLabel) componentsOriginal[i]).setBorder(labelLineBorder);
                            }
                        }
                        Component[] componentsTop = panelColorsTop.getComponents();
                        for (int i = 0; i < componentsTop.length; i++) {
                            if (componentsTop[i] instanceof JLabel) {
                                ((JLabel) componentsTop[i]).setBorder(labelLineBorder);
                            }
                        }
                        Component[] componentsBottom = panelColorsBottom.getComponents();
                        for (int i = 0; i < componentsBottom.length; i++) {
                            if (componentsBottom[i] instanceof JLabel) {
                                ((JLabel) componentsBottom[i]).setBorder(labelLineBorder);
                            }
                        }
                        Component[] componentsLeft = panelColorsLeft.getComponents();
                        for (int i = 0; i < componentsLeft.length; i++) {
                            if (componentsLeft[i] instanceof JLabel) {
                                ((JLabel) componentsLeft[i]).setBorder(labelLineBorder);
                            }
                        }
                        Component[] componentsRight = panelColorsRight.getComponents();
                        for (int i = 0; i < componentsRight.length; i++) {
                            if (componentsRight[i] instanceof JLabel) {
                                ((JLabel) componentsRight[i]).setBorder(labelLineBorder);
                            }
                        }
                        frame.repaint();
                    }
                }.start();
            }
        });
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });
        previewPanelClearButton.addActionListener(e -> event_clearRecentColorPanel());
        previewPanelAddButton.addActionListener(e -> event_addColorItem());
        previewPanelDeleteButton.addActionListener(e -> event_deleteColorItem());
        previewPanelExportButton.addActionListener(e -> event_exportColorItems());
        previewPanelImportButton.addActionListener(e -> event_importColorItems());

        Component[] componentsColorChooser = colorChooser.getComponents();
        for (int i = 0; i < componentsColorChooser.length; i++) {
            if (componentsColorChooser[i] instanceof JTabbedPane) {
                chooserTabbedPane = (JTabbedPane) componentsColorChooser[i];
            }
        }
        chooserTabbedPane.addChangeListener((ChangeEvent e) -> {
            switch (chooserTabbedPane.getSelectedIndex()) {
                case 0:
                    previewPanelClearButton.setEnabled(true);
                    previewPanelAddButton.setEnabled(true);
                    previewPanelDeleteButton.setEnabled(false);
                    previewPanelExportButton.setEnabled(false);
                    previewPanelImportButton.setEnabled(false);
                    break;
                case 1:
                    previewPanelClearButton.setEnabled(false);
                    previewPanelAddButton.setEnabled(true);
                    previewPanelDeleteButton.setEnabled(false);
                    previewPanelExportButton.setEnabled(false);
                    previewPanelImportButton.setEnabled(false);
                    break;
                case 2:
                    previewPanelClearButton.setEnabled(false);
                    previewPanelAddButton.setEnabled(true);
                    previewPanelDeleteButton.setEnabled(false);
                    previewPanelExportButton.setEnabled(false);
                    previewPanelImportButton.setEnabled(false);
                    break;
                case 3:
                    previewPanelClearButton.setEnabled(false);
                    previewPanelAddButton.setEnabled(true);
                    previewPanelDeleteButton.setEnabled(false);
                    previewPanelExportButton.setEnabled(false);
                    previewPanelImportButton.setEnabled(false);
                    break;
                case 4:
                    previewPanelClearButton.setEnabled(false);
                    previewPanelAddButton.setEnabled(true);
                    previewPanelExportButton.setEnabled(false);
                    previewPanelDeleteButton.setEnabled(false);
                    previewPanelImportButton.setEnabled(false);
                    break;
                case 5:
                    previewPanelClearButton.setEnabled(true);
                    previewPanelAddButton.setEnabled(true);
                    previewPanelExportButton.setEnabled(true);
                    previewPanelDeleteButton.setEnabled(true);
                    previewPanelImportButton.setEnabled(true);
                    break;
            }
        });
    }

    public void exit() {
        frame.dispose();
    }

    public static void main(String[] args) {
        try {
            MetalLookAndFeel.setCurrentTheme(new Dawn180());
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        SwingUtilities.invokeLater(() -> {
            PaletteViewer palette = new PaletteViewer();
        });
    }

    public void resetRecentPanel() {
        for (AbstractColorChooserPanel p : colorChooser.getChooserPanels()) {
            if (p.getClass().getSimpleName().equals("DefaultSwatchChooserPanel")) {
                Field recentPanelField;
                try {
                    recentPanelField = p.getClass().getDeclaredField("recentSwatchPanel");
                    recentPanelField.setAccessible(true);
                    Object recentPanel = recentPanelField.get(p);
                    Method recentColorMethod = recentPanel.getClass().getMethod("setMostRecentColor", Color.class);
                    recentColorMethod.setAccessible(true);
                    for (int i = 0; i < 35; i++) {
                        recentColorMethod.invoke(recentPanel, new Color(95, 99, 102));
                    }
                } catch (Exception ex) {
                    Logger.getLogger(PaletteViewer.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }

        }
    }

    public void event_addColorItem() {
        Color selectedColor = colorChooser.getColor();
        paletteChooserPanel.addColorItem(selectedColor);
    }

    private void event_deleteColorItem() {
        paletteChooserPanel.deleteSelectedColorItem();
    }

    private void event_clearRecentColorPanel() {
        if (chooserTabbedPane.getSelectedIndex() == 5) {
            paletteChooserPanel.clearAllColorItems();
            paletteChooserPanel.clearPaletteName();
        } else if (chooserTabbedPane.getSelectedIndex() == 0) {
            resetRecentPanel();
        }
    }

    private void event_exportColorItems() {
        int returnVal = fileChooser.showDialog(frame, "Export");
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            fileChooser.setCurrentDirectory(new File(path));
            StringBuilder sb = new StringBuilder();
            sb.append(path);
            sb.append(".xml");
            paletteChooserPanel.exportColorItems(sb.toString());
            
        }
    }

    private void event_importColorItems() {
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Xml Document", "xml"));
        int returnVal = fileChooser.showOpenDialog(frame);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            fileChooser.setCurrentDirectory(new File(path));
            paletteChooserPanel.importColorItems(path);
        }
    }    
    
}