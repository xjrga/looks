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
import java.awt.GridLayout;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

public class Palettes extends AbstractColorChooserPanel {

    private final JPanel panelResult;
    private JTable table;
    private final DefaultTableModel model;
    private final ExportData export;
    

    public Palettes() {
        export = new ExportData();
        super.setLayout(new GridLayout(0, 1));
        panelResult = new JPanel();
        super.add(panelResult);
        table = new JTable();
        model = new TableModelColor();
        table.setModel(model);
        table.setDefaultRenderer(Color.class, new ColorRenderer());
        panelResult.add(new JScrollPane(table));
        table.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            if (table.getSelectedRow() > -1) {
                getColorSelectionModel().setSelectedColor((Color) table.getValueAt(table.getSelectedRow(), 0));
            }
        });
    }

    @Override
    public void buildChooser() {

    }

    @Override
    public void updateChooser() {
    }

    @Override
    public String getDisplayName() {
        return "Palettes";
    }

    @Override
    public Icon getSmallDisplayIcon() {
        return null;
    }

    @Override
    public Icon getLargeDisplayIcon() {
        return null;
    }

    public void addColorItem(Color selectedColor) {
        Vector row = new Vector();
        row.add(selectedColor);
        model.addRow(row);
        panelResult.revalidate();
        panelResult.repaint();
    }

    public void deleteAllColorItems() {
        model.setRowCount(0);
    }

    public void deleteSelectedColorItem() {
        model.removeRow(table.convertRowIndexToModel(table.getSelectedRow()));
    }

    public void exportColorItems() {
//        StringBuilder sb = new StringBuilder();
//        int rows = model.getRowCount();
//        int columns = model.getColumnCount();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                sb.append(model.getValueAt(i,j)); 
//                sb.append(",");
//            }
//            sb.setLength(sb.length()-1);
//            sb.append("\n");
//        }
//        System.out.println(sb.toString());
        export.writeTestDocument2(model);
    }
}
