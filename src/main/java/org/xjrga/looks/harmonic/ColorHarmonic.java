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

    private final Harmonic30 harmonic30;
    private final Harmonic180 harmonic180;    
    private final Harmonic330 harmonic330;
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
        harmonic180 = new Harmonic180(color);        
        harmonic30 = new Harmonic30(color);
        harmonic330 = new Harmonic330(color);
        list.add(harmonic180);
        list.add(harmonic30);
        list.add(harmonic330);
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
        return harmonic180.getColor();
    }
   
    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getFirstAnalogousColor() {
        return harmonic30.getColor();
    }

    /**
     * Returns second analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getSecondAnalogousColor() {
        return harmonic330.getColor();
    }

    public Iterator<HarmonicColor> getIterator() {
        return list.iterator();
    }

}
