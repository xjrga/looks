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
    public void testGetTriadicColors() {
        ColorHarmonic colorHarmonic = new ColorHarmonic(new Color(255, 0, 0));
        Color firstTriadicColor = colorHarmonic.getFirstTriadicColor();
        Color secondTriadicColor = colorHarmonic.getSecondTriadicColor();
        //Green,0,255,0
        Assert.assertEquals(firstTriadicColor.getRed(), 0);
        Assert.assertEquals(firstTriadicColor.getGreen(), 255);
        Assert.assertEquals(firstTriadicColor.getBlue(), 0);
        //Blue,0,0,255
        Assert.assertEquals(secondTriadicColor.getRed(), 0);
        Assert.assertEquals(secondTriadicColor.getGreen(), 0);
        Assert.assertEquals(secondTriadicColor.getBlue(), 255);
    }

    /**
     *
     */
    public void testGetTetradicColors() {
        ColorHarmonic colorHarmonic = new ColorHarmonic(new Color(255, 0, 0));
        Color firstTetradicColor = colorHarmonic.getFirstTetradicColor();
        Color secondTetradicColor = colorHarmonic.getSecondTetradicColor();
        Color thirdTetradicColor = colorHarmonic.getThirdTetradicColor();
        //Yellow,255,255,0
        Assert.assertEquals(firstTetradicColor.getRed(), 255);
        Assert.assertEquals(firstTetradicColor.getGreen(), 255);
        Assert.assertEquals(firstTetradicColor.getBlue(), 0);
        //Cyan,0,255,255
        Assert.assertEquals(secondTetradicColor.getRed(), 0);
        Assert.assertEquals(secondTetradicColor.getGreen(), 255);
        Assert.assertEquals(secondTetradicColor.getBlue(), 255);
        //Blue,0,0,255
        Assert.assertEquals(thirdTetradicColor.getRed(), 0);
        Assert.assertEquals(thirdTetradicColor.getGreen(), 0);
        Assert.assertEquals(thirdTetradicColor.getBlue(), 255);
    }

    /**
     *
     */
    @Test
    public void testGetSplitComplementaryColors() {
        ColorHarmonic colorHarmonic = new ColorHarmonic(new Color(255, 0, 0));
        Color firstSplitComplementaryColor = colorHarmonic.getFirstSplitComplementaryColor();
        Color secondSplitComplementaryColor = colorHarmonic.getSecondSplitComplementaryColor();
        //Light Green,0,255,170
        Assert.assertEquals(firstSplitComplementaryColor.getRed(), 0);
        Assert.assertEquals(firstSplitComplementaryColor.getGreen(), 255);
        Assert.assertEquals(firstSplitComplementaryColor.getBlue(), 170);
        //Light Blue,0,170,255
        Assert.assertEquals(secondSplitComplementaryColor.getRed(), 0);
        Assert.assertEquals(secondSplitComplementaryColor.getGreen(), 170);
        Assert.assertEquals(secondSplitComplementaryColor.getBlue(), 255);
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
