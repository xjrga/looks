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
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class MyColorChooser {

    private final JFrame frame;

    public MyColorChooser() {
        frame = new JFrame("MyColorChooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JColorChooser chooser = new JColorChooser();
        GridLayout layout = new GridLayout(0, 2);
        //FlowLayout layout = new FlowLayout();
        JPanel panel = new JPanel();
        panel.setOpaque(true);
        panel.setPreferredSize(new Dimension(600, 200));
        panel.setLayout(layout);
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        JLabel label = new JLabel();
        label.setOpaque(true);
        panel.add(label);
        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        panel.add(label2);
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        panel.add(label3);
        JLabel label4 = new JLabel();
        label4.setOpaque(true);
        panel.add(label4);
        JLabel label5 = new JLabel();
        label5.setOpaque(true);
        panel.add(label5);
        chooser.setPreviewPanel(panel);
        frame.setContentPane(chooser);
        frame.setPreferredSize(new Dimension(600, 600));
        frame.pack();
        frame.setVisible(true);
        chooser.getSelectionModel().addChangeListener((ChangeEvent event) -> {
            ColorHarmonic colorHarmonic = new ColorHarmonic(chooser.getColor());
            label.setBackground(colorHarmonic.getBaseColor());
            label5.setBackground(colorHarmonic.getFirstTriadicColor());
            label3.setBackground(colorHarmonic.getFirstSplitComplementaryColor());
            label2.setBackground(colorHarmonic.getComplementaryColor());
            label4.setBackground(colorHarmonic.getSecondSplitComplementaryColor());
            colorHarmonic.getSecondTriadicColor();
            colorHarmonic.getThirdTetradicColor();
            colorHarmonic.getFirstTetradicColor();
            colorHarmonic.getSecondTetradicColor();
            colorHarmonic.getThirdTetradicColor();
            colorHarmonic.getFirstAnalogousColor();
            colorHarmonic.getSecondAnalogousColor();
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
        SwingUtilities.invokeLater(() -> {
            MyColorChooser myColorChooser = new MyColorChooser();
        });
    }

}
