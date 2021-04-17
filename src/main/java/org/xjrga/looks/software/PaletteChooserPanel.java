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
package org.xjrga.looks.software;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.InputStream;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

public class PaletteChooserPanel extends AbstractColorChooserPanel {

    private final JPanel panelResult;
    private JTable table;
    private final DefaultTableModel model;
    private final DataTransfer transfer;
    private JTextField textFieldPaletteName;
    private XmlToHtml xmlToHtml;
    private Color selectedColor;

    public PaletteChooserPanel() {
        xmlToHtml = new XmlToHtml();
        transfer = new DataTransfer();
        setLayout(new BorderLayout(10, 10));
        textFieldPaletteName = new JTextField();
        panelResult = new JPanel();
        textFieldPaletteName.setPreferredSize(new Dimension(375, 28));
        add(panelResult, BorderLayout.CENTER);
        JPanel textFieldPanel = new JPanel();
        textFieldPanel.add(new JLabel("Palette: "));
        textFieldPanel.add(textFieldPaletteName);
        add(textFieldPanel, BorderLayout.SOUTH);
        table = new JTable();
        model = new TableModelColor();
        table.setModel(model);
        table.setDefaultRenderer(Color.class, new ColorRenderer());
        panelResult.add(new JScrollPane(table));
        table.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            if (table.getSelectedRow() > -1) {
                selectedColor = (Color) table.getValueAt(table.getSelectedRow(), 0);
                getColorSelectionModel().setSelectedColor(selectedColor);
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
        return "Palette";
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

    public void clearAllColorItems() {
        model.setRowCount(0);
    }

    public void deleteSelectedColorItem() {
        model.removeRow(table.convertRowIndexToModel(table.getSelectedRow()));
    }

    public void exportColorItems(File selectedFile) {
        //path
        String selectedFileParentPath = selectedFile.getParent();
        //name.xml or name
        String selectedFileName = selectedFile.getName();
        //name
        String selectedFileNameNoExtension = XmlToHtml.trimFileNameExtension(selectedFileName);
        //name.xml
        String xmlFileName = new StringBuilder(selectedFileNameNoExtension).append(".xml").toString();
        //name.html
        String htmlFileName = new StringBuilder(selectedFileNameNoExtension).append(".html").toString();
        //path/name.xml
        String selectedFilePath = new StringBuilder(selectedFileParentPath).append(File.separator).append(xmlFileName).toString();
        //
        transfer.exportColors(textFieldPaletteName.getText(), model, selectedFilePath);
        InputStream xslStream = getClass().getResourceAsStream("/style.xsl");
        File xmlFile = new File(selectedFileParentPath, xmlFileName);
        File htmlFile = new File(selectedFileParentPath, htmlFileName);
        xmlToHtml.setXmlFile(xmlFile);
        xmlToHtml.setXslStream(xslStream);
        xmlToHtml.setHtmlFile(htmlFile);
        xmlToHtml.transform();
    }

    public void importColorItems(String path) {
        transfer.importColors(model, path);
        textFieldPaletteName.setText(transfer.getPaletteName());
    }

    void clearPaletteName() {
        textFieldPaletteName.setText("");
    }
}
