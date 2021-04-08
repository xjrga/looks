package org.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class implements the HarmonicColor interface
 *
 * @author Jorge R Garcia de Alba
 */
public class SecondAnalogousColor implements HarmonicColor {

    private Color color = null;
    private final float angle = 330f;
    private final ColorGenerator colorGenerator;

    /**
     * Constructs a new harmonic color; 
     *
     * @param color the base color     
     * @see java.awt.Color
     */
    public SecondAnalogousColor(Color color) {
        this.color = color;
        colorGenerator = new ColorGenerator(color);
    }

    @Override
    public Color getBaseColor() {
        return color;
    }

    @Override
    public Color getColor() {
        return colorGenerator.generateColorUsingHueChange(angle);
    }

    @Override
    public float getAngle() {
        return angle;
    }
}
