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
    private Color fontColor;
    private Categorizer categorizer;

    public MyColorChooser() {
        frame = new JFrame("MyColorChooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JColorChooser chooser = new JColorChooser();
        Categorizer categorizer = new Categorizer();
        chooser.addChooserPanel(new MyChooserPanel());
        JPanel panelColorsLeft = new JPanel();
        panelColorsLeft.setOpaque(true);
        panelColorsLeft.setLayout(new GridLayout(0, 13));
        JPanel panelColorsRight = new JPanel();
        panelColorsRight.setOpaque(true);
        panelColorsRight.setLayout(new GridLayout(0, 13));
        JPanel panelColors = new JPanel();
        panelColors.setLayout(new GridLayout(0, 1));
        panelColors.add(panelColorsLeft);
        panelColors.add(panelColorsRight);
        panelColors.add(new JPanel());
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(panelColors);
        jScrollPane.setPreferredSize(new Dimension(600, 250));
        chooser.setPreviewPanel(new JPanel());
        JPanel main = new JPanel();
        JPanel panel00 = new JPanel();
        JPanel panel01 = new JPanel();
        main.setLayout(new GridLayout(0, 1));
        panel00.setLayout(new FlowLayout());
        panel00.setBorder(new TitledBorder("00"));
        panel01.setLayout(new FlowLayout());
        panel01.setBorder(new TitledBorder("01"));
        option01 = new JRadioButton("Background");
        option02 = new JRadioButton("Font");
        option03 = new JRadioButton("Harmonic");
        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(option01);
        group.add(option02);
        group.add(option03);
        panel00.add(option01);
        panel00.add(option02);
        panel00.add(option03);
        panel01.add(jScrollPane);
        main.add(chooser);
        main.add(panel00);
        main.add(panel01);
        frame.setContentPane(main);
        frame.setPreferredSize(new Dimension(600, 600));
        frame.pack();
        frame.setVisible(true);
        chooser.getSelectionModel().addChangeListener((var event) -> {
            ColorHarmonic colorHarmonic = new ColorHarmonic(chooser.getColor());
            if (option02.isSelected()) {
                fontColor = chooser.getColor();
                new Thread() {
                    public void run() {
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
                    }
                }.start();
            } else if (option01.isSelected()) {
                new Thread() {
                    public void run() {
                        panelColorsLeft.setBackground(chooser.getColor());
                        panelColorsRight.setBackground(chooser.getColor());
                    }
                }.start();
            } else if (option03.isSelected()) {
                Iterator<HarmonicColor> iterator = colorHarmonic.getIterator();
                new Thread() {
                    public void run() {
                        panelColorsLeft.removeAll();
                        panelColorsRight.removeAll();
                        while (iterator.hasNext()) {
                            HarmonicColor next = iterator.next();                            
                            if (next.getAngleChange() >= 0 && next.getAngleChange() <= 180) {
                                panelColorsLeft.add(getLabel(next));
                                panelColorsLeft.revalidate();
                            } 
                            if (next.getAngleChange() >= 0 && next.getAngleChange() >= 180){
                                panelColorsRight.add(getLabel(next));
                                panelColorsRight.revalidate();
                            }                                                                                                               
                            System.out.println(next.getAngle() + ":" + next.getAngleChange() + ":" + categorizer.getColorTemperature() + ":" + categorizer.getColorSide() + ":" + categorizer.getColorCategory());
                        }
                    }

                    private JLabel getLabel(HarmonicColor next) {
                        JLabel label = new JLabel();
                        label.setOpaque(true);
                        label.setPreferredSize(new Dimension(50, 50));
                        label.setForeground(fontColor);
                        label.setText(next.getAngle() + "");
                        label.setBackground(next.getColor());
                        label.setBorder(new LineBorder(Color.BLACK));
                        label.setHorizontalAlignment(SwingConstants.CENTER);
                        label.setVerticalAlignment(SwingConstants.CENTER);
                        categorizer.setHarmonicColor(next);
                        label.setToolTipText("<html>" + categorizer.getColorTemperature() + "<br/>" + categorizer.getColorSide() + " " + categorizer.getColorCategory() + "</html>");
                        return label;
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
