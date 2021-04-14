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

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class XmlToHtml {

    private String xml;
    private String xsl;
    private String html;

    private void transformXmlDoc(String xml, String xsl, String file) {
        try {
            TransformerFactory tfactory = TransformerFactory.newInstance();
            Transformer transformer = tfactory.newTransformer(new StreamSource(xsl));
            transformer.transform(new StreamSource(xml), new StreamResult(new File(file)));
        } catch (Exception ex) {
            Logger.getLogger(XmlToHtml.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        XmlToHtml xmlToHtml = new XmlToHtml();
        xmlToHtml.setXmlDoc("/home/jr/Project/Queued/Looks/palettes/raphael_01.xml");
        xmlToHtml.setXslDoc("/home/jr/Project/Queued/Looks/src/main/resources/style.xsl");
        xmlToHtml.setHtmlFile("palete.html");
        xmlToHtml.transform();
    }

    public void setXmlDoc(String xml) {
        this.xml = xml;
    }

    public void setXslDoc(String xsl) {
        this.xsl = xsl;
    }

    public void setHtmlFile(String html) {
        this.html = html;
    }

    private void transform() {
        transformXmlDoc(xml, xsl, html);
    }
}