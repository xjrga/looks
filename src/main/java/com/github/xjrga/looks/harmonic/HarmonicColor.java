package com.github.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * Implementing this interface allows an object to be a harmonic color
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
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
    float getAngleChange();

    /**
     * Gets the harmonic color name
     *
     * @return Harmonic color name
     */
    String getName();

    /**
     * Gets the hue
     *
     * @return Hue
     */
    float getAngle();
}