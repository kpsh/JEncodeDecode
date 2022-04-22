package settings;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Theme {
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //dark theme colors
    public static void darkMode(JTextArea inputArea, JTextArea outputArea,
                                JComboBox<String> method, JButton encode,
                                JButton decode, JButton copy, JButton save,
                                JButton minimize, JButton maximize, JCheckBox darkMode) {
        inputArea.setBackground(Color.DARK_GRAY);
        inputArea.setForeground(Color.WHITE);
        outputArea.setBackground(Color.DARK_GRAY);
        outputArea.setForeground(Color.WHITE);
        inputArea.setCaretColor(Color.WHITE);
        outputArea.setCaretColor(Color.WHITE);
        inputArea.setSelectionColor(Color.BLACK);
        outputArea.setSelectionColor(Color.BLACK);
        inputArea.setSelectedTextColor(Color.WHITE);
        outputArea.setSelectedTextColor(Color.WHITE);
        method.setBackground(Color.DARK_GRAY);
        method.setForeground(Color.WHITE);
        encode.setBackground(Color.DARK_GRAY);
        encode.setForeground(Color.WHITE);
        decode.setBackground(Color.DARK_GRAY);
        decode.setForeground(Color.WHITE);
        copy.setBackground(Color.DARK_GRAY);
        copy.setForeground(Color.WHITE);
        save.setBackground(Color.DARK_GRAY);
        save.setForeground(Color.WHITE);
        minimize.setBackground(Color.DARK_GRAY);
        minimize.setForeground(Color.WHITE);
        maximize.setBackground(Color.DARK_GRAY);
        maximize.setForeground(Color.WHITE);
        darkMode.setBackground(Color.DARK_GRAY);
        darkMode.setForeground(Color.WHITE);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //light theme colors (default)
    public static void lightMode(JTextArea inputArea, JTextArea outputArea,
                                 JComboBox<String> method, JButton encode,
                                 JButton decode, JButton copy, JButton save,
                                 JButton minimize, JButton maximize, JCheckBox darkMode) {
        inputArea.setBackground(Color.WHITE);
        inputArea.setForeground(Color.BLACK);
        outputArea.setBackground(Color.WHITE);
        outputArea.setForeground(Color.BLACK);
        inputArea.setCaretColor(Color.BLACK);
        outputArea.setCaretColor(Color.BLACK);
        inputArea.setSelectionColor(Color.LIGHT_GRAY);
        outputArea.setSelectionColor(Color.LIGHT_GRAY);
        inputArea.setSelectedTextColor(Color.BLACK);
        outputArea.setSelectedTextColor(Color.BLACK);
        method.setBackground(Color.WHITE);
        method.setForeground(Color.BLACK);
        encode.setBackground(Color.WHITE);
        encode.setForeground(Color.BLACK);
        decode.setBackground(Color.WHITE);
        decode.setForeground(Color.BLACK);
        copy.setBackground(Color.WHITE);
        copy.setForeground(Color.BLACK);
        save.setBackground(Color.WHITE);
        save.setForeground(Color.BLACK);
        minimize.setBackground(Color.WHITE);
        minimize.setForeground(Color.BLACK);
        maximize.setBackground(Color.WHITE);
        maximize.setForeground(Color.BLACK);
        darkMode.setBackground(Color.WHITE);
        darkMode.setForeground(Color.BLACK);
    }
}