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
        Color complementaryColor = colorHarmonic.getHarmonic180().getColor();
        //Cyan,0,255,255
        Assert.assertEquals(complementaryColor.getRed(), 0);
        Assert.assertEquals(complementaryColor.getGreen(), 255);
        Assert.assertEquals(complementaryColor.getBlue(), 255);
    }
       
}
