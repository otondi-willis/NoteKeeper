package org.sajourney.notekeeper;
import javax.swing.*;
public class Frame {
    public static JFrame frame;
    public static JTextArea textArea;
    public static void main(String[] args){
        createFrame();
        createTextarea();
        frame.setVisible(true);
    }
    public static void createFrame(){
        frame = new JFrame("Note Keeper");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void createTextarea(){
        textArea = new JTextArea();
        frame.add(textArea);
    }

}
