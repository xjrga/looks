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
     * @return Returns a color; the base color
     * @see java.awt.Color
     */
    Color getBaseColor();

    /**
     * Gets the harmonic color
     *     
     * @return Returns a color; the harmonic color
     * @see java.awt.Color
     */
    Color getColor();

    /**
     * Gets the degree of hue change
     *     
     * @return Returns a float; the degree of hue change with respect to 
     * base color
     */
    float getAngle();
}