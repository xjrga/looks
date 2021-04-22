package io.github.xjrga.looks.harmonic;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class generates harmonic color objects
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
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
    private final ArrayList<HarmonicColor> top;
    private final ArrayList<HarmonicColor> bottom;

    /**
     * ColorHarmonic constructor
     *
     * @param color the base color
     * @see java.awt.Color
     */
    public ColorHarmonic(Color color) {
        left = new ArrayList();
        right = new ArrayList();
        top = new ArrayList();
        bottom = new ArrayList();
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
        //left (clockwise)
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
        //right (counter-clockwise)
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
        //top (clockwise)
        top.add(harmonic90);
        top.add(harmonic105);
        top.add(harmonic120);
        top.add(harmonic135);
        top.add(harmonic150);
        top.add(harmonic165);
        top.add(harmonic180);
        top.add(harmonic195);
        top.add(harmonic210);
        top.add(harmonic225);
        top.add(harmonic240);
        top.add(harmonic255);
        top.add(harmonic270);
        //bottom (counter-clockwise)
        bottom.add(harmonic90);
        bottom.add(harmonic75);
        bottom.add(harmonic60);
        bottom.add(harmonic45);
        bottom.add(harmonic30);
        bottom.add(harmonic15);
        bottom.add(harmonic0);
        bottom.add(harmonic345);
        bottom.add(harmonic330);
        bottom.add(harmonic315);
        bottom.add(harmonic300);
        bottom.add(harmonic285);
        bottom.add(harmonic270);
        //left.sort(new HarmonicColorComparator());
        //right.sort(new HarmonicColorComparator());
        this.color = color;
    }

    /**
     * Returns base color
     *
     * @return color
     * @see java.awt.Color
     */
    public Color getBaseColor() {
        return color;
    }

    /**
     * Returns base color
     *
     * @return color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic0() {
        return harmonic0;
    }

    /**
     * Returns harmonic color 15
     *
     * @return color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic15() {
        return harmonic15;
    }

    /**
     * Returns harmonic color 30
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic30() {
        return harmonic30;
    }

    /**
     * Returns harmonic color 45
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic45() {
        return harmonic45;
    }

    /**
     * Returns harmonic color 60
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic60() {
        return harmonic60;
    }

    /**
     * Returns harmonic color 75
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic75() {
        return harmonic75;
    }

    /**
     * Returns harmonic color 90
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic90() {
        return harmonic90;
    }

    /**
     * Returns harmonic color 105
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic105() {
        return harmonic105;
    }

    /**
     * Returns harmonic color 120
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic120() {
        return harmonic120;
    }

    /**
     * Returns harmonic color 135
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic135() {
        return harmonic135;
    }

    /**
     * Returns harmonic color 150
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic150() {
        return harmonic150;
    }

    /**
     * Returns harmonic color 165
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic165() {
        return harmonic165;
    }

    /**
     * Returns harmonic color 180
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic180() {
        return harmonic180;
    }

    /**
     * Returns harmonic color 195
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic195() {
        return harmonic195;
    }

    /**
     * Returns harmonic color 210
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic210() {
        return harmonic210;
    }

    /**
     * Returns harmonic color 225
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic225() {
        return harmonic225;
    }

    /**
     * Returns harmonic color 240
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic240() {
        return harmonic240;
    }

    /**
     * Returns harmonic color 255
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic255() {
        return harmonic255;
    }

    /**
     * Returns harmonic color 270
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic270() {
        return harmonic270;
    }

    /**
     * Returns harmonic color 285
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic285() {
        return harmonic285;
    }

    /**
     * Returns harmonic color 300
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic300() {
        return harmonic300;
    }

    /**
     * Returns harmonic color 315
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic315() {
        return harmonic315;
    }

    /**
     * Returns harmonic color 330
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic330() {
        return harmonic330;
    }

    /**
     * Returns harmonic color 345
     *
     * @return a color
     * @see java.awt.Color
     */
    public HarmonicColor getHarmonic345() {
        return harmonic345;
    }

    /**
     * Returns quadrant II and III of color wheel with respect to base color
     *
     * @return
     */
    public Iterator<HarmonicColor> getLeftIterator() {
        return left.iterator();
    }

    /**
     * Returns quadrant I and IV of color wheel with respect to base color
     *
     * @return
     */
    public Iterator<HarmonicColor> getRightIterator() {
        return right.iterator();
    }

    /**
     * Returns quadrant II and I of color wheel with respect to base color
     *
     * @return
     */
    public Iterator<HarmonicColor> getTopIterator() {
        return top.iterator();
    }

    /**
     * Returns quadrant IV and III of color wheel with respect to base color
     *
     * @return
     */
    public Iterator<HarmonicColor> getBottomIterator() {
        return bottom.iterator();
    }

}
