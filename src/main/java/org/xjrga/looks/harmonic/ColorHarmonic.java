package org.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class generates harmonic color objects
 *
 * @author Jorge R Garcia de Alba
 */
public class ColorHarmonic {

    private final ComplementaryColor complementary;
    private final FirstTriadicColor firstTriadicColor;
    private final SecondTriadicColor secondTriadicColor;
    private final FirstTetradicColor firstTetradicColor;
    private final SecondTetradicColor secondTetradicColor;
    private final ThirdTetradicColor thirdTetradicColor;
    private final FirstSplitComplementaryColor firstSplitComplementaryColor;
    private final SecondSplitComplementaryColor secondSplitComplementaryColor;
    private final FirstAnalogousColor firstAnalogousColor;
    private final SecondAnalogousColor secondAnalogousColor;
    private final Color color;

    /**
     * ColorHarmonic constructor
     *
     * @param color the base color
     * @see java.awt.Color
     */
    public ColorHarmonic(Color color) {
        complementary = new ComplementaryColor(color);
        firstTriadicColor = new FirstTriadicColor(color);
        secondTriadicColor = new SecondTriadicColor(color);
        firstTetradicColor = new FirstTetradicColor(color);
        secondTetradicColor = new SecondTetradicColor(color);
        thirdTetradicColor = new ThirdTetradicColor(color);
        firstSplitComplementaryColor = new FirstSplitComplementaryColor(color);
        secondSplitComplementaryColor = new SecondSplitComplementaryColor(color);
        firstAnalogousColor = new FirstAnalogousColor(color);
        secondAnalogousColor = new SecondAnalogousColor(color);
        this.color = color;
    }

    /**
     * Returns base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getBaseColor() {
        return color;
    }

    /**
     * Returns complementary color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getComplementaryColor() {
        return complementary.getColor();
    }

    /**
     * Returns first triadic color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getFirstTriadicColor() {
        return firstTriadicColor.getColor();
    }

    /**
     * Returns second triadic color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getSecondTriadicColor() {
        return secondTriadicColor.getColor();
    }

    /**
     * Returns first tetradic color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getFirstTetradicColor() {
        return firstTetradicColor.getColor();
    }

    /**
     * Returns second tetradic color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getSecondTetradicColor() {
        return secondTetradicColor.getColor();
    }

    /**
     * Returns third tetradic color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getThirdTetradicColor() {
        return thirdTetradicColor.getColor();
    }

    /**
     * Returns first split complementary color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getFirstSplitComplementaryColor() {
        return firstSplitComplementaryColor.getColor();
    }

    /**
     * Returns second split complementary color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getSecondSplitComplementaryColor() {
        return secondSplitComplementaryColor.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getFirstAnalogousColor() {
        return firstAnalogousColor.getColor();
    }

    /**
     * Returns second analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getSecondAnalogousColor() {
        return secondAnalogousColor.getColor();
    }

}
