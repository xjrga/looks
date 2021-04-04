package org.xjrga.looks;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;

/**
 * This class is a theme for Java Look and Feel (also known as Metal)
 *
 * @author Jorge R Garcia de Alba 
 */
public class MonochromeGreen extends MetalTheme {

    private final ColorUIResource primary1;
    private final ColorUIResource primary2;
    private final ColorUIResource primary3;
    private final ColorUIResource secondary1;
    private final ColorUIResource secondary2;
    private final ColorUIResource secondary3;
    private ColorTones colorTones = null;
    private final FontUIResource fontUIResource;

    /**
     * MonochromeGreen constructor
     *
     * @param font the font
     * @see java.awt.Font
     */
    public MonochromeGreen(Font font) {
        colorTones = new ColorTones(new Color(112, 173, 157));
        fontUIResource = new FontUIResource(font);
        primary1 = new ColorUIResource(colorTones.lighterBy10());
        primary2 = new ColorUIResource(colorTones.lighterBy30());
        primary3 = new ColorUIResource(colorTones.lighterBy40());
        secondary3 = new ColorUIResource(colorTones.getColor());
        secondary1 = new ColorUIResource(colorTones.getColor());
        secondary2 = new ColorUIResource(colorTones.lighterBy20());
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
        UIManager.put("TabbedPane.selected", colorTones.lighterBy30());
        UIManager.put("TabbedPane.unselectedBackground",colorTones.getColor());
        UIManager.put("TabbedPane.darkShadow", colorTones.darkerBy20());
        UIManager.put("Table.gridColor", colorTones.getColor());
        UIManager.put("ProgressBar.border", BorderFactory.createLineBorder(colorTones.darkerBy20()));
        UIManager.put("TabbedPane.tabInsets", new Insets(1, 10, 8, 10));
        //If you enable this it will look a bit better but it affects 
        //other themes
    }

    @Override
    public String getName() {
        return "Monochrome Green";
    }

    @Override
    public ColorUIResource getPrimary1() {
        return primary1;
    }

    @Override
    public ColorUIResource getPrimary2() {
        return primary2;
    }

    @Override
    public ColorUIResource getPrimary3() {
        return primary3;
    }

    @Override
    public ColorUIResource getSecondary1() {
        return secondary1;
    }

    @Override
    public ColorUIResource getSecondary2() {
        return secondary2;
    }

    @Override
    public ColorUIResource getSecondary3() {
        return secondary3;
    }
    
    @Override
    protected ColorUIResource getWhite() {
        //component outlines and backgrounds
        return new ColorUIResource(colorTones.darkerBy50());
    }

    @Override
    protected ColorUIResource getBlack() {
        //text
        return new ColorUIResource(colorTones.getWhite());
    }

    @Override
    public FontUIResource getControlTextFont() {
        return fontUIResource;
    }

    @Override
    public FontUIResource getSystemTextFont() {
        return fontUIResource;
    }

    @Override
    public FontUIResource getUserTextFont() {
        return fontUIResource;
    }

    @Override
    public FontUIResource getMenuTextFont() {
        return fontUIResource;
    }

    @Override
    public FontUIResource getWindowTitleFont() {
        return fontUIResource;
    }

    @Override
    public FontUIResource getSubTextFont() {
        return fontUIResource;
    }

}
