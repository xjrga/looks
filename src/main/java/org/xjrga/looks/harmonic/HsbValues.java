package org.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class handles color hsb values
 *
 * @author Jorge R Garcia de Alba
 */
public class HsbValues {

    private float[] hsbvals;

    public HsbValues(Color color) {
        hsbvals = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
    }

    public float getHueFraction() {
        return hsbvals[0];
    }

    public float getSaturationFraction() {
        return hsbvals[1];
    }

    public float getBrightnessFraction() {
        return hsbvals[2];
    }

    public float getHue() {
        return convertToHueFromHueFraction(hsbvals[0]);
    }

    public float getSaturation() {
        return convertToSaturationFromSaturationFraction(hsbvals[1]);
    }

    public float getBrightness() {
        return convertToBrightnessFromBrightnessFraction(hsbvals[2]);
    }

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
     * @param angle a value between 0 and 360
     * @param angleChange a value between 0 and 360
     * @return a float
     */
    public static float calculateNewHue(float angle, float angleChange) {
        return Math.round(angle + angleChange) % 360;
    }

}
