package io.github.xjrga.harmonic;

import java.awt.Color;
import org.junit.Test;
import io.github.xjrga.looks.harmonic.Color_mixer;
import static org.junit.Assert.assertEquals;

/**
 * ColorMix tests
 *
 * @author Jorge R Garcia de Alba
 */
public class Color_mix_Test {

    /**
     *
     */
    @Test
    public void testRgbValues() {
        Color_mixer colorMixer = new Color_mixer(new Color(0, 0, 0), new Color(255, 255, 255));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            float mixValue = (float) i / 10;
            Color newColor = colorMixer.get_color_mix(mixValue);
            sb.append("i:");
            sb.append(i);
            sb.append(",");
            sb.append("mixValue");
            sb.append(":");
            sb.append(mixValue);
            sb.append(",(");
            sb.append(newColor.getRed());
            sb.append(",");
            sb.append(newColor.getGreen());
            sb.append(",");
            sb.append(newColor.getBlue());
            sb.append(")");
            sb.append("\n");
        }
        assertEquals(
                "i:0,mixValue:0.0,(0,0,0)\n"
                + "i:1,mixValue:0.1,(25,25,25)\n"
                + "i:2,mixValue:0.2,(51,51,51)\n"
                + "i:3,mixValue:0.3,(76,76,76)\n"
                + "i:4,mixValue:0.4,(102,102,102)\n", sb.toString());
    }
}
