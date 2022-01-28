package io.github.xjrga.harmonic;

import java.awt.Color;
import org.junit.Test;
import io.github.xjrga.looks.harmonic.Color_tones;
import static org.junit.Assert.assertEquals;

/**
 * ColorTones tests
 *
 * @author Jorge R Garcia de Alba
 */
public class Color_tones_Test {

    /**
     *
     */
    @Test
    public void testGetTones() {
        Color_tones colorTones = new Color_tones(new Color(0, 0, 0));
        StringBuilder sb = new StringBuilder();
        sb.append("c00:");
        sb.append(colorTones.get_color().getRed());
        sb.append(",");
        sb.append(colorTones.get_color().getGreen());
        sb.append(",");
        sb.append(colorTones.get_color().getBlue());
        sb.append("\n");
        sb.append("c05:");
        sb.append(colorTones.lighter_by_5().getRed());
        sb.append(",");
        sb.append(colorTones.lighter_by_5().getGreen());
        sb.append(",");
        sb.append(colorTones.lighter_by_5().getBlue());
        sb.append("\n");
        sb.append("c10:");
        sb.append(colorTones.lighter_by_10().getRed());
        sb.append(",");
        sb.append(colorTones.lighter_by_10().getGreen());
        sb.append(",");
        sb.append(colorTones.lighter_by_10().getBlue());
        sb.append("\n");
        sb.append("c15:");
        sb.append(colorTones.lighter_by_15().getRed());
        sb.append(",");
        sb.append(colorTones.lighter_by_15().getGreen());
        sb.append(",");
        sb.append(colorTones.lighter_by_15().getBlue());
        sb.append("\n");
        sb.append("c20:");
        sb.append(colorTones.lighter_by_20().getRed());
        sb.append(",");
        sb.append(colorTones.lighter_by_20().getGreen());
        sb.append(",");
        sb.append(colorTones.lighter_by_20().getBlue());
        sb.append("\n");
        assertEquals(
                "c00:0,0,0\n"
                + "c05:12,12,12\n"
                + "c10:25,25,25\n"
                + "c15:38,38,38\n"
                + "c20:51,51,51\n", sb.toString());
    }
}
