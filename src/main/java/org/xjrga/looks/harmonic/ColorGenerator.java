package org.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class generates Color objects from color hsb values
 *
 * @author Jorge R Garcia de Alba
 */
public class ColorGenerator {

    private final HsbValues hsbValues;

    /**
     * ColorGenerator constructor
     *
     * @param color the base color     
     * @see java.awt.Color
     */
    public ColorGenerator(Color color) {
        hsbValues = new HsbValues(color);
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
    public static Color generateColor(float hue,float saturation, float brightness) {                                
        float hueFraction = HsbValues.convertToHueFractionFromHue(hue);
        float saturationFraction = HsbValues.convertToSaturationFractionFromSaturation(saturation);
        float brightnessFraction = HsbValues.convertToBrightnessFractionFromBrightness(brightness);
        return Color.getHSBColor(hueFraction, saturationFraction, brightnessFraction);
    }
    
    /**
     * Generates a new color
     *
     * @param hueChange the degree change of hue (0-360)
     * @return a color
     * @see java.awt.Color
     */
    public Color generateColorUsingHueChange(float hueChange) {
        float newHue = HsbValues.calculateNewHue(hsbValues.getHue(), hueChange);        
        float saturation = hsbValues.getSaturation();
        float brightness = hsbValues.getBrightness();
        return generateColor(newHue, saturation, brightness);
    }
    
    /**
     * Generates a new monochrome color from base color
     *
     * @param saturation the amount of saturation (0-100)
     * @param brightness the amount of brightness (0-100)
     * @return a color
     * @see java.awt.Color
     */
    public Color generateMonochromeColor(float saturation, float brightness) {                                
        float hue = hsbValues.getHue();        
        return generateColor(hue, saturation, brightness);
    }
    
    /**
     * Generates a new monochrome color from base color
     *
     * @param saturation the amount of saturation (0-100)     
     * @return a color
     * @see java.awt.Color
     */
    public Color generateMonochromeColorUsingSaturation(float saturation) {                                
        float hue = hsbValues.getHue();        
        float brightness = hsbValues.getBrightness();
        return generateColor(hue, saturation, brightness);
    }
    
    /**
     * Generates a new monochrome color from base color
     *     
     * @param brightness the amount of brightness (0-100)
     * @return a color
     * @see java.awt.Color
     */
    public Color generateMonochromeColorUsingBrightness(float brightness) {                                
        float hue = hsbValues.getHue();
        float saturation = hsbValues.getSaturation();        
        return generateColor(hue, saturation, brightness);
    }
       
}
