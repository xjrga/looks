package org.xjrga.looks.harmonic;

import java.awt.Color;
import java.util.Comparator;

/**
 * This class implements the HarmonicColor interface
 *
 * @author Jorge R Garcia de Alba
 */
public class ComplementaryColor implements HarmonicColor, Comparator<HarmonicColor> {

    private Color color = null;
    private final float angle = 180f;
    private final ColorGenerator colorGenerator;

    /**
     * Constructs a new harmonic color;
     *
     * @param color Base color
     * @see java.awt.Color
     */
    public ComplementaryColor(Color color) {
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
    public String getName() {
        return "Complementary";
    }

    @Override
    public int compare(HarmonicColor o1, HarmonicColor o2) {
        int result = 0;
        if (o1.getAngle() > o2.getAngle()) {
            result = 1;
        }
        return result;
    }

}
