package io.github.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class generates darker or lighter color tones.
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Color_tones {

    private final Color_mixer lighterTone;
    private final Color_mixer darkerTone;
    private final Color lighter05;
    private final Color lighter10;
    private final Color lighter15;
    private final Color lighter20;
    private final Color lighter25;
    private final Color lighter30;
    private final Color lighter35;
    private final Color lighter40;
    private final Color lighter45;
    private final Color lighter50;
    private final Color lighter55;
    private final Color lighter60;
    private final Color lighter65;
    private final Color lighter70;
    private final Color lighter75;
    private final Color lighter80;
    private final Color lighter85;
    private final Color lighter90;
    private final Color lighter95;
    private final Color white;
    private final Color darker05;
    private final Color darker10;
    private final Color darker15;
    private final Color darker20;
    private final Color darker25;
    private final Color darker30;
    private final Color darker35;
    private final Color darker40;
    private final Color darker45;
    private final Color darker50;
    private final Color darker55;
    private final Color darker60;
    private final Color darker65;
    private final Color darker70;
    private final Color darker75;
    private final Color darker80;
    private final Color darker85;
    private final Color darker90;
    private final Color darker95;
    private final Color black;

    /**
     * ColorTones constructor
     *
     * @param color The color to be lightened or darkened
     * @see java.awt.Color
     */
    public Color_tones(Color color) {
        lighterTone = new Color_mixer(color, new Color(255, 255, 255));
        darkerTone = new Color_mixer(color, new Color(0, 0, 0));
        lighter05 = lighterTone.get_color_mix(0.05f);
        lighter10 = lighterTone.get_color_mix(0.10f);
        lighter15 = lighterTone.get_color_mix(0.15f);
        lighter20 = lighterTone.get_color_mix(0.20f);
        lighter25 = lighterTone.get_color_mix(0.25f);
        lighter30 = lighterTone.get_color_mix(0.30f);
        lighter35 = lighterTone.get_color_mix(0.35f);
        lighter40 = lighterTone.get_color_mix(0.40f);
        lighter45 = lighterTone.get_color_mix(0.45f);
        lighter50 = lighterTone.get_color_mix(0.50f);
        lighter55 = lighterTone.get_color_mix(0.55f);
        lighter60 = lighterTone.get_color_mix(0.60f);
        lighter65 = lighterTone.get_color_mix(0.65f);
        lighter70 = lighterTone.get_color_mix(0.70f);
        lighter75 = lighterTone.get_color_mix(0.75f);
        lighter80 = lighterTone.get_color_mix(0.80f);
        lighter85 = lighterTone.get_color_mix(0.85f);
        lighter90 = lighterTone.get_color_mix(0.90f);
        lighter95 = lighterTone.get_color_mix(0.95f);
        white = lighterTone.get_color_mix(1.0f);
        darker05 = darkerTone.get_color_mix(0.05f);
        darker10 = darkerTone.get_color_mix(0.10f);
        darker15 = darkerTone.get_color_mix(0.15f);
        darker20 = darkerTone.get_color_mix(0.20f);
        darker25 = darkerTone.get_color_mix(0.25f);
        darker30 = darkerTone.get_color_mix(0.30f);
        darker35 = darkerTone.get_color_mix(0.35f);
        darker40 = darkerTone.get_color_mix(0.40f);
        darker45 = darkerTone.get_color_mix(0.45f);
        darker50 = darkerTone.get_color_mix(0.50f);
        darker55 = darkerTone.get_color_mix(0.55f);
        darker60 = darkerTone.get_color_mix(0.60f);
        darker65 = darkerTone.get_color_mix(0.65f);
        darker70 = darkerTone.get_color_mix(0.70f);
        darker75 = darkerTone.get_color_mix(0.75f);
        darker80 = darkerTone.get_color_mix(0.80f);
        darker85 = darkerTone.get_color_mix(0.85f);
        darker90 = darkerTone.get_color_mix(0.90f);
        darker95 = darkerTone.get_color_mix(0.95f);
        black = darkerTone.get_color_mix(1.0f);

    }

    /**
     * Returns base color
     *
     * @return base color
     */
    public Color get_color() {
        return lighterTone.get_color_a();
    }

    /**
     * Returns color that is blend of base color and 5% white
     *
     * @return color
     */
    public Color lighter_by_5() {
        return lighter05;
    }

    /**
     * Returns color that is blend of base color and 10% white
     *
     * @return color
     */
    public Color lighter_by_10() {
        return lighter10;
    }

    /**
     * Returns color that is blend of base color and 15% white
     *
     * @return color
     */
    public Color lighter_by_15() {
        return lighter15;
    }

    /**
     * Returns color that is blend of base color and 20% white
     *
     * @return color
     */
    public Color lighter_by_20() {
        return lighter20;
    }

    /**
     * Returns color that is blend of base color and 25% white
     *
     * @return color
     */
    public Color lighter_by_25() {
        return lighter25;
    }

    /**
     * Returns color that is blend of base color and 30% white
     *
     * @return color
     */
    public Color lighter_by_30() {
        return lighter30;
    }

    /**
     * Returns color that is blend of base color and 35% white
     *
     * @return color
     */
    public Color lighter_by_35() {
        return lighter35;
    }

    /**
     * Returns color that is blend of base color and 40% white
     *
     * @return color
     */
    public Color lighter_by_40() {
        return lighter40;
    }

    /**
     * Returns color that is blend of base color and 45% white
     *
     * @return color
     */
    public Color lighter_by_45() {
        return lighter45;
    }

    /**
     * Returns color that is blend of base color and 50% white
     *
     * @return color
     */
    public Color lighter_by_50() {
        return lighter50;
    }

    /**
     * Returns color that is blend of base color and 55% white
     *
     * @return color
     */
    public Color lighter_by_55() {
        return lighter55;
    }

    /**
     * Returns color that is blend of base color and 60% white
     *
     * @return color
     */
    public Color lighter_by_60() {
        return lighter60;
    }

    /**
     * Returns color that is blend of base color and 65% white
     *
     * @return color
     */
    public Color lighter_by_65() {
        return lighter65;
    }

    /**
     * Returns color that is blend of base color and 70% white
     *
     * @return color
     */
    public Color lighter_by_70() {
        return lighter70;
    }

    /**
     * Returns color that is blend of base color and 75% white
     *
     * @return color
     */
    public Color lighter_by_75() {
        return lighter75;
    }

    /**
     * Returns color that is blend of base color and 80% white
     *
     * @return color
     */
    public Color lighter_by_80() {
        return lighter80;
    }

    /**
     * Returns color that is blend of base color and 85% white
     *
     * @return color
     */
    public Color lighter_by_85() {
        return lighter85;
    }

    /**
     * Returns color that is blend of base color and 90% white
     *
     * @return color
     */
    public Color lighter_by_90() {
        return lighter90;
    }

    /**
     * Returns color that is blend of base color and 95% white
     *
     * @return color
     */
    public Color lighter_by_95() {
        return lighter95;
    }

    /**
     * Returns white color
     *
     * @return color
     */
    public Color get_white() {
        return white;
    }

    /**
     * Returns color that is blend of base color and 5% black
     *
     * @return color
     */
    public Color darker_by_5() {
        return darker05;
    }

    /**
     * Returns color that is blend of base color and 10% black
     *
     * @return color
     */
    public Color darker_by_10() {
        return darker10;
    }

    /**
     * Returns color that is blend of base color and 15% black
     *
     * @return color
     */
    public Color darker_by_15() {
        return darker15;
    }

    /**
     * Returns color that is blend of base color and 20% black
     *
     * @return color
     */
    public Color darker_by_20() {
        return darker20;
    }

    /**
     * Returns color that is blend of base color and 25% black
     *
     * @return color
     */
    public Color darker_by_25() {
        return darker25;
    }

    /**
     * Returns color that is blend of base color and 30% black
     *
     * @return color
     */
    public Color darker_by_30() {
        return darker30;
    }

    /**
     * Returns color that is blend of base color and 35% black
     *
     * @return color
     */
    public Color darker_by_35() {
        return darker35;
    }

    /**
     * Returns color that is blend of base color and 40% black
     *
     * @return color
     */
    public Color darker_by_40() {
        return darker40;
    }

    /**
     * Returns color that is blend of base color and 45% black
     *
     * @return color
     */
    public Color darker_by_45() {
        return darker45;
    }

    /**
     * Returns color that is blend of base color and 50% black
     *
     * @return color
     */
    public Color darker_by_50() {
        return darker50;
    }

    /**
     * Returns color that is blend of base color and 55% black
     *
     * @return color
     */
    public Color darker_by_55() {
        return darker55;
    }

    /**
     * Returns color that is blend of base color and 60% black
     *
     * @return color
     */
    public Color darker_by_60() {
        return darker60;
    }

    /**
     * Returns color that is blend of base color and 65% black
     *
     * @return color
     */
    public Color darker_by_65() {
        return darker65;
    }

    /**
     * Returns color that is blend of base color and 70% black
     *
     * @return color
     */
    public Color darker_by_70() {
        return darker70;
    }

    /**
     * Returns color that is blend of base color and 75% black
     *
     * @return color
     */
    public Color darker_by_75() {
        return darker75;
    }

    /**
     * Returns color that is blend of base color and 80% black
     *
     * @return color
     */
    public Color darker_by_80() {
        return darker80;
    }

    /**
     * Returns color that is blend of base color and 85% black
     *
     * @return color
     */
    public Color darker_by_85() {
        return darker85;
    }

    /**
     * Returns color that is blend of base color and 90% black
     *
     * @return color
     */
    public Color darker_by_90() {
        return darker90;
    }

    /**
     * Returns color that is blend of base color and 95% black
     *
     * @return color
     */
    public Color darker_by_95() {
        return darker95;
    }

    /**
     * Returns black color
     *
     * @return color
     */
    public Color get_black() {
        return black;
    }
}
