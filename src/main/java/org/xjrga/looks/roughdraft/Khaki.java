package org.xjrga.looks.roughdraft;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
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
public class Khaki extends MetalTheme {

    private final ColorUIResource primary1;
    private final ColorUIResource primary2;
    private final ColorUIResource primary3;
    private final ColorUIResource secondary1;
    private final ColorUIResource secondary2;
    private final ColorUIResource secondary3;
    public final Color A = new Color(0xac5c2c);
    public final Color B = new Color(0xc8a353);
    public final Color C = new Color(0x281924);
    public final Color D = new Color(0x897846);
    public final Color E = new Color(0x9ba068);
    public final Color F = new Color(0xe0cca8);
    private final FontUIResource fontUIResource;

    /**
     * Khaki constructor
     *
     * @param font the font
     * @see java.awt.Font
     */
    public Khaki(Font font) {
        fontUIResource = new FontUIResource(font);
        secondary3 = new ColorUIResource(this.F);
        secondary2 = new ColorUIResource(this.F);
        primary1 = new ColorUIResource(this.C);
        secondary1 = new ColorUIResource(this.C);
        primary2 = new ColorUIResource(this.B);
        primary3 = new ColorUIResource(this.E);
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);       
    }

    @Override
    public String getName() {
        return "Khaki";
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
