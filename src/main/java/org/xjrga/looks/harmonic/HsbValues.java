package org.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class retrieves and converts hsb values from color object
 *
 * @author Jorge R Garcia de Alba
 */
public class HsbValues {

    private float[] hsbvals;

    /**
     * Constructs a new HsbValues converter
     *
     * @param color the base color     
     * @see java.awt.Color
     */
    public HsbValues(Color color) {
        hsbvals = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
    }

    /**
     * Gets color hue fraction
     *     
     * @return a float; the hue fraction (0-1)
     * @see java.awt.Color
     */
    public float getHueFraction() {
        return hsbvals[0];
    }

    /**
     * Gets color saturation fraction
     *     
     * @return a float; the saturation fraction (0-1)
     * @see java.awt.Color
     */
    public float getSaturationFraction() {
        return hsbvals[1];
    }

    /**
     * Gets color brightness fraction
     *     
     * @return a float; the brightness fraction (0-1)
     * @see java.awt.Color
     */
    public float getBrightnessFraction() {
        return hsbvals[2];
    }

    /**
     * Gets color hue
     *     
     * @return a float; the degree of hue (0-360)
     * @see java.awt.Color
     */
    public float getHue() {
        return convertToHueFromHueFraction(hsbvals[0]);
    }

    /**
     * Gets color saturation
     *     
     * @return a float; the color saturation (0-100)
     * @see java.awt.Color
     */
    public float getSaturation() {
        return convertToSaturationFromSaturationFraction(hsbvals[1]);
    }

    /**
     * Gets color brightness
     *     
     * @return a float; the color brightness (0-100)
     * @see java.awt.Color
     */
    public float getBrightness() {
        return convertToBrightnessFromBrightnessFraction(hsbvals[2]);
    }

    /**
     * Converts hue fraction to hue
     *   
     * @param hue a float; the color hue fraction (0-1)
     * @return a float; the color hue (0-100)
     * @see java.awt.Color
     */
    public static float convertToHueFromHueFraction(float hue) {
        return hue * 360f;
    }

    public static float convertToSaturationFromSaturationFraction(float saturation) {
        return saturation * 100f;
    }

    public static float convertToBrightnessFromBrightnessFraction(float brightness) {
        return brightness * 100f;
    }

    public static float convertToHueFractionFromHue(float hue) {
        return hue / 360f;
    }
    
    public static float convertToSaturationFractionFromSaturation(float saturation) {
        return saturation / 100f;
    }
    
    public static float convertToBrightnessFractionFromBrightness(float brightness) {
        return brightness / 100f;
    }

    /**
     * Generates new hue value
     *
     * @param angle the degree of hue (0-360)
     * @param angleChange the degree of hue change (0-360)
     * @return a float; the degree of new hue
     */
    public static float calculateNewHue(float angle, float angleChange) {
        return Math.round(angle + angleChange) % 360;
    }

}
