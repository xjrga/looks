package org.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class implements the HarmonicColor interface
 *
 * @author Jorge R Garcia de Alba
 */
public class Harmonic30 implements HarmonicColor, Comparable<HarmonicColor> {

    private Color baseColor = null;
    private final ColorGenerator colorGenerator;
    private final Color newColor;
    private final float angleChange = 30f;
    private float angle = -1f;

    /**
     * Constructs a new harmonic color;
     *
     * @param color the base color
     * @see java.awt.Color
     */
    public Harmonic30(Color color) {
        this.baseColor = color;
        colorGenerator = new ColorGenerator(color);
        newColor = colorGenerator.generateColorUsingHueChange(angleChange);
        angle = colorGenerator.getNewHue();
    }

    @Override
    public float getAngleChange() {
        return angleChange;
    }

    @Override
    public float getAngle() {
        return angle;
    }

    @Override
    public Color getBaseColor() {
        return baseColor;
    }

    @Override
    public Color getColor() {
        return newColor;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public int compareTo(HarmonicColor harmonicColor) {
        int result = 0;
        if (this.getAngleChange() > harmonicColor.getAngleChange()) {
            result = 1;
        }
        return result;
    }

}
