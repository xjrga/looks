package io.github.xjrga.looks.harmonic;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class generates harmonic color objects
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Color_harmonic {

    private final Harmonic_color harmonic0;
    private final Harmonic_color harmonic15;
    private final Harmonic_color harmonic30;
    private final Harmonic_color harmonic45;
    private final Harmonic_color harmonic60;
    private final Harmonic_color harmonic75;
    private final Harmonic_color harmonic90;
    private final Harmonic_color harmonic105;
    private final Harmonic_color harmonic120;
    private final Harmonic_color harmonic135;
    private final Harmonic_color harmonic150;
    private final Harmonic_color harmonic165;
    private final Harmonic_color harmonic180;
    private final Harmonic_color harmonic195;
    private final Harmonic_color harmonic210;
    private final Harmonic_color harmonic225;
    private final Harmonic_color harmonic240;
    private final Harmonic_color harmonic255;
    private final Harmonic_color harmonic270;
    private final Harmonic_color harmonic285;
    private final Harmonic_color harmonic300;
    private final Harmonic_color harmonic315;
    private final Harmonic_color harmonic330;
    private final Harmonic_color harmonic345;
    private final Color color;
    private final ArrayList<Harmonic_color> left;
    private final ArrayList<Harmonic_color> right;
    private final ArrayList<Harmonic_color> top;
    private final ArrayList<Harmonic_color> bottom;

    /**
     * ColorHarmonic constructor
     *
     * @param color the base color
     * @see java.awt.Color
     */
    public Color_harmonic(Color color) {
        left = new ArrayList();
        right = new ArrayList();
        top = new ArrayList();
        bottom = new ArrayList();
        harmonic0 = new Harmonic_0(color);
        harmonic15 = new Harmonic_15(color);
        harmonic30 = new Harmonic_30(color);
        harmonic45 = new Harmonic_45(color);
        harmonic60 = new Harmonic_60(color);
        harmonic75 = new Harmonic_75(color);
        harmonic90 = new Harmonic_90(color);
        harmonic105 = new Harmonic_105(color);
        harmonic120 = new Harmonic_120(color);
        harmonic135 = new Harmonic_135(color);
        harmonic150 = new Harmonic_150(color);
        harmonic165 = new Harmonic_165(color);
        harmonic180 = new Harmonic_180(color);
        harmonic195 = new Harmonic_195(color);
        harmonic210 = new Harmonic_210(color);
        harmonic225 = new Harmonic_225(color);
        harmonic240 = new Harmonic_240(color);
        harmonic255 = new Harmonic_255(color);
        harmonic270 = new Harmonic_270(color);
        harmonic285 = new Harmonic_285(color);
        harmonic300 = new Harmonic_300(color);
        harmonic315 = new Harmonic_315(color);
        harmonic330 = new Harmonic_330(color);
        harmonic345 = new Harmonic_345(color);
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
    public Color get_base_color() {
        return color;
    }

    /**
     * Returns base color
     *
     * @return color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_0() {
        return harmonic0;
    }

    /**
     * Returns harmonic color 15
     *
     * @return color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_15() {
        return harmonic15;
    }

    /**
     * Returns harmonic color 30
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_30() {
        return harmonic30;
    }

    /**
     * Returns harmonic color 45
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_45() {
        return harmonic45;
    }

    /**
     * Returns harmonic color 60
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_60() {
        return harmonic60;
    }

    /**
     * Returns harmonic color 75
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_75() {
        return harmonic75;
    }

    /**
     * Returns harmonic color 90
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_90() {
        return harmonic90;
    }

    /**
     * Returns harmonic color 105
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_105() {
        return harmonic105;
    }

    /**
     * Returns harmonic color 120
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_120() {
        return harmonic120;
    }

    /**
     * Returns harmonic color 135
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_135() {
        return harmonic135;
    }

    /**
     * Returns harmonic color 150
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_150() {
        return harmonic150;
    }

    /**
     * Returns harmonic color 165
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_165() {
        return harmonic165;
    }

    /**
     * Returns harmonic color 180
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_180() {
        return harmonic180;
    }

    /**
     * Returns harmonic color 195
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_195() {
        return harmonic195;
    }

    /**
     * Returns harmonic color 210
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_210() {
        return harmonic210;
    }

    /**
     * Returns harmonic color 225
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_225() {
        return harmonic225;
    }

    /**
     * Returns harmonic color 240
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_240() {
        return harmonic240;
    }

    /**
     * Returns harmonic color 255
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_255() {
        return harmonic255;
    }

    /**
     * Returns harmonic color 270
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_270() {
        return harmonic270;
    }

    /**
     * Returns harmonic color 285
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_285() {
        return harmonic285;
    }

    /**
     * Returns harmonic color 300
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_300() {
        return harmonic300;
    }

    /**
     * Returns harmonic color 315
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_315() {
        return harmonic315;
    }

    /**
     * Returns harmonic color 330
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_330() {
        return harmonic330;
    }

    /**
     * Returns harmonic color 345
     *
     * @return a color
     * @see java.awt.Color
     */
    public Harmonic_color get_hue_change_345() {
        return harmonic345;
    }

    /**
     * Returns quadrant II and III of color wheel with respect to base color
     *
     * @return Iterator&lt;Harmonic_color&gt;
     */
    public Iterator<Harmonic_color> get_left_iterator() {
        return left.iterator();
    }

    /**
     * Returns quadrant I and IV of color wheel with respect to base color
     *
     * @return Iterator&lt;Harmonic_color&gt;
     */
    public Iterator<Harmonic_color> get_right_iterator() {
        return right.iterator();
    }

    /**
     * Returns quadrant II and I of color wheel with respect to base color
     *
     * @return Iterator&lt;Harmonic_color&gt;
     */
    public Iterator<Harmonic_color> get_top_iterator() {
        return top.iterator();
    }

    /**
     * Returns quadrant IV and III of color wheel with respect to base color
     *
     * @return Iterator&lt;Harmonic_color&gt;
     */
    public Iterator<Harmonic_color> get_bottom_iterator() {
        return bottom.iterator();
    }

}
