/*
 * Copyright (C) 2021 Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
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
package org.xjrga.looks.paletteviewer;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.colorchooser.AbstractColorChooserPanel;

public class Palettes extends AbstractColorChooserPanel {

    private HashMap<Integer, JButton> map;
    private JPanel panel00;
    private JPanel panel01;

    public Palettes() {
        map = new HashMap();
        panel00 = new JPanel();
        panel01 = new JPanel();

    }

    public void buildChooser() {
        setLayout(new GridLayout(0, 1));
        //addButton("Red", Color.red);
        //addButton("Green", Color.green);
        //addButton("Blue", Color.blue);
        //addButton("Black", Color.black);
        //addButton("Gray", Color.gray);
        //addButton("White", Color.white);
        add(panel00);
        add(panel01);
        JButton buttonAdd = new JButton("+");
        panel00.add(buttonAdd);
        buttonAdd.addActionListener(e -> event_addNewColor());
    }

    public void updateChooser() {
    }

    public String getDisplayName() {
        return "Palettes";
    }

    public Icon getSmallDisplayIcon() {
        return null;
    }

    public Icon getLargeDisplayIcon() {
        return null;
    }

    public void addButton(int rgb, Color color) {
        JButton button = new JButton();
        map.put(rgb, button);
        button.setBackground(color);
        button.setAction(setColorAction);
        panel01.add(button);
        //add(button);

    }

    public void removeButton(Integer rgb) {
        map.forEach((k, v) -> {
            if (k == rgb) {
                this.remove(v);
            }
        }
        );
    }

    @Override
    public void add(PopupMenu popup) {
        super.add(popup); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component add(String name, Component comp) {
        return super.add(name, comp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component add(Component comp) {
        return super.add(comp); //To change body of generated methods, choose Tools | Templates.
    }

    Action setColorAction = new AbstractAction() {
        public void actionPerformed(ActionEvent evt) {
            JButton button = (JButton) evt.getSource();
            getColorSelectionModel().setSelectedColor(button.getBackground());            
        }
    };

    private void event_addNewColor() {        
        Color selectedColor = getColorSelectionModel().getSelectedColor();
        addButton(selectedColor.getRGB(),selectedColor);
        panel01.revalidate();
        panel01.repaint();
    }
}
