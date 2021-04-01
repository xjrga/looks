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
public class Green extends MetalTheme {

    private final ColorUIResource primary1;
    private final ColorUIResource primary2;
    private final ColorUIResource primary3;
    private final ColorUIResource secondary1;
    private final ColorUIResource secondary2;
    private final ColorUIResource secondary3;
    public final Color LIGHTGREEN = new Color(0x87bc92);
    public final Color MEDIUMGREEN = new Color(0x5c8c4e);
    public final Color YELLOW = new Color(0xdcad3b);
    public final Color BLUE = new Color(0x2e88aa);
    public final Color DARKGREEN = new Color(0x3d4335);
    private final FontUIResource fontUIResource;

    public Green(Font font) {
        fontUIResource = new FontUIResource(font);
        secondary2 = new ColorUIResource(this.LIGHTGREEN);
        primary1 = new ColorUIResource(this.DARKGREEN);
        secondary1 = new ColorUIResource(this.MEDIUMGREEN);
        primary2 = new ColorUIResource(this.BLUE);
        primary3 = new ColorUIResource(this.YELLOW);
        secondary3 = new ColorUIResource(this.LIGHTGREEN);
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
    }

    @Override
    public String getName() {
        return "Green";
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
