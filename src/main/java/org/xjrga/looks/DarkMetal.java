package org.xjrga.looks;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;

/**
 *
 */
public class DarkMetal extends MetalTheme {

    private final ColorUIResource primary1 = new ColorUIResource(new Color(121, 121, 125));
    private final ColorUIResource primary2 = new ColorUIResource(new Color(71, 71, 75));
    private final ColorUIResource primary3 = new ColorUIResource(new Color(99, 99, 99));
    private final ColorUIResource secondary1 = new ColorUIResource(new Color(113, 113, 113));
    private final ColorUIResource secondary2 = new ColorUIResource(new Color(91, 91, 95));
    private final ColorUIResource secondary3 = new ColorUIResource(new Color(51, 51, 55));
    private final ColorUIResource black = new ColorUIResource(new Color(222, 222, 222));
    private final ColorUIResource white = new ColorUIResource(new Color(18, 30, 49));

    @Override
    public String getName() {
        return "Dark Theme";
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);        
    }

    protected ColorUIResource getPrimary1() {
        return primary1;
    }

    @Override
    protected ColorUIResource getPrimary2() {
        return primary2;
    }

    @Override
    protected ColorUIResource getPrimary3() {
        return primary3;
    }

    @Override
    protected ColorUIResource getSecondary1() {
        return secondary1;
    }

    @Override
    protected ColorUIResource getSecondary2() {
        return secondary2;
    }

    @Override
    protected ColorUIResource getSecondary3() {
        return secondary3;
    }

    @Override
    protected ColorUIResource getWhite() {
        return white;
    }

    @Override
    protected ColorUIResource getBlack() {
        return black;
    }

    @Override
    public FontUIResource getControlTextFont() {
        return DEFAULT_FONT;
    }

    @Override
    public FontUIResource getSystemTextFont() {
        return DEFAULT_FONT;
    }

    @Override
    public FontUIResource getUserTextFont() {
        return DEFAULT_FONT;
    }

    @Override
    public FontUIResource getMenuTextFont() {
        return DEFAULT_FONT;
    }

    @Override
    public FontUIResource getWindowTitleFont() {
        return DEFAULT_FONT;
    }

    @Override
    public FontUIResource getSubTextFont() {
        return DEFAULT_FONT;
    }

    private final static FontUIResource DEFAULT_FONT = new FontUIResource("Dialog", Font.PLAIN, 11); //NOI18N
}
