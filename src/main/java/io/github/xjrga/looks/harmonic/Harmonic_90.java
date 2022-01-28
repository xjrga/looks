package io.github.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class implements the HarmonicColor interface
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Harmonic_90 implements Harmonic_color, Comparable<Harmonic_color> {

    private Color baseColor = null;
    private final Color_generator colorGenerator;
    private final Color newColor;
    private final float angleChange = 90f;
    private float angle = -1f;

    /**
     * Constructs a new harmonic color;
     *
     * @param color the base color
     * @see java.awt.Color
     */
    public Harmonic_90(Color color) {
        this.baseColor = color;
        colorGenerator = new Color_generator(color);
        newColor = colorGenerator.change_hue(angleChange);
        angle = colorGenerator.get_new_hue();
    }

    @Override
    public float get_angle_change() {
        return angleChange;
    }

    @Override
    public float get_angle() {
        return angle;
    }

    @Override
    public Color get_base_color() {
        return baseColor;
    }

    @Override
    public Color get_color() {
        return newColor;
    }

    @Override
    public String get_name() {
        return "";
    }

    @Override
    public int compareTo(Harmonic_color harmonicColor) {
        int result = 0;
        if (this.get_angle_change() > harmonicColor.get_angle_change()) {
            result = 1;
        }
        return result;
    }

}
