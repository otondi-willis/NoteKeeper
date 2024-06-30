package org.sajourney.notekeeper;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileMenu {
    public static JFrame frame;
    public static String fileName;
    public static String filePath;
    public static String directory;
    public static void newFile(){
        Frame.textArea.setText(" ");
        Frame.frame.setTitle("New");
    }
    public static void openFile(){
        FileDialog filedialog = new FileDialog(frame, "Open File", FileDialog.LOAD);
        filedialog.setVisible(true);

        if (filedialog.getFile() != null){
            directory = filedialog.getDirectory();
            fileName = filedialog.getFile();
            filePath = directory + fileName;
            Frame.frame.setTitle(fileName);

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
                String Line;
                Frame.textArea.setText("");
                while ((Line = reader.readLine()) != null){
                    Frame.textArea.append( Line + "\n");
                }
            }
            catch (IOException e) {
                System.out.println("File not opened");
            }

        }
    }
}
