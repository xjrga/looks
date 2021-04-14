package org.xjrga.looks.harmonic;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class generates a Font object from a true type font file
 *
 * @author Jorge R Garcia de Alba
 */
public class TheFont {

    private Font font;

    /**
     *
     * @param path Path to truetype font
     * @param size Font size
     */
    public TheFont(String path, float size) {
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(size);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(TheFont.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @return A Font object
     * @see java.awt.Font
     */
    public Font getFont() {
        return font;
    }

}
