package io.github.xjrga.harmonic;

import java.awt.Color;
import org.junit.Test;
import io.github.xjrga.looks.harmonic.Color_generator;
import static org.junit.Assert.assertEquals;

/**
 * ColorGenerator tests
 *
 * @author Jorge R Garcia de Alba
 */
public class Color_generator_Test {

    /**
     *
     */
    @Test
    public void testGetColorUsingHue() {
        Color_generator colorGenerator = new Color_generator(new Color(255, 0, 0));
        Color color = colorGenerator.change_hue(0);
        //Red,255,0,0
        assertEquals(color.getRed(), 255);
        assertEquals(color.getGreen(), 0);
        assertEquals(color.getBlue(), 0);
    }

    /**
     *
     */
    @Test
    public void testGetColorUsingSaturation() {
        Color_generator colorGenerator = new Color_generator(new Color(255, 0, 0));
        Color color = colorGenerator.generate_monochrome_color_using_saturation(60);
        //Red,255,230,0
        assertEquals(color.getRed(), 255);
        assertEquals(color.getGreen(), 102);
        assertEquals(color.getBlue(), 102);
    }

    /**
     *
     */
    @Test
    public void testGetColorUsingBrightness() {
        Color_generator colorGenerator = new Color_generator(new Color(255, 0, 0));
        Color color = colorGenerator.generate_monochrome_color_using_brightness(75);
        //Red,192,0,0
        assertEquals(color.getRed(), 191);
        assertEquals(color.getGreen(), 0);
        assertEquals(color.getBlue(), 0);
    }

    /**
     *
     */
    @Test
    public void testGenerateMonochromeColor() {
        Color_generator colorGenerator = new Color_generator(new Color(255, 0, 0));
        Color color = colorGenerator.generate_monochrome_color(75, 75);
        //Red,191,48,48
        assertEquals(color.getRed(), 191);
        assertEquals(color.getGreen(), 48);
        assertEquals(color.getBlue(), 48);
    }

}
