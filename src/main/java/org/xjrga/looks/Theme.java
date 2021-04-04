/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xjrga.looks;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;

/**
 *
 * @author jr
 */
public class Theme extends MetalTheme {

    // Contants identifying the various Fonts that are Theme can support
    static final int CONTROL_TEXT_FONT = 0;
    static final int SYSTEM_TEXT_FONT = 1;
    static final int USER_TEXT_FONT = 2;
    static final int MENU_TEXT_FONT = 3;
    static final int WINDOW_TITLE_FONT = 4;
    static final int SUB_TEXT_FONT = 5;

    static ColorUIResource white = new ColorUIResource(255, 255, 255);
    private static final ColorUIResource black = new ColorUIResource(0, 0, 0);
    
    private final ColorUIResource primary1;
    private final ColorUIResource primary2;
    private final ColorUIResource primary3;
    private final ColorUIResource secondary1;
    private final ColorUIResource secondary2;
    private final ColorUIResource secondary3;
    private ColorTones colorTone01 = null;
    private ColorTones colorTone02 = null;
    private ColorTones colorTone03 = null;
    private final FontUIResource fontUIResource;

    public Theme(Font font) {
        colorTone01 = new ColorTones(new Color(94, 98, 101));
        colorTone02 = new ColorTones(new Color(58, 127, 184));
        colorTone03 = new ColorTones(new Color(129, 116, 2));
        fontUIResource = new FontUIResource(font);
        primary1 = new ColorUIResource(colorTone02.darkerBy10());
        primary2 = new ColorUIResource(colorTone02.lighterBy10());
        primary3 = new ColorUIResource(colorTone03.getColor());            
        secondary1 = new ColorUIResource(colorTone01.getColor());
        secondary2 = new ColorUIResource(colorTone01.lighterBy20());
        secondary3 = new ColorUIResource(colorTone01.getColor()); 
    }

    /**
     * Returns the name of this theme.
     *
     * @return the name of this theme
     */
    @Override
    public String getName() {
        return "Theme";
    }

    /**
     * Returns the primary 1 color.
     *
     * @return the primary 1 color
     */
    @Override
    protected ColorUIResource getPrimary1() {
        // these are blue in Metal Default Theme
        return primary1;
    }

    /**
     * Returns the primary 2 color.
     *
     * @return the primary 2 color
     */
    @Override
    protected ColorUIResource getPrimary2() {
        return primary2;
    }

    /**
     * Returns the primary 3 color.
     *
     * @return the primary 3 color
     */
    @Override
    protected ColorUIResource getPrimary3() {
        return primary3;
    }

    /**
     * Returns the secondary 1 color.
     *
     * @return the secondary 1 color
     */
    @Override
    protected ColorUIResource getSecondary1() {
        // these are gray in Metal Default Theme
        return secondary1;
    }

    /**
     * Returns the secondary 2 color.
     *
     * @return the secondary 2 color
     */
    @Override
    protected ColorUIResource getSecondary2() {
        return secondary2;
    }

    /**
     * Returns the secondary 3 color.
     *
     * @return the secondary 3 color
     */
    @Override
    protected ColorUIResource getSecondary3() {
        return secondary3;
    }

    /**
     * Returns the control text font.
     *
     * @return the control text font
     */
    @Override
    public FontUIResource getControlTextFont() {
        return fontUIResource;
    }

    /**
     * Returns the system text font.
     *
     * @return the system text font
     */
    @Override
    public FontUIResource getSystemTextFont() {
        return fontUIResource;
    }

    /**
     * Returns the user text font.
     *
     * @return the user text font
     */
    @Override
    public FontUIResource getUserTextFont() {
        return fontUIResource;
    }

    /**
     * Returns the menu text font.
     *
     * @return the menu text font
     */
    @Override
    public FontUIResource getMenuTextFont() {
        return fontUIResource;
    }

    /**
     * Returns the window title font.
     *
     * @return the window title font
     */
    @Override
    public FontUIResource getWindowTitleFont() {
        return fontUIResource;
    }

    /**
     * Returns the sub-text font.
     *
     * @return the sub-text font
     */
    @Override
    public FontUIResource getSubTextFont() {
        return fontUIResource;
    }

    /**
     * Returns the white color. This returns opaque white ({@code 0xFFFFFFFF}).
     *
     * @return the white color
     */
    @Override
    protected ColorUIResource getWhite() {
        return white;
    }

    /**
     * Returns the black color. This returns opaque black ({@code 0xFF000000}).
     *
     * @return the black color
     */
    @Override
    protected ColorUIResource getBlack() {
        return black;
    }

    /**
     * Returns the focus color. This returns the value of {@code getPrimary2()}.
     *
     * @return the focus color
     */
    @Override
    public ColorUIResource getFocusColor() {
        return getPrimary2();
    }

    /**
     * Returns the desktop color. This returns the value of
     * {@code getPrimary2()}.
     *
     * @return the desktop color
     */
    @Override
    public ColorUIResource getDesktopColor() {
        return getPrimary2();
    }

    /**
     * Returns the control color. This returns the value of
     * {@code getSecondary3()}.
     *
     * @return the control color
     */
    @Override
    public ColorUIResource getControl() {
        return getSecondary3();
    }

    /**
     * Returns the control shadow color. This returns the value of
     * {@code getSecondary2()}.
     *
     * @return the control shadow color
     */
    @Override
    public ColorUIResource getControlShadow() {
        return getSecondary2();
    }

    /**
     * Returns the control dark shadow color. This returns the value of
     * {@code getSecondary1()}.
     *
     * @return the control dark shadow color
     */
    public ColorUIResource getControlDarkShadow() {
        return getSecondary1();
    }

    /**
     * Returns the control info color. This returns the value of
     * {@code getBlack()}.
     *
     * @return the control info color
     */
    @Override
    public ColorUIResource getControlInfo() {
        return getBlack();
    }

    /**
     * Returns the control highlight color. This returns the value of
     * {@code getWhite()}.
     *
     * @return the control highlight color
     */
    @Override
    public ColorUIResource getControlHighlight() {
        return getWhite();
    }

    /**
     * Returns the control disabled color. This returns the value of
     * {@code getSecondary2()}.
     *
     * @return the control disabled color
     */
    @Override
    public ColorUIResource getControlDisabled() {
        return getSecondary2();
    }

    /**
     * Returns the primary control color. This returns the value of
     * {@code getPrimary3()}.
     *
     * @return the primary control color
     */
    @Override
    public ColorUIResource getPrimaryControl() {
        return getPrimary3();
    }

    /**
     * Returns the primary control shadow color. This returns the value of
     * {@code getPrimary2()}.
     *
     * @return the primary control shadow color
     */
    @Override
    public ColorUIResource getPrimaryControlShadow() {
        return getPrimary2();
    }

    /**
     * Returns the primary control dark shadow color. This returns the value of
     * {@code getPrimary1()}.
     *
     * @return the primary control dark shadow color
     */
    @Override
    public ColorUIResource getPrimaryControlDarkShadow() {
        return getPrimary1();
    }

    /**
     * Returns the primary control info color. This returns the value of
     * {@code getBlack()}.
     *
     * @return the primary control info color
     */
    @Override
    public ColorUIResource getPrimaryControlInfo() {
        return getBlack();
    }

    /**
     * Returns the primary control highlight color. This returns the value of
     * {@code getWhite()}.
     *
     * @return the primary control highlight color
     */
    @Override
    public ColorUIResource getPrimaryControlHighlight() {
        return getWhite();
    }

    /**
     * Returns the system text color. This returns the value of
     * {@code getBlack()}.
     *
     * @return the system text color
     */
    public ColorUIResource getSystemTextColor() {
        return getBlack();
    }

    /**
     * Returns the control text color. This returns the value of
     * {@code getControlInfo()}.
     *
     * @return the control text color
     */
    @Override
    public ColorUIResource getControlTextColor() {
        return getControlInfo();
    }

    /**
     * Returns the inactive control text color. This returns the value of
     * {@code getControlDisabled()}.
     *
     * @return the inactive control text color
     */
    public ColorUIResource getInactiveControlTextColor() {
        return getControlDisabled();
    }

    /**
     * Returns the inactive system text color. This returns the value of
     * {@code getSecondary2()}.
     *
     * @return the inactive system text color
     */
    public ColorUIResource getInactiveSystemTextColor() {
        return getSecondary2();
    }

    /**
     * Returns the user text color. This returns the value of
     * {@code getBlack()}.
     *
     * @return the user text color
     */
    @Override
    public ColorUIResource getUserTextColor() {
        return getBlack();
    }

    /**
     * Returns the text highlight color. This returns the value of
     * {@code getPrimary3()}.
     *
     * @return the text highlight color
     */
    public ColorUIResource getTextHighlightColor() {
        return getPrimary3();
    }

    /**
     * Returns the highlighted text color. This returns the value of
     * {@code getControlTextColor()}.
     *
     * @return the highlighted text color
     */
    public ColorUIResource getHighlightedTextColor() {
        return getControlTextColor();
    }

    /**
     * Returns the window background color. This returns the value of
     * {@code getWhite()}.
     *
     * @return the window background color
     */
    public ColorUIResource getWindowBackground() {
        return getWhite();
    }

    /**
     * Returns the window title background color. This returns the value of
     * {@code getPrimary3()}.
     *
     * @return the window title background color
     */
    public ColorUIResource getWindowTitleBackground() {
        return getPrimary3();
    }

    /**
     * Returns the window title foreground color. This returns the value of
     * {@code getBlack()}.
     *
     * @return the window title foreground color
     */
    public ColorUIResource getWindowTitleForeground() {
        return getBlack();
    }

    /**
     * Returns the window title inactive background color. This returns the
     * value of {@code getSecondary3()}.
     *
     * @return the window title inactive background color
     */
    public ColorUIResource getWindowTitleInactiveBackground() {
        return getSecondary3();
    }

    /**
     * Returns the window title inactive foreground color. This returns the
     * value of {@code getBlack()}.
     *
     * @return the window title inactive foreground color
     */
    public ColorUIResource getWindowTitleInactiveForeground() {
        return getBlack();
    }

    /**
     * Returns the menu background color. This returns the value of
     * {@code getSecondary3()}.
     *
     * @return the menu background color
     */
    public ColorUIResource getMenuBackground() {
        return getSecondary3();
    }

    /**
     * Returns the menu foreground color. This returns the value of
     * {@code getBlack()}.
     *
     * @return the menu foreground color
     */
    public ColorUIResource getMenuForeground() {
        return getBlack();
    }

    /**
     * Returns the menu selected background color. This returns the value of
     * {@code getPrimary2()}.
     *
     * @return the menu selected background color
     */
    public ColorUIResource getMenuSelectedBackground() {
        return getPrimary2();
    }

    /**
     * Returns the menu selected foreground color. This returns the value of
     * {@code getBlack()}.
     *
     * @return the menu selected foreground color
     */
    public ColorUIResource getMenuSelectedForeground() {
        return getBlack();
    }

    /**
     * Returns the menu disabled foreground color. This returns the value of
     * {@code getSecondary2()}.
     *
     * @return the menu disabled foreground color
     */
    public ColorUIResource getMenuDisabledForeground() {
        return getSecondary2();
    }

    /**
     * Returns the separator background color. This returns the value of
     * {@code getWhite()}.
     *
     * @return the separator background color
     */
    public ColorUIResource getSeparatorBackground() {
        return getWhite();
    }

    /**
     * Returns the separator foreground color. This returns the value of
     * {@code getPrimary1()}.
     *
     * @return the separator foreground color
     */
    public ColorUIResource getSeparatorForeground() {
        return getPrimary1();
    }

    /**
     * Returns the accelerator foreground color. This returns the value of
     * {@code getPrimary1()}.
     *
     * @return the accelerator foreground color
     */
    public ColorUIResource getAcceleratorForeground() {
        return getPrimary1();
    }

    /**
     * Returns the accelerator selected foreground color. This returns the value
     * of {@code getBlack()}.
     *
     * @return the accelerator selected foreground color
     */
    public ColorUIResource getAcceleratorSelectedForeground() {
        return getBlack();
    }

    /**
     * Adds values specific to this theme to the defaults table. This method is
     * invoked when the look and feel defaults are obtained from
     * {@code MetalLookAndFeel}.
     * <p>
     * This implementation does nothing; it is provided for subclasses that wish
     * to customize the defaults table.
     *
     * @param table the {@code UIDefaults} to add the values to
     *
     * 
     */
    public void addCustomEntriesToTable(UIDefaults table) {
    }

    /**
     * This is invoked when a MetalLookAndFeel is installed and about to start
     * using this theme. When we can add API this should be nuked in favor of
     * DefaultMetalTheme overriding addCustomEntriesToTable.
     */
    void install() {
    }

    /**
     * Returns true if this is a theme provided by the core platform.
     */
    boolean isSystemTheme() {
        return false;
    }

}
