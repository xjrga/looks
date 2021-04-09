package org.xjrga.looks.harmonic;

import java.awt.Color;
import java.util.Comparator;

/**
 * This class implements the HarmonicColor interface
 *
 * @author Jorge R Garcia de Alba
 */
public class FirstSplitComplementaryColor implements HarmonicColor, Comparator<HarmonicColor> {

    private Color color = null;
    private final float angle = 160f;
    private final ColorGenerator colorGenerator;

    /**
     * Constructs a new harmonic color;
     *
     * @param color the base color
     * @see java.awt.Color
     */
    public FirstSplitComplementaryColor(Color color) {
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

    @Override
    public int compare(HarmonicColor o1, HarmonicColor o2) {
        int result = 0;
        if (o1.getAngle() > o2.getAngle()) {
            result = 1;
        }
        return result;
    }

    @Override
    public String getName() {
        return "First Split Complementary";
    }
}
