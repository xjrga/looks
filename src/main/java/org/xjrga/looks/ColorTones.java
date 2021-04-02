package org.xjrga.looks;

import java.awt.Color;

/**
 * This class generates darker or lighter color tones. 
 *
 * @author Jorge R Garcia de Alba
 */
public class ColorTones {

    private final ColorMixer lighterTone;
    private final ColorMixer darkerTone;
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
     */
    public ColorTones(Color color) {
        lighterTone = new ColorMixer(color, new Color(255, 255, 255));
        darkerTone = new ColorMixer(color, new Color(0, 0, 0));
        lighter05 = lighterTone.getColorMix(0.05f);
        lighter10 = lighterTone.getColorMix(0.10f);
        lighter15 = lighterTone.getColorMix(0.15f);
        lighter20 = lighterTone.getColorMix(0.20f);
        lighter25 = lighterTone.getColorMix(0.25f);
        lighter30 = lighterTone.getColorMix(0.30f);
        lighter35 = lighterTone.getColorMix(0.35f);
        lighter40 = lighterTone.getColorMix(0.40f);
        lighter45 = lighterTone.getColorMix(0.45f);
        lighter50 = lighterTone.getColorMix(0.50f);
        lighter55 = lighterTone.getColorMix(0.55f);
        lighter60 = lighterTone.getColorMix(0.60f);
        lighter65 = lighterTone.getColorMix(0.65f);
        lighter70 = lighterTone.getColorMix(0.70f);
        lighter75 = lighterTone.getColorMix(0.75f);
        lighter80 = lighterTone.getColorMix(0.80f);
        lighter85 = lighterTone.getColorMix(0.85f);
        lighter90 = lighterTone.getColorMix(0.90f);
        lighter95 = lighterTone.getColorMix(0.95f);
        white = lighterTone.getColorMix(1.0f);
        darker05 = darkerTone.getColorMix(0.05f);
        darker10 = darkerTone.getColorMix(0.10f);
        darker15 = darkerTone.getColorMix(0.15f);
        darker20 = darkerTone.getColorMix(0.20f);
        darker25 = darkerTone.getColorMix(0.25f);
        darker30 = darkerTone.getColorMix(0.30f);
        darker35 = darkerTone.getColorMix(0.35f);
        darker40 = darkerTone.getColorMix(0.40f);
        darker45 = darkerTone.getColorMix(0.45f);
        darker50 = darkerTone.getColorMix(0.50f);
        darker55 = darkerTone.getColorMix(0.55f);
        darker60 = darkerTone.getColorMix(0.60f);
        darker65 = darkerTone.getColorMix(0.65f);
        darker70 = darkerTone.getColorMix(0.70f);
        darker75 = darkerTone.getColorMix(0.75f);
        darker80 = darkerTone.getColorMix(0.80f);
        darker85 = darkerTone.getColorMix(0.85f);
        darker90 = darkerTone.getColorMix(0.90f);
        darker95 = darkerTone.getColorMix(0.95f);
        black = darkerTone.getColorMix(1.0f);

    }

    public Color getColor() {
        return lighterTone.getColorA();
    }

    public Color lighterBy5() {
        return lighter05;
    }

    public Color lighterBy10() {
        return lighter10;
    }

    public Color lighterBy15() {
        return lighter15;
    }

    public Color lighterBy20() {
        return lighter20;
    }

    public Color lighterBy25() {
        return lighter25;
    }

    public Color lighterBy30() {
        return lighter30;
    }

    public Color lighterBy35() {
        return lighter35;
    }

    public Color lighterBy40() {
        return lighter40;
    }

    public Color lighterBy45() {
        return lighter45;
    }

    public Color lighterBy50() {
        return lighter50;
    }

    public Color lighterBy55() {
        return lighter55;
    }

    public Color lighterBy60() {
        return lighter60;
    }

    public Color lighterBy65() {
        return lighter65;
    }

    public Color lighterBy70() {
        return lighter70;
    }

    public Color lighterBy75() {
        return lighter75;
    }

    public Color lighterBy80() {
        return lighter80;
    }

    public Color lighterBy85() {
        return lighter85;
    }

    public Color lighterBy90() {
        return lighter90;
    }

    public Color lighterBy95() {
        return lighter95;
    }

    public Color getWhite() {
        return white;
    }

    public Color darkerBy5() {
        return darker05;
    }

    public Color darkerBy10() {
        return darker10;
    }

    public Color darkerBy15() {
        return darker15;
    }

    public Color darkerBy20() {
        return darker20;
    }

    public Color darkerBy25() {
        return darker25;
    }

    public Color darkerBy30() {
        return darker30;
    }

    public Color darkerBy35() {
        return darker35;
    }

    public Color darkerBy40() {
        return darker40;
    }

    public Color darkerBy45() {
        return darker45;
    }

    public Color darkerBy50() {
        return darker50;
    }

    public Color darkerBy55() {
        return darker55;
    }

    public Color darkerBy60() {
        return darker60;
    }

    public Color darkerBy65() {
        return darker65;
    }

    public Color darkerBy70() {
        return darker70;
    }

    public Color darkerBy75() {
        return darker75;
    }

    public Color darkerBy80() {
        return darker80;
    }

    public Color darkerBy85() {
        return darker85;
    }

    public Color darkerBy90() {
        return darker90;
    }

    public Color darkerBy95() {
        return darker95;
    }

    public Color getBlack() {
        return black;
    }
}
