package org.xjrga.harmonic;

import java.awt.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.github.xjrga.looks.harmonic.ColorTones;

/**
 * ColorTones tests
 *
 * @author Jorge R Garcia de Alba
 */
public class ColorTonesTest {

    /**
     *
     */
    @Test
    public void testGetTones() {
        ColorTones colorTones = new ColorTones(new Color(0, 0, 0));
        StringBuilder sb = new StringBuilder();
        sb.append("c00:");
        sb.append(colorTones.getColor().getRed());
        sb.append(",");
        sb.append(colorTones.getColor().getGreen());
        sb.append(",");
        sb.append(colorTones.getColor().getBlue());
        sb.append("\n");
        sb.append("c05:");
        sb.append(colorTones.lighterBy5().getRed());
        sb.append(",");
        sb.append(colorTones.lighterBy5().getGreen());
        sb.append(",");
        sb.append(colorTones.lighterBy5().getBlue());
        sb.append("\n");
        sb.append("c10:");
        sb.append(colorTones.lighterBy10().getRed());
        sb.append(",");
        sb.append(colorTones.lighterBy10().getGreen());
        sb.append(",");
        sb.append(colorTones.lighterBy10().getBlue());
        sb.append("\n");
        sb.append("c15:");
        sb.append(colorTones.lighterBy15().getRed());
        sb.append(",");
        sb.append(colorTones.lighterBy15().getGreen());
        sb.append(",");
        sb.append(colorTones.lighterBy15().getBlue());
        sb.append("\n");
        sb.append("c20:");
        sb.append(colorTones.lighterBy20().getRed());
        sb.append(",");
        sb.append(colorTones.lighterBy20().getGreen());
        sb.append(",");
        sb.append(colorTones.lighterBy20().getBlue());
        sb.append("\n");
        Assert.assertEquals(
                "c00:0,0,0\n"
                + "c05:12,12,12\n"
                + "c10:25,25,25\n"
                + "c15:38,38,38\n"
                + "c20:51,51,51\n", sb.toString());
    }
}
