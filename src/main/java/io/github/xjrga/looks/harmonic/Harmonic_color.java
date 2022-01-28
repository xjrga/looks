package io.github.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * Implementing this interface allows an object to be a harmonic color
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public interface Harmonic_color {

    /**
     * Gets the base color
     *
     * @return Base color
     * @see java.awt.Color
     */
    Color get_base_color();

    /**
     * Gets the harmonic color
     *
     * @return Harmonic color
     * @see java.awt.Color
     */
    Color get_color();

    /**
     * Gets the degree of hue change
     *
     * @return Degree of hue change with respect to base color
     */
    float get_angle_change();

    /**
     * Gets the harmonic color name
     *
     * @return Harmonic color name
     */
    String get_name();

    /**
     * Gets the hue
     *
     * @return Hue
     */
    float get_angle();
}
