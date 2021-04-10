/*
 * Copyright (C) 2021 Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.xjrga.looks.harmonic;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Categorizer {

    private HarmonicColor color;

    public Categorizer() {
        
    }
    
    public void setHarmonicColor(HarmonicColor color){
        this.color = color;
    }

    public String getColorTemperature() {
        return findTemperature(color);
    }

    public String getColorCategory() {
        return "";
    }

    private String findTemperature(HarmonicColor color) {

        String tempRange = "Cold";

        if (color.getAngle() >= 0f && color.getAngle() <= 165f) {
            tempRange = "Warm";
        }

        return tempRange;
    }

}
