package io.github.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class retrieves and converts hsb values from Color object
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Hsb_values {

    private float[] hsbvals;

    /**
     * Constructs a new HsbValues converter
     *
     * @param color the base color
     */
    public Hsb_values(Color color) {
        hsbvals = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
    }

    /**
     * Gets color hue fraction
     *
     * @return hue fraction (0-1)
     */
    public float get_hue_fraction() {
        return hsbvals[0];
    }

    /**
     * Gets color saturation fraction
     *
     * @return saturation fraction (0-1)
     */
    public float get_saturation_fraction() {
        return hsbvals[1];
    }

    /**
     * Gets color brightness fraction
     *
     * @return brightness fraction (0-1)
     */
    public float get_brightness_fraction() {
        return hsbvals[2];
    }

    /**
     * Gets color hue
     *
     * @return degree of hue (0-360)
     */
    public float get_hue() {
        return convert_to_hue_from_hue_fraction(hsbvals[0]);
    }

    /**
     * Gets color saturation
     *
     * @return color saturation (0-100)
     */
    public float get_saturation() {
        return convert_to_saturation_from_saturation_fraction(hsbvals[1]);
    }

    /**
     * Gets color brightness
     *
     * @return color brightness (0-100)
     */
    public float get_brightness() {
        return convert_to_brightness_from_brightness_fraction(hsbvals[2]);
    }

    /**
     * Converts hue fraction to hue
     *
     * @param hueFraction color hue fraction (0-1)
     * @return color hue (0-100)
     */
    public static float convert_to_hue_from_hue_fraction(float hueFraction) {
        return hueFraction * 360f;
    }

    /**
     * Converts saturation fraction to saturation
     *
     * @param saturationFraction color saturation fraction (0-1)
     * @return color saturation (0-100)
     */
    public static float convert_to_saturation_from_saturation_fraction(float saturationFraction) {
        return saturationFraction * 100f;
    }

    /**
     * Converts brightness fraction to brightness
     *
     * @param brightnessFraction color brightness fraction (0-1)
     * @return color brightness (0-100)
     */
    public static float convert_to_brightness_from_brightness_fraction(float brightnessFraction) {
        return brightnessFraction * 100f;
    }

    /**
     * Converts hue to hue fraction
     *
     * @param hue color hue (0-360)
     * @return color hue (0-1)
     */
    public static float convert_to_hue_fraction_from_hue(float hue) {
        return hue / 360f;
    }

    /**
     * Converts saturation to saturation fraction
     *
     * @param saturation color saturation (0-100)
     * @return a float; color saturation fraction (0-1)
     */
    public static float convert_to_saturation_fraction_from_saturation(float saturation) {
        return saturation / 100f;
    }

    /**
     * Converts brightness to brightness fraction
     *
     * @param brightness color brightness (0-100)
     * @return a float; color brightness (0-1)
     */
    public static float convert_to_brightness_fraction_from_brightness(float brightness) {
        return brightness / 100f;
    }

    /**
     * Generates new hue value
     *
     * @param angle degree of hue (0-360)
     * @param angleChange degree of hue change (0-360)
     * @return degree of new hue
     */
    public static float calculate_new_hue(float angle, float angleChange) {
        return Math.round(angle + angleChange) % 360;
    }

}
