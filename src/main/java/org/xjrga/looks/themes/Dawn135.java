package org.xjrga.looks.themes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;
import org.xjrga.looks.harmonic.ColorGenerator;
import org.xjrga.looks.harmonic.ColorHarmonic;

/**
 * This class is a theme for Java Look and Feel (also known as Metal)
 *
 * @author Jorge R Garcia de Alba
 */
public class Dawn135 extends MetalTheme {

    private final ColorUIResource white;
    private final ColorUIResource black;
    private final ColorUIResource primary1;
    private final ColorUIResource primary2;
    private final ColorUIResource primary3;
    private final ColorUIResource secondary1;
    private final ColorUIResource secondary2;
    private final ColorUIResource secondary3;
    private final FontUIResource fontUIResource;
    private final ColorUIResource focusColor;
    private final ColorUIResource desktopColor;
    private final ColorUIResource control;
    private final ColorUIResource controlShadow;
    private final ColorUIResource controlDarkShadow;
    private final ColorUIResource controlInfo;
    private final ColorUIResource controlHighlight;
    private final ColorUIResource controlDisabled;
    private final ColorUIResource primaryControl;
    private final ColorUIResource primaryControlShadow;
    private final ColorUIResource primaryControlDarkShadow;
    private final ColorUIResource primaryControlInfo;
    private final ColorUIResource primaryControlHighlight;
    private final ColorUIResource systemTextColor;
    private final ColorUIResource controlTextColor;
    private final ColorUIResource inactiveControlTextColor;
    private final ColorUIResource inactiveSystemTextColor;
    private final ColorUIResource userTextColor;
    private final ColorUIResource textHighlightColor;
    private final ColorUIResource highlightedTextColor;
    private final ColorUIResource windowBackground;
    private final ColorUIResource windowTitleBackground;
    private final ColorUIResource windowTitleForeground;
    private final ColorUIResource windowTitleInactiveBackground;
    private final ColorUIResource windowTitleInactiveForeground;
    private final ColorUIResource menuBackground;
    private final ColorUIResource menuForeground;
    private final ColorUIResource menuSelectedBackground;
    private final ColorUIResource menuSelectedForeground;
    private final ColorUIResource menuDisabledForeground;
    private final ColorUIResource separatorBackground;
    private final ColorUIResource separatorForeground;
    private final ColorUIResource acceleratorForeground;
    private final ColorUIResource acceleratorSelectedForeground;
    private final Color color01;
    private final Color color02;
    private final Color color03;
    private final Color color04;
    private final Color color05;
    private final Color color06;
    private final Color color07;
    private final Color color08;
    private final Color color09;
    private final ColorHarmonic colorHarmonic01;
    private final ColorGenerator colorGenerator;

    /**
     * Theme constructor
     *
     * @param font the font
     * @see java.awt.Font
     */
    public Dawn135(Font font) {
        fontUIResource = new FontUIResource(font);
        colorHarmonic01 = new ColorHarmonic(new Color(58, 127, 184));
        colorGenerator = new ColorGenerator(new Color(94, 98, 101));
        color01 = colorHarmonic01.getBaseColor();
        color02 = colorHarmonic01.getHarmonic135().getColor();;
        color03 = colorGenerator.generateMonochromeColorUsingBrightness(40);
        color04 = colorGenerator.generateMonochromeColorUsingBrightness(45);
        color05 = colorGenerator.generateMonochromeColorUsingBrightness(50);
        color06 = colorGenerator.generateMonochromeColorUsingBrightness(90);
        color07 = colorGenerator.generateMonochromeColorUsingBrightness(30);
        color08 = colorGenerator.generateMonochromeColorUsingBrightness(25);
        color09 = Color.WHITE;
        //
        primary1 = new ColorUIResource(color09);
        primary2 = new ColorUIResource(color09);
        primary3 = new ColorUIResource(color09);
        secondary1 = new ColorUIResource(color09);
        secondary2 = new ColorUIResource(color09);
        secondary3 = new ColorUIResource(color09);
        //color01
        focusColor = new ColorUIResource(color01);
        primaryControlShadow = new ColorUIResource(color01);
        primaryControlDarkShadow = new ColorUIResource(color01);
        menuSelectedBackground = new ColorUIResource(color01);
        separatorForeground = new ColorUIResource(color01);
        //color02
        primaryControl = new ColorUIResource(color02);
        textHighlightColor = new ColorUIResource(color02);
        windowTitleBackground = new ColorUIResource(color02);
        //color03
        controlHighlight = new ColorUIResource(color03);
        control = new ColorUIResource(color03);
        windowTitleInactiveBackground = new ColorUIResource(color03);
        menuBackground = new ColorUIResource(color03);
        separatorBackground = new ColorUIResource(color03);
        //color04
        controlShadow = new ColorUIResource(color04);
        //color05
        primaryControlHighlight = new ColorUIResource(color05);
        //color06
        systemTextColor = new ColorUIResource(color06);
        controlTextColor = new ColorUIResource(color06);
        inactiveSystemTextColor = new ColorUIResource(color06);
        userTextColor = new ColorUIResource(color06);
        highlightedTextColor = new ColorUIResource(color06);
        windowTitleForeground = new ColorUIResource(color06);
        windowTitleInactiveForeground = new ColorUIResource(color06);
        menuForeground = new ColorUIResource(color06);
        menuSelectedForeground = new ColorUIResource(color06);
        //color07
        controlDarkShadow = new ColorUIResource(color07);
        inactiveControlTextColor = new ColorUIResource(color07);
        menuDisabledForeground = new ColorUIResource(color07);
        //color08
        desktopColor = new ColorUIResource(color08);
        primaryControlInfo = new ColorUIResource(color08);
        windowBackground = new ColorUIResource(color08);
        //color09
        controlInfo = new ColorUIResource(color09);
        controlDisabled = new ColorUIResource(color09);
        acceleratorForeground = new ColorUIResource(color09);
        acceleratorSelectedForeground = new ColorUIResource(color09);
        white = new ColorUIResource(color09);
        black = new ColorUIResource(color09);
    }

    @Override
    public String getName() {
        return "Dawn 135";
    }

    @Override
    protected ColorUIResource getPrimary1() {
        return primary1;
    }

    @Override
    protected ColorUIResource getPrimary2() {
        return primary2;
    }

    @Override
    protected ColorUIResource getPrimary3() {
        return primary3;
    }

    @Override
    protected ColorUIResource getSecondary1() {
        return secondary1;
    }

    @Override
    protected ColorUIResource getSecondary2() {
        return secondary2;
    }

    @Override
    protected ColorUIResource getSecondary3() {
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

    @Override
    protected ColorUIResource getWhite() {
        return white;
    }

    @Override
    protected ColorUIResource getBlack() {
        return white;
    }

    @Override
    public ColorUIResource getFocusColor() {
        return focusColor;
    }

    @Override
    public ColorUIResource getDesktopColor() {
        return desktopColor;
    }

    @Override
    public ColorUIResource getControl() {
        return control;
    }

    @Override
    public ColorUIResource getControlShadow() {
        return controlShadow;
    }

    @Override
    public ColorUIResource getControlDarkShadow() {
        return controlDarkShadow;
    }

    @Override
    public ColorUIResource getControlInfo() {
        return controlInfo;
    }

    @Override
    public ColorUIResource getControlHighlight() {
        return controlHighlight;
    }

    @Override
    public ColorUIResource getControlDisabled() {
        return controlDisabled;
    }

    @Override
    public ColorUIResource getPrimaryControl() {
        return primaryControl;
    }

    @Override
    public ColorUIResource getPrimaryControlShadow() {
        return primaryControlShadow;
    }

    @Override
    public ColorUIResource getPrimaryControlDarkShadow() {
        return primaryControlDarkShadow;
    }

    @Override
    public ColorUIResource getPrimaryControlInfo() {
        return primaryControlInfo;
    }

    @Override
    public ColorUIResource getPrimaryControlHighlight() {
        return primaryControlHighlight;
    }

    @Override
    public ColorUIResource getSystemTextColor() {
        return systemTextColor;
    }

    @Override
    public ColorUIResource getControlTextColor() {
        return controlTextColor;
    }

    @Override
    public ColorUIResource getInactiveControlTextColor() {
        return inactiveControlTextColor;
    }

    @Override
    public ColorUIResource getInactiveSystemTextColor() {
        return inactiveSystemTextColor;
    }

    @Override
    public ColorUIResource getUserTextColor() {
        return userTextColor;
    }

    @Override
    public ColorUIResource getTextHighlightColor() {
        return textHighlightColor;
    }

    @Override
    public ColorUIResource getHighlightedTextColor() {
        return highlightedTextColor;
    }

    @Override
    public ColorUIResource getWindowBackground() {
        return windowBackground;
    }

    @Override
    public ColorUIResource getWindowTitleBackground() {
        return windowTitleBackground;
    }

    @Override
    public ColorUIResource getWindowTitleForeground() {
        return windowTitleForeground;
    }

    @Override
    public ColorUIResource getWindowTitleInactiveBackground() {
        return windowTitleInactiveBackground;
    }

    @Override
    public ColorUIResource getWindowTitleInactiveForeground() {
        return windowTitleInactiveForeground;
    }

    @Override
    public ColorUIResource getMenuBackground() {
        return menuBackground;
    }

    @Override
    public ColorUIResource getMenuForeground() {
        return menuForeground;
    }

    @Override
    public ColorUIResource getMenuSelectedBackground() {
        return menuSelectedBackground;
    }

    @Override
    public ColorUIResource getMenuSelectedForeground() {
        return menuSelectedForeground;
    }

    @Override
    public ColorUIResource getMenuDisabledForeground() {
        return menuDisabledForeground;
    }

    @Override
    public ColorUIResource getSeparatorBackground() {
        return separatorBackground;
    }

    @Override
    public ColorUIResource getSeparatorForeground() {
        return separatorForeground;
    }

    @Override
    public ColorUIResource getAcceleratorForeground() {
        return acceleratorForeground;
    }

    @Override
    public ColorUIResource getAcceleratorSelectedForeground() {
        return acceleratorSelectedForeground;
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        UIManager.put("TabbedPane.tabInsets", new Insets(1, 7, 7, 7));
        UIManager.put("ToolTip.foreground", white);
        UIManager.put("TabbedPane.selected", new ColorUIResource(color01));
        UIManager.put("TabbedPane.unselectedBackground", new ColorUIResource(color03));
    }

    void install() {
    }

    boolean isSystemTheme() {
        return false;
    }

}
