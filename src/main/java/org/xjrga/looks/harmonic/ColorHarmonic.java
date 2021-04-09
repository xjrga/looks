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
    private final Harmonic45 harmonic45;
    private final Harmonic60 harmonic60;
    private final Harmonic75 harmonic75;
    private final Harmonic90 harmonic90;
    private final Harmonic105 harmonic105;
    private final Harmonic120 harmonic120;
    private final Harmonic135 harmonic135;
    private final Harmonic150 harmonic150;
    private final Harmonic165 harmonic165;
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
        harmonic30 = new Harmonic30(color);
        harmonic45 = new Harmonic45(color);
        harmonic60 = new Harmonic60(color);
        harmonic75 = new Harmonic75(color);
        harmonic90 = new Harmonic90(color);
        harmonic105 = new Harmonic105(color);
        harmonic120 = new Harmonic120(color);
        harmonic135 = new Harmonic135(color);
        harmonic150 = new Harmonic150(color);
        harmonic165 = new Harmonic165(color);
        harmonic180 = new Harmonic180(color);
        harmonic330 = new Harmonic330(color);        
        list.add(harmonic30);
        list.add(harmonic45);
        list.add(harmonic60);
        list.add(harmonic75);
        list.add(harmonic90);
        list.add(harmonic105);
        list.add(harmonic120);
        list.add(harmonic135);
        list.add(harmonic150);
        list.add(harmonic165);        
        list.add(harmonic180);
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
