package io.github.xjrga.looks.roughdraft;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;

/**
 * This class is a metal theme
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Gold extends MetalTheme {

    private final ColorUIResource primary1;
    private final ColorUIResource primary2;
    private final ColorUIResource primary3;
    private final ColorUIResource secondary1;
    private final ColorUIResource secondary2;
    private final ColorUIResource secondary3;
    private final Color COLOR00 = new Color(0xffd242);
    private final Color COLOR10 = new Color(0xe6bd3c);
    private final Color COLOR20 = new Color(0xcca835);
    private final Color COLOR30 = new Color(0xb3932e);
    private final Color COLOR40 = new Color(0x997e28);
    private final Color COLOR50 = new Color(0x806921);
    private final Color COLOR60 = new Color(0x66541a);
    private final Color COLOR70 = new Color(0x4d3f14);
    private final Color COLOR80 = new Color(0x332a0d);
    private final Color COLOR90 = new Color(0x191507);
    private final Color COLOR100 = new Color(0x000000);
    private final FontUIResource fontUIResource;

    /**
     * Gold constructor
     *
     * @param font the font
     * @see java.awt.Font
     */
    public Gold(Font font) {
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
        return "Gold";
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
