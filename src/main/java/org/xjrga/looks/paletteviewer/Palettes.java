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
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Palettes extends AbstractColorChooserPanel {

    private HashMap<Integer, JButton> map;
    private JPanel panelResult;
    private JTable table;
    private DefaultTableModel model;

    public Palettes() {
        map = new HashMap();
        panelResult = new JPanel();
        add(panelResult);
        table = new JTable();
        model = new TableModelColor();
        table.setModel(model);
        table.setDefaultRenderer(Color.class, new ColorRenderer());
        panelResult.add(new JScrollPane(table));
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (table.getSelectedRow() > -1) {
                    // print first column value from selected row
                    //System.out.println(table.getValueAt(table.getSelectedRow(), 0).toString());
                    getColorSelectionModel().setSelectedColor((Color)table.getValueAt(table.getSelectedRow(), 0));
                }
            }
        });

    }

    @Override
    public void buildChooser() {
        setLayout(new GridLayout(0, 1));
        //addButton("Red", Color.red);
        //addButton("Green", Color.green);
        //addButton("Blue", Color.blue);
        //addButton("Black", Color.black);
        //addButton("Gray", Color.gray);
        //addButton("White", Color.white);

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
        panelResult.add(button);
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

    public void addNewItem(Color selectedColor) {
        //addButton(selectedColor.getRGB(), selectedColor);
        Vector row = new Vector();
        row.add(selectedColor);
        model.addRow(row);
        System.out.println(model.getRowCount());
        panelResult.revalidate();
        panelResult.repaint();
    }
}
