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

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class DataTransfer {

    private XMLInputFactory inputFactory;
    private XMLEventReader eventReader;
    private int red;
    private int green;
    private int blue;
    private String hexcode;
    private String startEvent;
    private String endEvent;
    private String name = "Palette Name";

    public DataTransfer() {
        inputFactory = XMLInputFactory.newInstance();
    }

    public void exportColors(String name, DefaultTableModel model, String path) {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        try {
            XMLEventWriter writer = factory.createXMLEventWriter(new FileWriter(path));
            XMLEvent event = eventFactory.createStartDocument();
            writer.add(event);
            event = eventFactory.createSpace("\n");
            writer.add(event);
            event = eventFactory.createStartElement("", "", "palette");
            writer.add(event);
            event = eventFactory.createAttribute("xmlns:xsd", "http://www.w3.org/2001/XMLSchema-instance");
            writer.add(event);
            event = eventFactory.createAttribute("xsd:noNamespaceSchemaLocation", "palette.xsd");
            writer.add(event);
            event = eventFactory.createSpace("\n");
            writer.add(event);
            event = eventFactory.createStartElement("", "", "name");
            writer.add(event);
            event = eventFactory.createCharacters(name);
            writer.add(event);
            event = eventFactory.createEndElement("", "", "name");
            writer.add(event);
            event = eventFactory.createSpace("\n");
            writer.add(event);
            int rows = model.getRowCount();
            int columns = model.getColumnCount();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    Color color = (Color) model.getValueAt(i, j);
                    event = eventFactory.createStartElement("", "", "color");
                    writer.add(event);
                    event = eventFactory.createSpace("\n");
                    writer.add(event);
                    event = eventFactory.createStartElement("", "", "red");
                    writer.add(event);
                    event = eventFactory.createCharacters(String.valueOf(color.getRed()));
                    writer.add(event);
                    event = eventFactory.createEndElement("", "", "red");
                    writer.add(event);
                    event = eventFactory.createSpace("\n");
                    writer.add(event);
                    event = eventFactory.createStartElement("", "", "green");
                    writer.add(event);
                    event = eventFactory.createCharacters(String.valueOf(color.getGreen()));
                    writer.add(event);
                    event = eventFactory.createEndElement("", "", "green");
                    writer.add(event);
                    event = eventFactory.createSpace("\n");
                    writer.add(event);
                    event = eventFactory.createStartElement("", "", "blue");
                    writer.add(event);
                    event = eventFactory.createCharacters(String.valueOf(color.getBlue()));
                    writer.add(event);
                    event = eventFactory.createEndElement("", "", "blue");
                    writer.add(event);
                    event = eventFactory.createSpace("\n");
                    writer.add(event);
                    event = eventFactory.createStartElement("", "", "hexcode");
                    writer.add(event);
                    event = eventFactory.createCharacters(getHexColorValue(color));
                    writer.add(event);
                    event = eventFactory.createEndElement("", "", "hexcode");
                    writer.add(event);
                    event = eventFactory.createSpace("\n");
                    writer.add(event);
                    event = eventFactory.createEndElement("", "", "color");
                    writer.add(event);
                    event = eventFactory.createSpace("\n");
                    writer.add(event);
                }
            }
            event = eventFactory.createEndElement("", "", "palette");
            writer.add(event);
            event = eventFactory.createSpace("\n");
            writer.add(event);
            event = eventFactory.createEndDocument();
            writer.add(event);
            writer.flush();
            writer.close();
        } catch (XMLStreamException e) {
        } catch (IOException e) {
        }
    }

    public void importColors(DefaultTableModel model, String path) {
        try {
            File file = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            eventReader = inputFactory.createXMLEventReader(reader);
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                switch (event.getEventType()) {
                    case XMLEvent.START_ELEMENT:
                        startEvent = event.asStartElement().getName().getLocalPart();
                        break;
                    case XMLEvent.CHARACTERS:
                        String data = event.asCharacters().getData().strip();
                        if (!data.isBlank()) {
                            switch (startEvent) {
                                case "name":
                                    name = data;
                                    break;
                                case "red":
                                    red = Integer.valueOf(data);
                                    break;
                                case "green":
                                    green = Integer.valueOf(data);
                                    break;
                                case "blue":
                                    blue = Integer.valueOf(data);
                                    break;
                                case "hexcode":
                                    hexcode = String.valueOf(data);
                                    break;
                            }
                        }
                        break;
                    case XMLEvent.END_ELEMENT:
                        endEvent = event.asEndElement().getName().getLocalPart();
                        switch (endEvent) {
                            case "color":
                                Vector row = new Vector();
                                row.add(new Color(red, green, blue));
                                model.addRow(row);
                                break;
                        }
                        break;
                }
            }
            reader.close();
        } catch (Exception ex) {
            Logger.getLogger(DataTransfer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String getHexColorValue(Color color) {
        return Integer.toHexString(color.getRGB() & 0x00ffffff);
    }

    public String getPaletteName() {
        return name;
    }
}
