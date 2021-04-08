/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xjrga.looks.harmonic;

import java.awt.Color;

/**
 *
 * @author jr
 */
public class ColorGenerator {

    private final HsbValues hsbValues;

    public ColorGenerator(Color color) {
        hsbValues = new HsbValues(color);
    }
        
    public static Color generateColor(float hue,float saturation, float brightness) {                                
        float hueFraction = HsbValues.convertToHueFractionFromHue(hue);
        float saturationFraction = HsbValues.convertToSaturationFractionFromSaturation(saturation);
        float brightnessFraction = HsbValues.convertToBrightnessFractionFromBrightness(brightness);
        return Color.getHSBColor(hueFraction, saturationFraction, brightnessFraction);
    }
    
    public Color generateColor(float hue) {
        float newHue = HsbValues.calculateNewHue(hsbValues.getHue(), hue);        
        float saturation = hsbValues.getSaturation();
        float brightness = hsbValues.getBrightness();
        return generateColor(newHue, saturation, brightness);
    }
    
    public Color generateMonochromeColor(float saturation, float brightness) {                                
        float hue = hsbValues.getHue();        
        return generateColor(hue, saturation, brightness);
    }
    
    public Color generateMonochromeColorUsingSaturation(float saturation) {                                
        float hue = hsbValues.getHue();        
        float brightness = hsbValues.getBrightness();
        return generateColor(hue, saturation, brightness);
    }
    
    public Color generateMonochromeColorUsingBrightness(float brightness) {                                
        float hue = hsbValues.getHue();
        float saturation = hsbValues.getSaturation();        
        return generateColor(hue, saturation, brightness);
    }
       
}
