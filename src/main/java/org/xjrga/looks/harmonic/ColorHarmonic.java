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

    private final HarmonicColor harmonic0;
    private final HarmonicColor harmonic15;
    private final HarmonicColor harmonic30;
    private final HarmonicColor harmonic45;
    private final HarmonicColor harmonic60;
    private final HarmonicColor harmonic75;
    private final HarmonicColor harmonic90;
    private final HarmonicColor harmonic105;
    private final HarmonicColor harmonic120;
    private final HarmonicColor harmonic135;
    private final HarmonicColor harmonic150;
    private final HarmonicColor harmonic165;
    private final HarmonicColor harmonic180;
    private final HarmonicColor harmonic195;
    private final HarmonicColor harmonic210;
    private final HarmonicColor harmonic225;
    private final HarmonicColor harmonic240;
    private final HarmonicColor harmonic255;
    private final HarmonicColor harmonic270;
    private final HarmonicColor harmonic285;
    private final HarmonicColor harmonic300;
    private final HarmonicColor harmonic315;
    private final HarmonicColor harmonic330;
    private final HarmonicColor harmonic345;
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
        harmonic0 = new Harmonic0(color);
        harmonic15 = new Harmonic15(color);
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
        harmonic195 = new Harmonic195(color);
        harmonic210 = new Harmonic210(color);
        harmonic225 = new Harmonic225(color);
        harmonic240 = new Harmonic240(color);
        harmonic255 = new Harmonic255(color);
        harmonic270 = new Harmonic270(color);
        harmonic285 = new Harmonic285(color);
        harmonic300 = new Harmonic300(color);
        harmonic315 = new Harmonic315(color);
        harmonic330 = new Harmonic330(color);
        harmonic345 = new Harmonic345(color);
        list.add(harmonic0);
        list.add(harmonic15);
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
        list.add(harmonic195);
        list.add(harmonic210);
        list.add(harmonic225);
        list.add(harmonic240);
        list.add(harmonic255);
        list.add(harmonic270);
        list.add(harmonic285);
        list.add(harmonic300);
        list.add(harmonic315);
        list.add(harmonic330);
        list.add(harmonic345);
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
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic0() {
        return harmonic0.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic30() {
        return harmonic30.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic45() {
        return harmonic45.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic60() {
        return harmonic60.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic75() {
        return harmonic75.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic90() {
        return harmonic90.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic105() {
        return harmonic105.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic120() {
        return harmonic120.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic135() {
        return harmonic135.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic150() {
        return harmonic150.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic165() {
        return harmonic165.getColor();
    }

    /**
     * Returns complementary color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic180() {
        return harmonic180.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic195() {
        return harmonic195.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic210() {
        return harmonic210.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic225() {
        return harmonic225.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic240() {
        return harmonic240.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic255() {
        return harmonic255.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic270() {
        return harmonic270.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic285() {
        return harmonic285.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic300() {
        return harmonic300.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic315() {
        return harmonic315.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic330() {
        return harmonic330.getColor();
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public Color getHarmonic345() {
        return harmonic345.getColor();
    }

    public Iterator<HarmonicColor> getIterator() {
        return list.iterator();
    }

}
