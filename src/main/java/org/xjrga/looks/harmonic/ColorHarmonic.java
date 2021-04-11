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
    private final ArrayList<HarmonicColor> left;
    private final ArrayList<HarmonicColor> right;

    /**
     * ColorHarmonic constructor
     *
     * @param color the base color
     * @see java.awt.Color
     */
    public ColorHarmonic(Color color) {
        left = new ArrayList();
        right = new ArrayList();
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
        left.add(harmonic0);
        left.add(harmonic15);
        left.add(harmonic30);
        left.add(harmonic45);
        left.add(harmonic60);
        left.add(harmonic75);
        left.add(harmonic90);
        left.add(harmonic105);
        left.add(harmonic120);
        left.add(harmonic135);
        left.add(harmonic150);
        left.add(harmonic165);
        left.add(harmonic180);        
        right.add(harmonic0);
        right.add(harmonic345);
        right.add(harmonic330);
        right.add(harmonic315);
        right.add(harmonic300);
        right.add(harmonic285);
        right.add(harmonic270);
        right.add(harmonic255);
        right.add(harmonic240);
        right.add(harmonic225);
        right.add(harmonic210);
        right.add(harmonic195);     
        right.add(harmonic180);
        //left.sort(new HarmonicColorComparator());
        //right.sort(new HarmonicColorComparator());
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
    public HarmonicColor getHarmonic0() {
        return harmonic0;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic30() {
        return harmonic30;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic45() {
        return harmonic45;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic60() {
        return harmonic60;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic75() {
        return harmonic75;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic90() {
        return harmonic90;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic105() {
        return harmonic105;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic120() {
        return harmonic120;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic135() {
        return harmonic135;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic150() {
        return harmonic150;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic165() {
        return harmonic165;
    }

    /**
     * Returns complementary color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic180() {
        return harmonic180;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic195() {
        return harmonic195;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic210() {
        return harmonic210;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic225() {
        return harmonic225;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic240() {
        return harmonic240;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic255() {
        return harmonic255;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic270() {
        return harmonic270;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic285() {
        return harmonic285;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic300() {
        return harmonic300;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic315() {
        return harmonic315;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic330() {
        return harmonic330;
    }

    /**
     * Returns first analogous color with respect to base color
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic345() {
        return harmonic345;
    }

    public Iterator<HarmonicColor> getLeftIterator() {
        return left.iterator();
    }
    
    public Iterator<HarmonicColor> getRightIterator() {
        return right.iterator();
    }

}
