package org.xjrga.looks.harmonic;

import java.awt.Color;

/**
 * This class generates harmonic colors
 *
 * @author Jorge R Garcia de Alba
 */
public class ColorHarmonic {
    
    private final ComplementaryColor complementary;
    private final FirstTriadicColor firstTriadicColor;
    private final SecondTriadicColor secondTriadicColor;
    private final FirstTetradicColor firstTetradicColor;
    private final SecondTetradicColor secondTetradicColor;
    private final ThirdTetradicColor thirdTetradicColor;
    private final FirstSplitComplementaryColor firstSplitComplementaryColor;
    private final SecondSplitComplementaryColor secondSplitComplementaryColor;
    private final FirstAnalogousColor firstAnalogousColor;
    private final SecondAnalogousColor secondAnalogousColor;  
    private final Color color;

    public ColorHarmonic(Color color) {        
        complementary = new ComplementaryColor(color);
        firstTriadicColor = new FirstTriadicColor(color);
        secondTriadicColor = new SecondTriadicColor(color);
        firstTetradicColor = new FirstTetradicColor(color);
        secondTetradicColor = new SecondTetradicColor(color);
        thirdTetradicColor = new ThirdTetradicColor(color);
        firstSplitComplementaryColor = new FirstSplitComplementaryColor(color);
        secondSplitComplementaryColor = new SecondSplitComplementaryColor(color);
        firstAnalogousColor = new FirstAnalogousColor(color);
        secondAnalogousColor = new SecondAnalogousColor(color);
        this.color = color;
    }
    
    public Color getBaseColor() {
        return color;
    }

    public Color getComplementaryColor() {
        return complementary.getColor();
    }
    
    public Color getFirstTriadicColor(){
        return firstTriadicColor.getColor();
    }
    
    public Color getSecondTriadicColor(){
        return secondTriadicColor.getColor();
    }
    
    public Color getFirstTetradicColor(){
        return firstTetradicColor.getColor();
    }
    
    public Color getSecondTetradicColor(){
        return secondTetradicColor.getColor();
    }
    
    public Color getThirdTetradicColor(){
        return thirdTetradicColor.getColor();
    }

    public Color getFirstSplitComplementaryColor(){
        return firstSplitComplementaryColor.getColor();
    }
    
    public Color getSecondSplitComplementaryColor(){
        return secondSplitComplementaryColor.getColor();
    }
   
    public Color getFirstAnalogousColor(){
        return firstAnalogousColor.getColor();
    }
    
    public Color getSecondAnalogousColor(){
        return secondAnalogousColor.getColor();
    }
        
}
