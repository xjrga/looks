package com.github.xjrga.harmonic;

import java.awt.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.xjrga.looks.harmonic.ColorGenerator;

/**
 * ColorGenerator tests
 *
 * @author Jorge R Garcia de Alba
 */
public class ColorGeneratorTest {

    /**
     *
     */
    @Test
    public void testGetColorUsingHue() {
        ColorGenerator colorGenerator = new ColorGenerator(new Color(255, 0, 0));
        Color color = colorGenerator.generateColorUsingHueChange(0);
        //Red,255,0,0
        Assert.assertEquals(color.getRed(), 255);
        Assert.assertEquals(color.getGreen(), 0);
        Assert.assertEquals(color.getBlue(), 0);
    }

    /**
     *
     */
    @Test
    public void testGetColorUsingSaturation() {
        ColorGenerator colorGenerator = new ColorGenerator(new Color(255, 0, 0));
        Color color = colorGenerator.generateMonochromeColorUsingSaturation(60);
        //Red,255,230,0
        Assert.assertEquals(color.getRed(), 255);
        Assert.assertEquals(color.getGreen(), 102);
        Assert.assertEquals(color.getBlue(), 102);
    }

    /**
     *
     */
    @Test
    public void testGetColorUsingBrightness() {
        ColorGenerator colorGenerator = new ColorGenerator(new Color(255, 0, 0));
        Color color = colorGenerator.generateMonochromeColorUsingBrightness(75);
        //Red,192,0,0
        Assert.assertEquals(color.getRed(), 191);
        Assert.assertEquals(color.getGreen(), 0);
        Assert.assertEquals(color.getBlue(), 0);
    }

    /**
     *
     */
    @Test
    public void testGenerateMonochromeColor() {
        ColorGenerator colorGenerator = new ColorGenerator(new Color(255, 0, 0));
        Color color = colorGenerator.generateMonochromeColor(75, 75);
        //Red,191,48,48
        Assert.assertEquals(color.getRed(), 191);
        Assert.assertEquals(color.getGreen(), 48);
        Assert.assertEquals(color.getBlue(), 48);
    }

}
