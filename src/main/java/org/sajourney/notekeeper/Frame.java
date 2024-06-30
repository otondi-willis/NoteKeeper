package org.sajourney.notekeeper;
import javax.swing.*;
public class Frame {
    public static JFrame frame;
    public static JTextArea textArea;
    public static void main(String[] args){
        createFrame();
        createTextarea();
        createMenu();
        frame.setVisible(true);
    }
    public static void createFrame(){
        frame = new JFrame("Note Keeper");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void createTextarea(){
        textArea = new JTextArea();
        frame.add(textArea);

        JScrollPane scrollbar = new JScrollPane(textArea);
        scrollbar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollbar.setBorder(BorderFactory.createEmptyBorder());
        frame.add(scrollbar);
    }
    public static void createMenu(){
        JMenuBar menu = new JMenuBar();
        frame.setJMenuBar(menu);

        JMenu filemenu = new JMenu("File");
        menu.add(filemenu);
        JMenu editmenu = new JMenu("Edit");
        menu.add(editmenu);
        JMenu formatmenu = new JMenu("Format");
        menu.add(formatmenu);

        //Creating the file menu items
        JMenuItem New = new JMenuItem("New");
        New.addActionListener( e -> FileMenu.newFile());
        filemenu.add(New);

        JMenuItem open = new JMenuItem("Open");
        open.addActionListener( e -> FileMenu.openFile());
        filemenu.add(open);

        JMenuItem save = new JMenuItem("Save");
        save.addActionListener( e -> FileMenu.save());
        filemenu.add(save);

        JMenuItem saveAs = new JMenuItem("Save As");
        saveAs.addActionListener( e -> FileMenu.saveAs());
        filemenu.add(saveAs);

        //Creating edit menu items
        JMenuItem cutItem = new JMenuItem("Cut");
        editmenu.add(cutItem);

        JMenuItem copyItem = new JMenuItem("Copy");
        editmenu.add(copyItem);

        JMenuItem pasteItem = new JMenuItem("Paste");
        editmenu.add(pasteItem);

        JMenuItem selectItem = new JMenuItem("Select All");
        editmenu.add(selectItem);
    }

}
