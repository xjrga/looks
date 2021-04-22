/*
 * Copyright (C) 2021 Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt
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
package com.github.xjrga.looks.harmonic;

import java.util.Comparator;

/**
 * This class enables color comparisons by hue
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class HarmonicColorComparator implements Comparator<HarmonicColor> {

    /**
     * Constructs harmonic color comparator
     *
     */
    public HarmonicColorComparator() {

    }

    @Override
    public int compare(HarmonicColor o1, HarmonicColor o2) {
        float angle1 = o1.getAngleChange();
        float angle2 = o2.getAngleChange();
        if (angle1 < angle2) {
            return -1;
        }
        if (angle1 > angle2) {
            return 1;
        }
        return 0;
    }
}
