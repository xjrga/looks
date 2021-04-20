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
package org.xjrga.looks.software;

import java.awt.Color;
import java.util.Comparator;
import org.xjrga.looks.harmonic.ColorGenerator;

/**
 * This class provides process for color comparison
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class ColorComparator implements Comparator {

    /**
     * Constructs ColorComparator
     *
     */
    public ColorComparator() {

    }

    @Override
    public int compare(Object o1, Object o2) {
        Color color01 = (Color) o1;
        Color color02 = (Color) o2;
        ColorGenerator colorGenerator01 = new ColorGenerator(color01);
        ColorGenerator colorGenerator02 = new ColorGenerator(color02);
        Float f01 = colorGenerator01.getHue();
        Float f02 = colorGenerator02.getHue();
        return f01.compareTo(f02);
    }

}
