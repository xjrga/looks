package io.github.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class blends two colors. The color blend goes from 0 percent additional
 * color to 100 percent.
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Color_mixer {

    private final Color colorA;
    private final int colorARed;
    private final int colorAGreen;
    private final int colorABlue;
    private final Color colorB;
    private final int colorBRed;
    private final int colorBGreen;
    private final int colorBBlue;

    /**
     * ColorMixer constructor
     *
     * @param colorA color that is diluted
     * @param colorB color that dilutes
     */
    public Color_mixer(Color colorA, Color colorB) {
        this.colorA = colorA;
        this.colorB = colorB;
        colorARed = colorA.getRed();
        colorAGreen = colorA.getGreen();
        colorABlue = colorA.getBlue();
        colorBRed = colorB.getRed();
        colorBGreen = colorB.getGreen();
        colorBBlue = colorB.getBlue();
    }

    /**
     * Generates a new color
     *
     * @param mixValue the amount of second color added represented by a decimal
     * number between 0 and 1.
     * @return a color
     * @see java.awt.Color
     */
    public Color get_color_mix(float mixValue) {
        test_mix_value_range(mixValue);
        int r = (int) (colorARed * (1.0f - mixValue) + colorBRed * mixValue);
        int g = (int) (colorAGreen * (1.0f - mixValue) + colorBGreen * mixValue);
        int b = (int) (colorABlue * (1.0f - mixValue) + colorBBlue * mixValue);
        //System.out.println("New Color: "+r+","+g+","+b);
        return new Color(r, g, b);
    }

    /**
     * Gets the color that is diluted
     *
     * @return a color object
     * @see java.awt.Color
     */
    public Color get_color_a() {
        return colorA;
    }

    /**
     * Gets the color that dilutes
     *
     * @return a Color object
     * @see java.awt.Color
     */
    public Color get_color_b() {
        return colorB;
    }

    /**
     * Throws exception if mix value is outside limits (0-1)
     *
     */
    private static void test_mix_value_range(float mixValue) {
        boolean error = false;
        String message = "";

        if (mixValue < 0.0f || mixValue > 1.0f) {
            error = true;
            message = message + " Mix value";
        }

        if (error == true) {
            throw new IllegalArgumentException("Mix value outside of expected range:"
                    + message);
        }
    }
}
