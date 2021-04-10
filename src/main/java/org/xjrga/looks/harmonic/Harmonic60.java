package org.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class implements the HarmonicColor interface
 *
 * @author Jorge R Garcia de Alba
 */
public class Harmonic60 implements HarmonicColor, Comparable<HarmonicColor> {

    private Color color = null;
    private final float angle = 60f;
    private final ColorGenerator colorGenerator;

    /**
     * Constructs a new harmonic color;
     *
     * @param color the base color
     * @see java.awt.Color
     */
    public Harmonic60(Color color) {
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
    public float getAngleChange() {
        return angle;
    }

    @Override
    public String getName() {
        return "Analogous 60";
    }

    @Override
    public int compareTo(HarmonicColor harmonicColor) {
        int result = 0;
        if (this.getAngleChange() > harmonicColor.getAngleChange()) {
            result = 1;
        }
        return result;
    }
    
    @Override
    public float getAngle() {
        return colorGenerator.getNewHue();
    }
}
