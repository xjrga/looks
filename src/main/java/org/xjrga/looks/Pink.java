package org.xjrga.looks;

import java.awt.Font;
import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;
import org.xjrga.looks.Palette00;

public class Pink extends MetalTheme {

    private FontUIResource font;
    private ColorUIResource primary1;
    private ColorUIResource primary2;
    private ColorUIResource primary3;
    private ColorUIResource secondary1;
    private ColorUIResource secondary2;
    private ColorUIResource secondary3;

    /*
     * Pink Theme 
     * @author Jorge R Garcia de Alba
     */
    public Pink() {
        font = new FontUIResource("Dialog", Font.PLAIN, 13);
        //panel background
        secondary3 = new ColorUIResource(Palette00.PINK);
        //component background stuff
        secondary2 = new ColorUIResource(Palette00.PINK);
        //internal frame,component outlines,nonselected
        secondary1 = new ColorUIResource(Palette00.PINK);
        //internal frame,tooltip,tree,list -> selected
        primary3 = new ColorUIResource(Palette00.MEDIUMBLUE);
        //Highlights
        primary1 = new ColorUIResource(Palette00.GREEN);
        primary2 = new ColorUIResource(Palette00.LIGHTBLUE);
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
        //*UIManager.put("ProgressBar.border", BorderFactory.createLineBorder(Palette00.MEDIUMBLUE));
        //*UIManager.put("InternalFrame.border", BorderFactory.createLineBorder(Palette00.GREEN));
        //*UIManager.put("Table.gridColor", Palette00.GREEN);
        //UIManager.put("TabbedPane.selected", Palette00.PINK);
        //UIManager.put("TabbedPane.background", Palette00.LIGHTBLUE);
        //UIManager.put("ProgressBar.foreground", Palette00.PINK);
        //UIManager.put("ScrollBar.thumb", Palette00.PINK);
        //UIManager.put("Menu.selectionBackground", Palette00.PINK);
        //UIManager.put("CheckBoxMenuItem.selectionBackground", Palette00.PINK);
        //UIManager.put("RadioButtonMenuItem.selectionBackground", Palette00.PINK);
        //UIManager.put("MenuItem.selectionBackground", Palette00.PINK);
        //UIManager.put("Tree.selectionBackground", Palette00.PINK);        
        //UIManager.put("Slider.foreground", Palette00.DARKBLUE);        
        //UIManager.put("ComboBox.selectionBackground", Palette00.PINK);
        //UIManager.put("List.selectionBackground", Palette00.PINK);
        
        //Table.background
        //Table.focusCellBackground
        //Table.focusCellForeground
        //Table.focusCellHighlightBorder
        //Table.foreground
        //Table.gridColor
        //Table.scrollPaneBorder
        //Table.selectionBackground
        //ProgressBar.background
        //ProgressBar.backgroundHighlight           
        //✓ProgressBar.foreground
        //✓ProgressBar.border
        //ProgressBar.foregroundHighlight
        //ProgressBar.selectionBackground
        //ProgressBar.selectionForeground
        //✓TabbedPane.background
        //✓TabbedPane.darkShadow
        //✓TabbedPane.focus
        //✓TabbedPane.foreground
        //TabbedPane.highlight
        //TabbedPane.lightHighlight
        //TabbedPane.nonSelected
        //✓TabbedPane.selected        
        //✓TabbedPane.selectHighlight
        //TabbedPane.shadow
        //TabbedPane.tabAreaBackground
        //TabbedPane.unselectedTabBackground
        //TabbedPane.unselectedTabForeground
        //TabbedPane.unselectedTabHighlight
        //TabbedPane.unselectedTabShadow
        //✓CheckBox.background
        //CheckBox.border
        //CheckBox.darkShadow
        //CheckBox.disabledText
        //✓CheckBox.focus        
        //✓CheckBox.foreground
        //CheckBox.highlight
        //✓CheckBox.icon        
        //Checkbox.select
        //CheckBox.shadow
        //✓List.background
        //✓List.border        
        //✓List.focusCellHighlightBorder        
        //✓List.foreground
        //✓List.selectionBackground
        //✓List.selectionForeground
        //✓ComboBox.background
        //ComboBox.border
        //ComboBox.control
        //ComboBox.controlForeground
        //ComboBox.disabledBackground
        //ComboBox.disabledForeground
        //ComboBox.font
        //✓ComboBox.foreground
        //ComboBox.listBackground
        //ComboBox.listForeground
        //✓ComboBox.selectionBackground
        //✓ComboBox.selectionForeground
        //✓Slider.background
        //✓Slider.border
        //Slider.darkShadow
        //Slider.focus
        //Slider.focusInsets
        //✓Slider.foreground
        //Slider.highlight
        //✓Slider.horizontalThumbIcon
        //Slider.majorTickLength
        //Slider.minorTickLength
        //Slider.shadow
        //Slider.thumb
        //Slider.trackWidth
        //✓Slider.verticalThumbIcon
        //✓Tree.closedIcon        
        //✓Tree.collapsedIcon
        //✓Tree.expandedIcon
        //✓Tree.leafIcon
        //✓Tree.openIcon
        //Tree.editorBorder
        //✓Tree.background
        //Tree.editorBorderSelectionColor
        //Tree.foreground
        //✓Tree.hash
        //Tree.iconBackground
        //Tree.iconForeground
        //Tree.iconHighlight
        //Tree.iconShadow
        //Tree.line
        //✓Tree.selectionBackground
        //✓Tree.selectionBorderColor
        //✓Tree.selectionForeground
        //✓Tree.textBackground
        //✓Tree.textForeground
        //InternalFrame.paletteBorder
        //InternalFrame.windowShadeBorder
        //✓InternalFrame.border
        //InternalFrame.activeTitleBackground
        //InternalFrame.activeTitleForeground
        //InternalFrame.inactiveTitleBackground
        //InternalFrame.inactiveTitleForeground
        //InternalFrame.minimizeIconBackground
        //RadioButtonMenuItem.acceleratorForeground
        //RadioButtonMenuItem.acceleratorSelectionForeground
        //RadioButtonMenuItem.background
        //✓RadioButtonMenuItem.selectionBackground
        //✓RadioButtonMenuItem.selectionForeground
        //CheckBoxMenuItem.acceleratorFont
        //CheckBoxMenuItem.acceleratorForeground
        //CheckBoxMenuItem.acceleratorSelectionForeground
        //CheckBoxMenuItem.arrowlcon
        //CheckBoxMenuItem.background
        //CheckBoxMenuItem.border
        //CheckBoxMenuItem.borderPainted
        //CheckBoxMenuItem.checklcon
        //CheckBoxMenuItem.disabledForeground
        //CheckBoxMenuItem.font
        //CheckBoxMenuItem.foreground
        //CheckBoxMenuItem.margin
        //✓CheckBoxMenuItem.selectionBackground
        //CheckBoxMenuItem.selectionForeground
        //✓Menu.foreground
        //Menu.margin
        //✓Menu.selectionBackground
        //✓Menu.selectionForeground
        //MenuItem.acceleratorForeground
        //MenuItem.acceleratorSelectionForeground
        //MenuItem.background
        //MenuItem.border
        //MenuItem.borderPainted
        //MenuItem.checkIcon
        //MenuItem.disabledForeground
        //MenuItem.font
        //MenuItem.foreground
        //MenuItem.margin
        //✓MenuItem.selectionBackground
        //MenuItem.selectionForeground
        //BorderFactory.createLineBorder(Color.black);
        //BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
        //BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        //BorderFactory.createRaisedBevelBorder();
        //BorderFactory.createLoweredBevelBorder();
        //BorderFactory.createEmptyBorder();                     
        //✓ScrollBar.background
        //✓ScrollBar.darkShadow
        //✓ScrollBar.thumb
        //✓ScrollBar.thumbHighlight        
        //✓ScrollBar.thumbShadow
        //✓ScrollBar.width
        //✓ScrollBar.border        
        //scrollbar                
        //ScrollBar.foreground
        //ScrollBar.highlight
        //ScrollBar.maximumThumbSize
        //ScrollBar.minimumThumbSize
        //ScrollBar.shadow        
        //ScrollBar.thumbDarkShadow       
        //ScrollBar.thumbLightShadow
        //ScrollBar.track
        //ScrollBar.trackHighlight        
        //TabbedPane.background
        //TabbedPane.contentBorder
        //TabbedPane.darkShadow
        //TabbedPane.focus
        //TabbedPane.font
        //TabbedPane.foreground
        //TabbedPane.highlight
        //TabbedPane.lightHighlight
        //TabbedPane.nonSelected
        //TabbedPane.selected
        //TabbedPane.selectedTabPadlnsets
        //TabbedPane.selectHighlight
        //TabbedPane.shadow
        //TabbedPane.tabAreaBackground
        //TabbedPane.tabAreainsets
        //TabbedPane.tabInsets
        //TabbedPane.tabRunOverlay
        //TabbedPane.textlconGap
    }

    @Override
    public String getName() {
        return "Pink";
    }

    @Override
    public ColorUIResource getPrimary1() {
        return primary1;
    }

    @Override
    public ColorUIResource getPrimary2() {
        return primary2;
    }

    @Override
    public ColorUIResource getPrimary3() {
        return primary3;
    }

    @Override
    public ColorUIResource getSecondary1() {
        return secondary1;
    }

    @Override
    public ColorUIResource getSecondary2() {
        return secondary2;
    }

    @Override
    public ColorUIResource getSecondary3() {
        return secondary3;
    }

    @Override
    public FontUIResource getControlTextFont() {
        return font;
    }

    @Override
    public FontUIResource getSystemTextFont() {
        return font;
    }

    @Override
    public FontUIResource getUserTextFont() {
        return font;
    }

    @Override
    public FontUIResource getMenuTextFont() {
        return font;
    }

    @Override
    public FontUIResource getWindowTitleFont() {
        return font;
    }

    @Override
    public FontUIResource getSubTextFont() {
        return font;
    }

}
