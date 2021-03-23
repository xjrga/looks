package org.xjrga.looks;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;
import java.awt.*;

public class Minimal extends MetalTheme {
    
    private final ColorUIResource colorUIResource0 = new ColorUIResource(new Color(0xf2f2f2));
    private final ColorUIResource colorUIResource1 = new ColorUIResource(new Color(0, 0, 0));
    private final ColorUIResource colorUIResource2 = new ColorUIResource(new Color(0xFFF2D0));
    //private final ColorUIResource colorUIResource2 = new ColorUIResource(new Color(0xF8E0FD));
    //private final ColorUIResource colorUIResource2 = new ColorUIResource(new Color(0xD4F0FA));
    
    private FontUIResource font;
    private ColorUIResource primary1;
    private ColorUIResource primary2;
    private ColorUIResource primary3;
    private ColorUIResource secondary1;
    private ColorUIResource secondary2;
    private ColorUIResource secondary3;
    
    public Minimal() { 
        font = new FontUIResource("Dialog", Font.PLAIN, 13);
        //panel background
        secondary3 = new ColorUIResource(new Color(0xf2f2f2));
        //component background stuff
        secondary2 = new ColorUIResource(new Color(0xf2f2f2));
        //internal frame,component outlines,nonselected
        secondary1 = new ColorUIResource(new Color(0xD4F0FA));
        //internal frame,tooltip,tree,list -> selected
        primary3 = new ColorUIResource(new Color(0xF8E0FD));
        //Highlights
        primary1 = new ColorUIResource(new Color(0xD4F0FA));
        //ticks,internal frame background
        primary2 = new ColorUIResource(new Color(0xF8E0FD));
    }
    
    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
        //UIManager.put("TabbedPane.focus", colorUIResource2);
        //UIManager.put("TabbedPane.selected", colorUIResource2);
        //UIManager.put("Button.select", colorUIResource2);        
        //UIManager.put("InternalFrame.border", BorderFactory.createLineBorder(new Color(0, 0, 0)));
    }

    @Override
    public String getName() {
        return "Minimal";
    }

    @Override
    protected ColorUIResource getPrimary1() {
        return primary1;
    }

    @Override
    protected ColorUIResource getPrimary2() {
        //selected menu,menuitem background
        return primary2;
    }

    @Override
    protected ColorUIResource getPrimary3() {
        //selected field,row background
        return primary3;
    }

    @Override
    protected ColorUIResource getSecondary1() {
        return secondary1;
    }

    @Override
    protected ColorUIResource getSecondary2() {
        //panel, table outlines
        return secondary2;
    }

    @Override
    protected ColorUIResource getSecondary3() {
        //app background
        return secondary3;
    }

//    public ColorUIResource getFocusColor() {
//        //selected field outline
//        return colorUIResource0;
//    }
//
//    public ColorUIResource getMenuSelectedForeground() {
//        //menu text when selected
//        return colorUIResource1;
//    }

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