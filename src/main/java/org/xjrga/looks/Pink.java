package org.xjrga.looks;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;

/**
 * This class is a theme for Java Look and Feel (also known as Metal)
 *
 * @author Jorge R Garcia de Alba 
 */
public class Pink extends MetalTheme {

    private final ColorUIResource primary1;
    private final ColorUIResource primary2;
    private final ColorUIResource primary3;
    private final ColorUIResource secondary1;
    private final ColorUIResource secondary2;
    private final ColorUIResource secondary3;
    private final Color GREEN = new Color(0x5e840a);
    private final Color PINK = new Color(0xf9ddd9);
    private final Color LIGHTBLUE = new Color(0xb6dada);
    private final Color MEDIUMBLUE = new Color(0x65c4ca);
    private final Color DARKBLUE = new Color(0x2b7bb8);
    private final FontUIResource fontUIResource;

    /**
     * Pink constructor
     *
     * @param font the font
     * @see java.awt.Font
     */
    public Pink(Font font) {
        fontUIResource = new FontUIResource(font);
        secondary3 = new ColorUIResource(this.PINK);
        secondary2 = new ColorUIResource(this.PINK);
        primary1 = new ColorUIResource(this.GREEN);
        secondary1 = new ColorUIResource(this.GREEN);
        primary3 = new ColorUIResource(this.MEDIUMBLUE);
        primary2 = new ColorUIResource(this.LIGHTBLUE);
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
    }

    @Override
    public String getName() {
        return "Pink";
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
