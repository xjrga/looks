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
package org.xjrga.looks.harmonic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import javax.swing.ButtonGroup;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.metal.MetalLookAndFeel;
import org.xjrga.looks.Dawn;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class MyColorChooser {

    private final JFrame frame;
    private final JRadioButton option01;
    private final JRadioButton option02;
    private final JRadioButton option03;
    private final JRadioButton option04;
    private Color chooserColor;
    private Color borderColor;

    public MyColorChooser() {
        frame = new JFrame("Design");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JColorChooser chooser = new JColorChooser();
        Categorizer categorizer = new Categorizer();
        chooser.addChooserPanel(new Palettes());
        JPanel panelColorsLeft = new JPanel();
        panelColorsLeft.setOpaque(true);
        panelColorsLeft.setLayout(new GridLayout(0, 13));
        panelColorsLeft.setBorder(new TitledBorder("Left"));
        JPanel panelColorsRight = new JPanel();
        panelColorsRight.setOpaque(true);
        panelColorsRight.setLayout(new GridLayout(0, 13));
        panelColorsRight.setBorder(new TitledBorder("Right"));
        JPanel panelColorsTop = new JPanel();
        panelColorsTop.setOpaque(true);
        panelColorsTop.setLayout(new GridLayout(0, 13));
        panelColorsTop.setBorder(new TitledBorder("Complementary"));
        JPanel panelColorsBottom = new JPanel();
        panelColorsBottom.setOpaque(true);
        panelColorsBottom.setLayout(new GridLayout(0, 13));
        panelColorsBottom.setBorder(new TitledBorder("Analogous"));
        JPanel panelColors = new JPanel();
        panelColors.setLayout(new GridLayout(0, 1));
        panelColors.add(panelColorsTop);
        panelColors.add(panelColorsBottom);
        panelColors.add(panelColorsLeft);
        panelColors.add(panelColorsRight);
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(panelColors);
        jScrollPane.setPreferredSize(new Dimension(600, 250));
        chooser.setPreviewPanel(new JPanel());        
        JPanel panel00 = new JPanel();
        JPanel panel01 = new JPanel();
        panel00.setLayout(new FlowLayout());
        panel01.setLayout(new BorderLayout());
        option01 = new JRadioButton("Background");
        option02 = new JRadioButton("Font");
        option03 = new JRadioButton("Harmonic");
        option04 = new JRadioButton("Border");
        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(option01);
        group.add(option02);
        group.add(option03);
        group.add(option04);
        group.setSelected(option03.getModel(), true);
        panel00.add(option03);
        panel00.add(option01);
        panel00.add(option04);
        panel00.add(option02);
        panel01.add(panel00, BorderLayout.NORTH);
        panel01.add(jScrollPane, BorderLayout.CENTER);        
        JSplitPane jSplitPane = new JSplitPane();
        jSplitPane.add(chooser, JSplitPane.TOP);
        jSplitPane.add(panel01, JSplitPane.BOTTOM);
        frame.setContentPane(jSplitPane);
        frame.setPreferredSize(new Dimension(1200, 600));
        frame.pack();
        frame.setVisible(true);
        chooser.getSelectionModel().addChangeListener((var event) -> {
            ColorHarmonic colorHarmonic = new ColorHarmonic(chooser.getColor());
            chooserColor = chooser.getColor();
            if (option02.isSelected()) {
                new Thread() {
                    public void run() {
                        ((TitledBorder) panelColorsLeft.getBorder()).setTitleColor(chooserColor);
                        ((TitledBorder) panelColorsRight.getBorder()).setTitleColor(chooserColor);
                        ((TitledBorder) panelColorsTop.getBorder()).setTitleColor(chooserColor);
                        ((TitledBorder) panelColorsBottom.getBorder()).setTitleColor(chooserColor);
                        Component[] componentsLeft = panelColorsLeft.getComponents();
                        for (int i = 0; i < componentsLeft.length; i++) {
                            if (componentsLeft[i] instanceof JLabel) {
                                componentsLeft[i].setForeground(chooserColor);
                            }
                        }
                        Component[] componentsRight = panelColorsRight.getComponents();
                        for (int i = 0; i < componentsRight.length; i++) {
                            if (componentsRight[i] instanceof JLabel) {
                                componentsRight[i].setForeground(chooserColor);
                            }
                        }
                        Component[] componentsTop = panelColorsTop.getComponents();
                        for (int i = 0; i < componentsTop.length; i++) {
                            if (componentsTop[i] instanceof JLabel) {
                                componentsTop[i].setForeground(chooserColor);
                            }
                        }
                        Component[] componentsBottom = panelColorsBottom.getComponents();
                        for (int i = 0; i < componentsBottom.length; i++) {
                            if (componentsBottom[i] instanceof JLabel) {
                                componentsBottom[i].setForeground(chooserColor);
                            }
                        }
                        frame.repaint();
                    }
                }.start();
            } else if (option01.isSelected()) {
                new Thread() {
                    public void run() {
                        panelColors.setBackground(chooserColor);
                        panelColorsLeft.setBackground(chooserColor);
                        panelColorsRight.setBackground(chooserColor);
                        panelColorsTop.setBackground(chooserColor);
                        panelColorsBottom.setBackground(chooserColor);
                    }
                }.start();
            } else if (option03.isSelected()) {
                Iterator<HarmonicColor> leftIterator = colorHarmonic.getLeftIterator();
                Iterator<HarmonicColor> rightIterator = colorHarmonic.getRightIterator();
                Iterator<HarmonicColor> topIterator = colorHarmonic.getTopIterator();
                Iterator<HarmonicColor> bottomIterator = colorHarmonic.getBottomIterator();
                new Thread() {
                    public void run() {
                        panelColorsLeft.removeAll();
                        panelColorsRight.removeAll();
                        panelColorsTop.removeAll();
                        panelColorsBottom.removeAll();
                        while (leftIterator.hasNext()) {
                            HarmonicColor next = leftIterator.next();
                            panelColorsLeft.add(getLabel(next));
                            System.out.println(next.getAngle() + ":" + next.getAngleChange() + ":" + categorizer.getColorTemperature() + ":" + categorizer.getColorPositionTB() + ":" + categorizer.getColorPositionLR() + ":" + categorizer.getColorCategory());
                        }
                        while (rightIterator.hasNext()) {
                            HarmonicColor next = rightIterator.next();
                            panelColorsRight.add(getLabel(next));
                            System.out.println(next.getAngle() + ":" + next.getAngleChange() + ":" + categorizer.getColorTemperature() + ":" + categorizer.getColorPositionTB() + ":" + categorizer.getColorPositionLR() + ":" + categorizer.getColorCategory());
                        }
                        while (topIterator.hasNext()) {
                            HarmonicColor next = topIterator.next();
                            panelColorsTop.add(getLabel(next));
                            System.out.println(next.getAngle() + ":" + next.getAngleChange() + ":" + categorizer.getColorTemperature() + ":" + categorizer.getColorPositionTB() + ":" + categorizer.getColorPositionLR() + ":" + categorizer.getColorCategory());
                        }
                        while (bottomIterator.hasNext()) {
                            HarmonicColor next = bottomIterator.next();
                            panelColorsBottom.add(getLabel(next));
                            System.out.println(next.getAngle() + ":" + next.getAngleChange() + ":" + categorizer.getColorTemperature() + ":" + categorizer.getColorPositionTB() + ":" + categorizer.getColorPositionLR() + ":" + categorizer.getColorCategory());
                        }
                        panelColorsLeft.revalidate();
                        panelColorsRight.revalidate();
                        panelColorsTop.revalidate();
                        panelColorsBottom.revalidate();
                    }

                    private JLabel getLabel(HarmonicColor next) {
                        JLabel label = new JLabel();
                        label.setOpaque(true);
                        label.setPreferredSize(new Dimension(50, 50));
                        label.setForeground(chooserColor);
                        label.setText(next.getAngle() + "");
                        label.setBackground(next.getColor());
                        //label.setBorder(new LineBorder(Color.BLACK));
                        label.setHorizontalAlignment(SwingConstants.CENTER);
                        label.setVerticalAlignment(SwingConstants.CENTER);
                        categorizer.setHarmonicColor(next);
                        label.setToolTipText("<html>" + categorizer.getColorTemperature() + "<br/>" + categorizer.getColorPositionTB() + ", " + categorizer.getColorPositionLR() + "<br/>" + categorizer.getColorCategory() + "</html>");
                        return label;
                    }
                }.start();
            } else if (option04.isSelected()) {
                borderColor = chooserColor;
                new Thread() {
                    public void run() {
                        LineBorder lineBorder = new LineBorder(borderColor);
                        ((TitledBorder) panelColorsTop.getBorder()).setBorder(lineBorder);
                        ((TitledBorder) panelColorsBottom.getBorder()).setBorder(lineBorder);
                        ((TitledBorder) panelColorsLeft.getBorder()).setBorder(lineBorder);
                        ((TitledBorder) panelColorsRight.getBorder()).setBorder(lineBorder);
                        Component[] componentsTop = panelColorsTop.getComponents();
                        for (int i = 0; i < componentsTop.length; i++) {
                            if (componentsTop[i] instanceof JLabel) {
                                ((JLabel) componentsTop[i]).setBorder(lineBorder);
                            }
                        }
                        Component[] componentsBottom = panelColorsBottom.getComponents();
                        for (int i = 0; i < componentsBottom.length; i++) {
                            if (componentsBottom[i] instanceof JLabel) {
                                ((JLabel) componentsBottom[i]).setBorder(lineBorder);
                            }
                        }
                        Component[] componentsLeft = panelColorsLeft.getComponents();
                        for (int i = 0; i < componentsLeft.length; i++) {
                            if (componentsLeft[i] instanceof JLabel) {
                                ((JLabel) componentsLeft[i]).setBorder(lineBorder);
                            }
                        }
                        Component[] componentsRight = panelColorsRight.getComponents();
                        for (int i = 0; i < componentsRight.length; i++) {
                            if (componentsRight[i] instanceof JLabel) {
                                ((JLabel) componentsRight[i]).setBorder(lineBorder);
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
    }

    public void exit() {
        frame.dispose();
    }

    public static void main(String[] args) {
        try {
            MetalLookAndFeel.setCurrentTheme(new Dawn());
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        SwingUtilities.invokeLater(() -> {
            MyColorChooser myColorChooser = new MyColorChooser();
        });
    }

}
