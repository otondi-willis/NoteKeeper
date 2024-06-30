package org.sajourney.notekeeper;

import java.awt.*;

public class FormatMenu {
    public static void bold(){
        Font currentFont = Frame.textArea.getFont();
        Font boldfont = currentFont.deriveFont(Font.BOLD);
        Frame.textArea.setFont(boldfont);

    }
    public static void italic(){
        Font currentFont = Frame.textArea.getFont();
        Font italicfont = currentFont.deriveFont(Font.ITALIC);
        Frame.textArea.setFont(italicfont);

    }
}
