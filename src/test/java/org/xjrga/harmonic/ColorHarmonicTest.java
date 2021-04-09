package org.xjrga.harmonic;

import java.awt.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.xjrga.looks.harmonic.ColorHarmonic;

/**
 * ColorHarmonic tests
 *
 * @author Jorge R Garcia de Alba
 */
public class ColorHarmonicTest {

    /**
     *
     */
    @Test
    public void testGetComplementaryColor() {
        ColorHarmonic colorHarmonic = new ColorHarmonic(new Color(255, 0, 0));
        Color complementaryColor = colorHarmonic.getComplementaryColor();
        //Cyan,0,255,255
        Assert.assertEquals(complementaryColor.getRed(), 0);
        Assert.assertEquals(complementaryColor.getGreen(), 255);
        Assert.assertEquals(complementaryColor.getBlue(), 255);
    }
    
    /**
     *
     */
    @Test
    public void testGetAnalogousColors() {
        ColorHarmonic colorHarmonic = new ColorHarmonic(new Color(255, 0, 0));
        Color firstAnalogousColor = colorHarmonic.getFirstAnalogousColor();
        Color secondAnalogousColor = colorHarmonic.getSecondAnalogousColor();
        //Orange,255,128,0
        Assert.assertEquals(firstAnalogousColor.getRed(), 255);
        Assert.assertEquals(firstAnalogousColor.getGreen(), 128);
        Assert.assertEquals(firstAnalogousColor.getBlue(), 0);
        //Pink,255,0,128
        Assert.assertEquals(secondAnalogousColor.getRed(), 255);
        Assert.assertEquals(secondAnalogousColor.getGreen(), 0);
        Assert.assertEquals(secondAnalogousColor.getBlue(), 128);
    }
}
