package org.modelcatalogue.spreadsheet.builder.api;

import org.modelcatalogue.spreadsheet.api.Color;
import org.modelcatalogue.spreadsheet.api.FontStyle;
import org.modelcatalogue.spreadsheet.api.HTMLColors;

public interface FontDefinition extends HTMLColors, FontStylesProvider {

    void color(String hexColor);
    void color(Color color);
    
    void size(int size);
    void name(String name);

    void make(FontStyle first, FontStyle... other);

}
