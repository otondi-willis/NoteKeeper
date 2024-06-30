package org.sajourney.notekeeper;

public class Edit {
    public static void cut(){
        Frame.textArea.cut();
    }
    public static void copy(){
        Frame.textArea.copy();
    }
    public static void paste(){
        Frame.textArea.paste();
    }
    public static void selectAll(){
        Frame.textArea.selectAll();
    }
}
