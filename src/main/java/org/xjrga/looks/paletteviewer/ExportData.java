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

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class ExportData {

    private XMLStreamReader streamReader;
    private XMLInputFactory inputFactory;
    private XMLOutputFactory outputFactory;
    private XMLEventWriter eventWriter;
    private XMLStreamWriter streamWriter;
    private Reader reader;
    private XMLEventReader eventReader;

    public ExportData() {
        try {
            inputFactory = XMLInputFactory.newInstance();
            streamReader = inputFactory.createXMLStreamReader(new FileReader("test.xml"));
            outputFactory = XMLOutputFactory.newInstance();
            eventWriter = outputFactory.createXMLEventWriter(new FileWriter("test.xml"));
            streamWriter = outputFactory.createXMLStreamWriter(new FileWriter("test.xml"));
            reader = getXmlReader();
            while (eventReader.hasNext()) {
                XMLEvent event;
                eventReader = inputFactory.createXMLEventReader(reader);
                event = eventReader.nextEvent();
                if (event.getEventType() == XMLStreamConstants.START_ELEMENT) {
                    StartElement startElement = event.asStartElement();
                    System.out.println(startElement.getName().getLocalPart());
                }
            }
        } catch (Exception e) {
        }

    }

    public Reader getXmlReader() {
        return null;
    }

    public void writeTestDocument() {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        try {
            XMLEventWriter writer = factory.createXMLEventWriter(new FileWriter("test.xml"));
            XMLEvent event = eventFactory.createStartDocument();
            writer.add(event);
            event = eventFactory.createStartElement("", "", "colors");            
            writer.add(event);
            event = eventFactory.createStartElement("", "", "color");            
            writer.add(event);            
            event = eventFactory.createProcessingInstruction("color", "cyan");
            event =  eventFactory.createCharacters("cyan");            
            writer.add(event);
            //event = eventFactory.createNamespace("", "");
            //writer.add(event);
            //event = eventFactory.createAttribute("attribute", "value");
            //writer.add(event);
            event = eventFactory.createEndElement("", "", "color");
            writer.add(event);
            event = eventFactory.createEndElement("", "", "colors");
            writer.add(event);
            writer.flush();
            writer.close();
        } catch (XMLStreamException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
