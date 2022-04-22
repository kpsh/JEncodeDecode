package settings;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Help {

    public Help(JComboBox<String> method, JLabel helpTooltip, JButton copy,
                JButton save, JButton minimize, JButton maximize) {
        ///////////////////////////////////////////////////////////////////////////////////////////
        //setting up tooltip for description of method
        helpTooltip.setCursor(new Cursor(Cursor.HAND_CURSOR));
        helpTooltip.setToolTipText("Choose method to encode/decode text");
        method.addActionListener(e -> {
            if (Objects.equals(method.getSelectedItem(), "Caesar")) {
                helpTooltip.setToolTipText(
                    "<html>Caesar cipher is a type of substitution cipher in which each letter in <br> " +
                    "the plaintext is replaced by a letter some fixed number of positions <br>" +
                    "down the alphabet. The method is named after Julius Caesar, <br>" +
                    "who used it in his private correspondence.</html>");
            } else if (Objects.equals(method.getSelectedItem(), "Morse Code")) {
                helpTooltip.setToolTipText(
                    "<html>Morse code is a method of encoding text by replacing each letter with <br>" +
                    "a series of dashes and dots, as it is done on a telephone. <br>" +
                    "The Morse code encodes each letter as a sequence of <br>" +
                    "two or more dashes and two or more dots, with the <br>" +
                    "letter separating the two sequences by a single space.</html>");
            } else if (Objects.equals(method.getSelectedItem(), "ROT13")) {
                helpTooltip.setToolTipText(
                    "<html>ROT13 is a simple letter substitution cipher that replaces <br>" +
                    "every letter in the plaintext with a letter 13 positions further <br>" +
                    "down the alphabet. This is a special case of the Caesar cipher, <br>" +
                    "in which the shift value is 13.</html>");
            } else if (Objects.equals(method.getSelectedItem(), "Atbash")) {
                helpTooltip.setToolTipText(
                    "<html>The Atbash cipher is a simple substitution cipher that <br>" +
                    "reverse the order of the letters in the alphabet. <br>" +
                    "It is a special case of the Caesar cipher, in which the <br>" +
                    "shift value is the same as the number of letters in the <br>" +
                    "alphabet.</html>");
            } else if (Objects.equals(method.getSelectedItem(), "Vigenere")) {
                helpTooltip.setToolTipText("<html>Vigenere cipher is a type of polyalphabetic <br>" +
                    "substitution cipher in which each letter in the plaintext is <br>" +
                    "replaced by a letter some fixed number of positions down the <br>" +
                    "alphabet. The method is named after the Italian mathematician <br>" +
                    "and cryptographer Vigenere.</html>");
            }
        });
        ///////////////////////////////////////////////////////////////////////////////////////////
        //tooltips for other buttons
        copy.setToolTipText("Copy text to clipboard");
        save.setToolTipText("Save text to file");
        minimize.setToolTipText("Minimize font size");
        maximize.setToolTipText("Maximize font size");
    }
}
