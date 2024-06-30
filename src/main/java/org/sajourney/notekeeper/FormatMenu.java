package org.sajourney.notekeeper;

import java.awt.*;

public class FormatMenu {
    public static void bold(){
        Font currentFont = Frame.textArea.getFont();
        Font boldfont = currentFont.deriveFont(Font.BOLD);
        Frame.textArea.setFont(boldfont);

    }
}
