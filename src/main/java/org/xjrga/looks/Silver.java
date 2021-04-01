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
public class Silver extends MetalTheme {

    private final ColorUIResource primary1;
    private final ColorUIResource primary2;
    private final ColorUIResource primary3;
    private final ColorUIResource secondary1;
    private final ColorUIResource secondary2;
    private final ColorUIResource secondary3;
    private final Color COLOR00 = new Color(0xfbf9ff);
    private final Color COLOR10 = new Color(0xe2e0e6);
    private final Color COLOR20 = new Color(0xc8c7cc);
    private final Color COLOR30 = new Color(0xafaeb3);
    private final Color COLOR40 = new Color(0x969599);
    private final Color COLOR50 = new Color(0x7d7d80);
    private final Color COLOR60 = new Color(0x646466);
    private final Color COLOR70 = new Color(0x4b4b4d);
    private final Color COLOR80 = new Color(0x323233);
    private final Color COLOR90 = new Color(0x191919);
    private final Color COLOR100 = new Color(0x000000);
    private final FontUIResource fontUIResource;

    public Silver(Font font) {
        fontUIResource = new FontUIResource(font);
        secondary3 = new ColorUIResource(this.COLOR40);
        secondary2 = new ColorUIResource(this.COLOR40);
        primary3 = new ColorUIResource(this.COLOR20);
        primary1 = new ColorUIResource(this.COLOR00);
        secondary1 = new ColorUIResource(this.COLOR30);
        primary2 = new ColorUIResource(this.COLOR20);//        
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
    }

    @Override
    public String getName() {
        return "Silver";
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
