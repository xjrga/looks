package io.github.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class generates Color objects from color hsb values
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Color_generator {

    private final Hsb_values hsbValues;
    private final float hue;
    private float newHue = -1;

    /**
     * Constructs a new color generator
     *
     * @param color the base color
     * @see java.awt.Color
     */
    public Color_generator(Color color) {
        hsbValues = new Hsb_values(color);
        hue = hsbValues.get_hue();
    }

    /**
     * Generates a new color
     *
     * @param hue the degree of hue (0-360)
     * @param saturation the amount of saturation (0-100)
     * @param brightness the amount of brightness (0-100)
     * @return a color
     * @see java.awt.Color
     */
    public static Color generate_color(float hue, float saturation, float brightness) {
        float hue_fraction = Hsb_values.convert_to_hue_fraction_from_hue(hue);
        float saturation_fraction = Hsb_values.convert_to_saturation_fraction_from_saturation(saturation);
        float brightness_fraction = Hsb_values.convert_to_brightness_fraction_from_brightness(brightness);
        return Color.getHSBColor(hue_fraction, saturation_fraction, brightness_fraction);
    }

    /**
     * Generates a new color
     *
     * @param hue_change the degree change of hue (0-360)
     * @return a color
     * @see java.awt.Color
     */
    public Color change_hue(float hue_change) {
        newHue = Hsb_values.calculate_new_hue(hsbValues.get_hue(), hue_change);
        float saturation = hsbValues.get_saturation();
        float brightness = hsbValues.get_brightness();
        return generate_color(newHue, saturation, brightness);
    }

    /**
     * Generates a new monochrome color from base color
     *
     * @param saturation the amount of saturation (0-100)
     * @param brightness the amount of brightness (0-100)
     * @return a color
     * @see java.awt.Color
     */
    public Color generate_monochrome_color(float saturation, float brightness) {
        return generate_color(hue, saturation, brightness);
    }

    /**
     * Generates a new monochrome color from base color
     *
     * @param saturation the amount of saturation (0-100)
     * @return a color
     * @see java.awt.Color
     */
    public Color generate_monochrome_color_using_saturation(float saturation) {
        float brightness = hsbValues.get_brightness();
        return generate_color(hue, saturation, brightness);
    }

    /**
     * Generates a new monochrome color from base color
     *
     * @param brightness the amount of brightness (0-100)
     * @return a color
     * @see java.awt.Color
     */
    public Color generate_monochrome_color_using_brightness(float brightness) {
        float saturation = hsbValues.get_saturation();
        return generate_color(hue, saturation, brightness);
    }

    /**
     *
     * @return original color hue
     */
    public float get_hue() {
        return hue;
    }

    /**
     *
     * @return newly created color hue
     */
    public float get_new_hue() {
        return newHue;
    }

}
