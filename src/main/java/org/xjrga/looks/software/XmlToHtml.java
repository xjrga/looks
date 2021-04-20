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
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * This class generates a html document from xml document
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class XmlToHtml {

    private File xml;
    private InputStream xsl;
    private File html;

    /**
     * Constructs XmlToHtml instance
     */
    public XmlToHtml() {

    }

    private void transformXmlDoc(File xml, InputStream xsl, File html) {
        try {
            TransformerFactory tfactory = TransformerFactory.newInstance();
            Transformer transformer = tfactory.newTransformer(new StreamSource(xsl));
            transformer.transform(new StreamSource(xml), new StreamResult(html));
        } catch (Exception ex) {
            Logger.getLogger(XmlToHtml.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @param fileName
     * @return
     */
    public static String trimFileNameExtension(String fileName) {

        String noExtensionFileName = "";

        if (fileName.contains(".")) {
            noExtensionFileName = fileName.substring(0, fileName.lastIndexOf('.'));
        } else {
            noExtensionFileName = fileName;
        }
        return noExtensionFileName;
    }

    /**
     *
     * @param xml
     */
    public void setXmlFile(File xml) {
        this.xml = xml;
    }

    /**
     *
     * @param xsl
     */
    public void setXslStream(InputStream xsl) {
        this.xsl = xsl;
    }

    /**
     *
     * @param html
     */
    public void setHtmlFile(File html) {
        this.html = html;
    }

    /**
     * Transform xml document to html document
     */
    public void transform() {
        if (xml != null && xsl != null && html != null) {
            transformXmlDoc(xml, xsl, html);
        }
    }
}
