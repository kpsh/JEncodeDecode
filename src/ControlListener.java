import settings.FileUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Objects;

public class ControlListener {
    public ControlListener(JComboBox<String> method, JButton encode, JButton decode,
                           JButton copy, JButton save, JButton minimize, JButton maximize,
                           JTextArea inputArea, JTextArea outputArea) {
        ////////////////////////////////////////////////////////////////////////////////////////////////
        //listener for method combobox (encoding)
        encode.addActionListener(e -> {
            if (Objects.requireNonNull(method.getSelectedItem()).equals("Caesar")) {
                Encode.caesar(inputArea, outputArea);
            } else if (method.getSelectedItem().equals("Morse Code")) {
                Encode.morse(inputArea, outputArea);
            } else if (method.getSelectedItem().equals("ROT13")) {
                Encode.rot13(inputArea, outputArea);
            } else if (method.getSelectedItem().equals("Atbash")) {
                Encode.atbash(inputArea, outputArea);
            } else if (method.getSelectedItem().equals("Vigenere")) {
                Encode.vigenere(inputArea, outputArea);
            }
        });
        //listener for method combobox (decoding)
        decode.addActionListener(e -> {
            if (Objects.requireNonNull(method.getSelectedItem()).equals("Caesar")) {
                Decode.caesar(inputArea, outputArea);
            } else if (method.getSelectedItem().equals("Morse Code")) {
                Decode.morse(inputArea, outputArea);
            } else if (method.getSelectedItem().equals("ROT13")) {
                Decode.rot13(inputArea, outputArea);
            } else if (method.getSelectedItem().equals("Atbash")) {
                Decode.atbash(inputArea, outputArea);
            } else if (method.getSelectedItem().equals("Vigenere")) {
                Decode.vigenere(inputArea, outputArea);
            }
        });
        //copying text from outputArea to clipboard
        copy.addActionListener(e -> {
            StringSelection stringSelection = new StringSelection(outputArea.getText());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        });
        //calling FileUtils saving method
        save.addActionListener(e -> FileUtils.saveFile(outputArea.getText()));
        //minimizing/maximizing font size of text areas
        minimize.addActionListener(e -> {
            int fontSize = inputArea.getFont().getSize();
            if (fontSize > 12) {
                inputArea.setFont(new Font(inputArea.getFont().getName(), Font.PLAIN, fontSize - 2));
                outputArea.setFont(new Font(outputArea.getFont().getName(), Font.PLAIN, fontSize - 2));
            }
        });
        maximize.addActionListener(e -> {
            int fontSize = inputArea.getFont().getSize();
            if (fontSize < 28) {
                inputArea.setFont(new Font(inputArea.getFont().getName(), Font.PLAIN, fontSize + 2));
                outputArea.setFont(new Font(outputArea.getFont().getName(), Font.PLAIN, fontSize + 2));
            }
        });
    }
}