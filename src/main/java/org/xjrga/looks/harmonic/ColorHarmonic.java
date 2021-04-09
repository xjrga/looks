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
        firstAnalogousColor = new Harmonic30(color);
        secondAnalogousColor = new Harmonic330(color);
        list.add(complementary);
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
