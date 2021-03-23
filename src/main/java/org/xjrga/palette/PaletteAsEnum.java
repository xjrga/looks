package org.xjrga.palette;

import java.awt.Color;

public enum PaletteAsEnum {
    BLACK(new Color(0,0,0), "Black"),
    WHITE(new Color(255, 255, 255), "White")
    ;

    private final Color color;
    private final String name;

    PaletteAsEnum(Color color, String name) {
        this.color = color;
        this.name = name;        
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    } 
       
}
