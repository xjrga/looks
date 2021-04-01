package org.xjrga.looks;

import java.awt.Color;
import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;

/*
 * Pink Theme 
 * @author Jorge R Garcia de Alba     
 */
public class Pink extends MetalTheme {

    private final FontUIResource font;
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

    public Pink() {
        font = new FontUIResource(TheFonts.getUbuntuMono(Float.valueOf(13)));
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
        return font;
    }

    @Override
    public FontUIResource getSystemTextFont() {
        return font;
    }

    @Override
    public FontUIResource getUserTextFont() {
        return font;
    }

    @Override
    public FontUIResource getMenuTextFont() {
        return font;
    }

    @Override
    public FontUIResource getWindowTitleFont() {
        return font;
    }

    @Override
    public FontUIResource getSubTextFont() {
        return font;
    }

}
