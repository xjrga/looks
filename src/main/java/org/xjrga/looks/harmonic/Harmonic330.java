package org.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class implements the HarmonicColor interface
 *
 * @author Jorge R Garcia de Alba
 */
public class Harmonic330 implements HarmonicColor, Comparable<HarmonicColor> {

    private Color color = null;
    private final float angle = 330f;
    private final ColorGenerator colorGenerator;

    /**
     * Constructs a new harmonic color;
     *
     * @param color the base color
     * @see java.awt.Color
     */
    public Harmonic330(Color color) {
        this.color = color;
        colorGenerator = new ColorGenerator(color);
    }

    /**
     * Gets the base color
     *
     * @return Base color
     * @see java.awt.Color
     */
    @Override
    public Color getBaseColor() {
        return color;
    }

    /**
     * Gets the harmonic color
     *
     * @return Harmonic color
     * @see java.awt.Color
     */
    @Override
    public Color getColor() {
        return colorGenerator.generateColorUsingHueChange(angle);
    }

    /**
     * Gets the degree of hue change
     *
     * @return Degree of hue change with respect to base color
     */
    @Override
    public float getAngle() {
        return angle;
    }

    @Override
    public int compareTo(HarmonicColor harmonicColor) {
        int result = 0;
        if (this.getAngle() > harmonicColor.getAngle()) {
            result = 1;
        }
        return result;
    }

    @Override
    public String getName() {
        return "Second Analogous";
    }
}
