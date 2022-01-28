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
package io.github.xjrga.looks.harmonic;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Categorizer {

    private Harmonic_color color;

    /**
     * Constructs categorizer
     *
     */
    public Categorizer() {

    }

    /**
     *
     * @param color to be categorized
     */
    public void set_harmonic_color(Harmonic_color color) {
        this.color = color;
    }

    /**
     *
     * @return Temperature category (warm or cold)
     */
    public String get_color_temperature() {

        String tempRange = "Cold";

        if (color.get_angle() >= 0f && color.get_angle() <= 165f) {
            tempRange = "Warm";
        }

        return tempRange;
    }

    /**
     *
     * @return Position category with respect to starting point in color wheel
     * (center, left or right)
     */
    public String get_color_position_lr() {

        String side;

        if (color.get_angle_change() == 0f || color.get_angle_change() == 180f) {
            side = "Center";
        } else if (color.get_angle_change() > 0f && color.get_angle_change() < 180f) {
            side = "Left";
        } else {
            side = "Right";
        }

        return side;
    }

    /**
     *
     * @return Position category with respect to starting point in color wheel
     * (side, top or bottom)
     */
    public String get_color_position_tb() {

        String side;

        if (color.get_angle_change() == 90f || color.get_angle_change() == 270f) {
            side = "Side";
        } else if (color.get_angle_change() > 90f && color.get_angle_change() < 270f) {
            side = "Top";
        } else {
            side = "Bottom";
        }

        return side;
    }

    /**
     *
     * @return Color type category (analogous or complementary)
     */
    public String get_color_category() {

        String colorType;

        if (color.get_angle_change() == 180f) {
            colorType = "Complementary";
        } else if (color.get_angle_change() == 0f) {
            colorType = "Original";
        } else if (color.get_angle_change() == 90f) {
            colorType = "Analogous and Complementary";
        } else if (color.get_angle_change() == 270f) {
            colorType = "Analogous and Complementary";
        } else if (color.get_angle_change() > 0f && color.get_angle_change() < 90f) {
            colorType = "Analogous";
        } else if (color.get_angle_change() > 90f && color.get_angle_change() < 180f) {
            colorType = "Complementary";
        } else if (color.get_angle_change() > 180f && color.get_angle_change() < 270f) {
            colorType = "Complementary";
        } else {
            colorType = "Analogous";
        }

        return colorType;
    }

}
