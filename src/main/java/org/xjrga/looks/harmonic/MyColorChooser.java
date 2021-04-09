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

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author Jorge R Garcia de Alba <jorge.r.garciadealba@gmail.com>
 */
public class MyColorChooser {

    private final JFrame frame;
    private final JRadioButton option01;
    private final JRadioButton option02;

    public MyColorChooser() {
        frame = new JFrame("MyColorChooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JColorChooser chooser = new JColorChooser();
        FlowLayout layout = new FlowLayout();
        JPanel panel = new JPanel();
        panel.setOpaque(true);
        panel.setPreferredSize(new Dimension(600, 200));
        panel.setLayout(layout);
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel.add(new JButton("Hello!"));
        JScrollPane jScrollPane = new JScrollPane(panel);
        jScrollPane.setViewportView(panel);
        jScrollPane.setPreferredSize(new Dimension(590, 300));
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
        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(option01);
        group.add(option02);
        panel00.add(option01);
        panel00.add(option02);
        panel01.add(jScrollPane);
        main.add(chooser);
        main.add(panel00);
        main.add(panel01);
        frame.setContentPane(main);
        frame.setPreferredSize(new Dimension(600, 600));
        frame.pack();
        frame.setVisible(true);
        chooser.getSelectionModel().addChangeListener((ChangeEvent event) -> {
            ColorHarmonic colorHarmonic = new ColorHarmonic(chooser.getColor());
            if (option01.isSelected()) {
                panel.setBackground(chooser.getColor());
            } else {
                Iterator<HarmonicColor> iterator = colorHarmonic.getIterator();
                new Thread() {
                    public void run() {
                        panel.removeAll();
                        while (iterator.hasNext()) {
                            HarmonicColor next = iterator.next();
                            JLabel lab = new JLabel();
                            lab.setOpaque(true);
                            lab.setText(next.getAngle() + "");
                            lab.setBackground(next.getColor());
                            panel.add(lab);
                            System.out.println(next.getName() + ":" + next.getAngle());
                            //panel.setBackground(next.getBaseColor());
                            panel.revalidate();
//                        try {
//                            Thread.sleep(500);
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(MyColorChooser.class.getName()).log(Level.SEVERE, null, ex);
//                        }
                        }
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

        option01.addActionListener(e -> event_radiobutton_option01());
        option02.addActionListener(e -> event_radiobutton_option02());
    }

    private void event_radiobutton_option01() {

        System.out.println(option01.isSelected());
    }

    private void event_radiobutton_option02() {

        System.out.println(option02.isSelected());
    }

    public void exit() {
        frame.dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyColorChooser myColorChooser = new MyColorChooser();
        });
    }

}
