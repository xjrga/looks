package org.xjrga.looks.harmonic;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class generates harmonic color objects
 *
 * @author Jorge R Garcia de Alba
 */
public class ColorHarmonic {

    private final Harmonic180 complementary;
    private final FirstTriadicColor firstTriadicColor;
    private final SecondTriadicColor secondTriadicColor;
    private final FirstTetradicColor firstTetradicColor;
    private final SecondTetradicColor secondTetradicColor;
    private final ThirdTetradicColor thirdTetradicColor;
    private final FirstSplitComplementaryColor firstSplitComplementaryColor;
    private final SecondSplitComplementaryColor secondSplitComplementaryColor;
    private final Harmonic30 firstAnalogousColor;
    private final Harmonic330 secondAnalogousColor;
    private final Color color;
    private final ArrayList<HarmonicColor> list;

    /**
     * ColorHarmonic constructor
     *
     * @param color the base color
     * @see java.awt.Color
     */
    public ColorHarmonic(Color color) {        
        list = new ArrayList();
        complementary = new Harmonic180(color);
        firstTriadicColor = new FirstTriadicColor(color);
        secondTriadicColor = new SecondTriadicColor(color);
        firstTetradicColor = new FirstTetradicColor(color);
        secondTetradicColor = new SecondTetradicColor(color);
        thirdTetradicColor = new ThirdTetradicColor(color);
        firstSplitComplementaryColor = new FirstSplitComplementaryColor(color);
        secondSplitComplementaryColor = new SecondSplitComplementaryColor(color);
        firstAnalogousColor = new Harmonic30(color);
        secondAnalogousColor = new Harmonic330(color);
        list.add(complementary);
        list.add(firstTriadicColor);
        list.add(secondTriadicColor);
        list.add(firstTetradicColor);
        list.add(secondTetradicColor);
        list.add(thirdTetradicColor);
        list.add(firstSplitComplementaryColor);
        list.add(secondSplitComplementaryColor);
        list.add(firstAnalogousColor);
        list.add(secondAnalogousColor);
        list.sort(new HarmonicColorComparator());
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

    public Iterator<HarmonicColor> getIterator() {
        return list.iterator();
    }

}
