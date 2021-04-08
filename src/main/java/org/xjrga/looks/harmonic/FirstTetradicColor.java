package org.xjrga.looks.harmonic;

import java.awt.Color;

public class FirstTetradicColor implements HarmonicColor {

    private Color color = null;
    private final float angle = 60f;
    private final ColorGenerator colorGenerator;

    public FirstTetradicColor(Color color) {
        this.color = color;
        colorGenerator = new ColorGenerator(color);
    }

    @Override
    public Color getBaseColor() {
        return color;
    }

    @Override
    public Color getColor() {
        return colorGenerator.generateColor(angle);
    }

    @Override
    public float getAngle() {
        return angle;
    }
}
