package org.sajourney.notekeeper;

import javax.swing.*;
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
    public static void fontColor(){
        Color selectedColor = JColorChooser.showDialog(null, "Select Font Color", Color.BLACK);
        if (selectedColor != null){
            Frame.textArea.setForeground(selectedColor);
        }

    }
}
