package io.github.xjrga.looks.roughdraft;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;
import io.github.xjrga.looks.harmonic.Color_tones;

/**
 * This class is a metal theme
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Monochrome_green extends MetalTheme {

    private final ColorUIResource primary1;
    private final ColorUIResource primary2;
    private final ColorUIResource primary3;
    private final ColorUIResource secondary1;
    private final ColorUIResource secondary2;
    private final ColorUIResource secondary3;
    private Color_tones colorTones = null;
    private final FontUIResource fontUIResource;

    /**
     * MonochromeGreen constructor
     *
     * @param font the font
     * @see java.awt.Font
     */
    public Monochrome_green(Font font) {
        colorTones = new Color_tones(new Color(112, 173, 157));
        fontUIResource = new FontUIResource(font);
        primary1 = new ColorUIResource(colorTones.lighter_by_10());
        primary2 = new ColorUIResource(colorTones.lighter_by_30());
        primary3 = new ColorUIResource(colorTones.lighter_by_40());
        secondary3 = new ColorUIResource(colorTones.get_color());
        secondary1 = new ColorUIResource(colorTones.get_color());
        secondary2 = new ColorUIResource(colorTones.lighter_by_20());
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
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
        return new ColorUIResource(colorTones.darker_by_50());
    }

    @Override
    protected ColorUIResource getBlack() {
        //text
        return new ColorUIResource(colorTones.get_white());
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
