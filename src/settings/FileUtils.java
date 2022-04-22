package settings;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class FileUtils {
    public static void saveFile(String text) {
        ////////////////////////////////////////////////////////////////////////////////////////////////
        //JFileChooser look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////
        //choosing directory to create file
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save output");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text file", "txt"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String fileName = fileToSave.getAbsolutePath();
            if (!fileName.endsWith(".txt")) {
                fileName += ".txt";
            }
            //searching for duplicates
            File file = new File(fileName);
            if (file.exists()) {
                int response = JOptionPane.showConfirmDialog(null, "File already exists. Overwrite?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.NO_OPTION) {
                    return;
                }
            }
            //saving file
            try {
                java.io.FileWriter fileWriter = new java.io.FileWriter(file);
                fileWriter.write(text);
                fileWriter.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error saving file", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
