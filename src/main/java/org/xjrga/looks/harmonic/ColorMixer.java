package org.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class blends two colors. The color blend goes from 0 percent additional
 * color to 100 percent.
 *
 * @author Jorge R Garcia de Alba
 */
public class ColorMixer {

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
    public ColorMixer(Color colorA, Color colorB) {
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
    public Color getColorMix(float mixValue) {
        testMixValueRange(mixValue);
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
    public Color getColorA() {
        return colorA;
    }

    /**
     * Gets the color that dilutes
     *
     * @return a Color object
     * @see java.awt.Color
     */
    public Color getColorB() {
        return colorB;
    }

    private static void testMixValueRange(float mixValue) {
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
