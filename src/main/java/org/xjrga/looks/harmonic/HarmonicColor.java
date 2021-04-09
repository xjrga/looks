package org.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * Implementing this interface allows an object to be a harmonic color
 *
 * @author Jorge R Garcia de Alba
 */
public interface HarmonicColor {

    /**
     * Gets the base color
     *
     * @return Base color
     * @see java.awt.Color
     */
    Color getBaseColor();

    /**
     * Gets the harmonic color
     *
     * @return Harmonic color
     * @see java.awt.Color
     */
    Color getColor();

    /**
     * Gets the degree of hue change
     *
     * @return Degree of hue change with respect to base color
     */
    float getAngle();

    /**
     * Gets the harmonic color name
     *
     * @return Harmonic color name
     */
    String getName();
}
