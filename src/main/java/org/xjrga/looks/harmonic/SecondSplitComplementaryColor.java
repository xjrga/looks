package org.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class is a harmonic color
 *
 * @author Jorge R Garcia de Alba
 */
public class SecondSplitComplementaryColor implements HarmonicColor {

    private Color color = null;
    private final float angle = 200f;
    private final ColorGenerator colorGenerator;

    public SecondSplitComplementaryColor(Color color) {
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
