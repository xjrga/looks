package org.xjrga.looks.roughdraft;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;

/**
 * This class is a theme for Java Look and Feel (also known as Metal)
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Mars extends MetalTheme {

    private final ColorUIResource primary1;
    private final ColorUIResource primary2;
    private final ColorUIResource primary3;
    private final ColorUIResource secondary1;
    private final ColorUIResource secondary2;
    private final ColorUIResource secondary3;
    private final Color COLOR00 = new Color(0xff9061);
    private final Color COLOR10 = new Color(0xe68258);
    private final Color COLOR20 = new Color(0xcc744e);
    private final Color COLOR30 = new Color(0xb36544);
    private final Color COLOR40 = new Color(0x99573a);
    private final Color COLOR50 = new Color(0x804831);
    private final Color COLOR60 = new Color(0x663a27);
    private final Color COLOR70 = new Color(0x4d2b1d);
    private final Color COLOR80 = new Color(0x331d13);
    private final Color COLOR90 = new Color(0x190e0a);
    private final Color COLOR100 = new Color(0x000000);
    private final FontUIResource fontUIResource;

    /**
     * Mars constructor
     *
     * @param font the font
     * @see java.awt.Font
     */
    public Mars(Font font) {
        fontUIResource = new FontUIResource(font);
        secondary3 = new ColorUIResource(this.COLOR40);
        //app, menu background, selected tab        

        secondary2 = new ColorUIResource(this.COLOR40);
        //unselected tab, iframes side lines, selected button,scrollbar outline
        //slider outline and ticks,pressed menuitem,table grid, menubar outline
        //slider disabled ticks

        primary3 = new ColorUIResource(this.COLOR20);
        //selected window, selected menuitem box, tree component
        //selected window top bar, scrollbar knob left outline, tooltip, 
        //selected list item, selected slider knob highlight,
        //folders, table row selection

        primary1 = new ColorUIResource(this.COLOR00);
        //scrollbar knob outline and dots, folder tab, 
        //selected iframe outline and dots, tooltip outline,
        //slider knob dots

        secondary1 = new ColorUIResource(this.COLOR30);
        //iframe outlines, button outlines, menu outline, menu item checkbox, 
        //textbox outline, component outlines

        primary2 = new ColorUIResource(this.COLOR20);//
        //internal frame background, component focus
        //menu item background, selected scrollbar knob background, folders line
        //slider ticks
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
    }

    @Override
    public String getName() {
        return "Mars";
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
