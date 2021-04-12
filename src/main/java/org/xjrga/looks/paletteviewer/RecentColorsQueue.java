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
package org.xjrga.looks.paletteviewer;

import java.util.LinkedList;

/**
 *
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 * @param <Color>
 */
public class RecentColorsQueue<Color> {

    private final LinkedList<Color> list;

    public RecentColorsQueue() {
        list = new LinkedList();
    }

    public Color getHead() {
        return list.poll();
    }

    public void enqueue(Color color) {
        list.add(color);
        if (list.size() > 35) {
            dequeue();
        }
    }

    public Color dequeue() {
        return list.remove(list.size() - 1);
    }

    public void clear() {
        list.clear();
    }
}
