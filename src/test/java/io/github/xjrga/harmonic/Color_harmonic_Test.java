package io.github.xjrga.harmonic;

import java.awt.Color;
import org.junit.Test;
import io.github.xjrga.looks.harmonic.Color_harmonic;
import static org.junit.Assert.assertEquals;

/**
 * ColorHarmonic tests
 *
 * @author Jorge R Garcia de Alba
 */
public class Color_harmonic_Test {

    /**
     *
     */
    @Test
    public void testGetComplementaryColor() {
        Color_harmonic colorHarmonic = new Color_harmonic(new Color(255, 0, 0));
        Color complementaryColor = colorHarmonic.get_hue_change_180().get_color();
        //Cyan,0,255,255
        assertEquals(complementaryColor.getRed(), 0);
        assertEquals(complementaryColor.getGreen(), 255);
        assertEquals(complementaryColor.getBlue(), 255);
    }

}
