import settings.Help;
import settings.Theme;

import javax.swing.*;
import java.awt.*;

public class ControlPanel {
    public ControlPanel(JPanel panel, JTextArea inputArea, JTextArea outputArea) {
        ///////////////////////////////////////////////////////////////////////////////////////////
        //panel
        JPanel controlPanel = new JPanel();
        controlPanel.setBackground(Color.GRAY);
        controlPanel.setBounds(720, 52, 278, 628);
        controlPanel.setLayout(null);
        controlPanel.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.DARK_GRAY));

        //choose type of cipher
        JLabel methodLabel = new JLabel("Choose method to encode/decode:");
        methodLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        methodLabel.setBounds(10, 5, 258, 30);
        controlPanel.add(methodLabel);

        //combo-box
        JComboBox<String> method = new JComboBox<>();
        method.setFont(new Font("Arial", Font.PLAIN, 20));
        method.setBounds(10, 35, 220, 35);
        method.addItem("Caesar");
        method.addItem("Morse Code");
        method.addItem("ROT13");
        method.addItem("Atbash");
        method.addItem("Vigenere");
        controlPanel.add(method);
        //helpTooltip
        JLabel helpTooltip = new JLabel("?");
        helpTooltip.setForeground(Color.BLACK);
        helpTooltip.setFont(new Font("Arial", Font.BOLD, 20));
        helpTooltip.setBounds(240, 35, 35, 35);
        controlPanel.add(helpTooltip);
        
        //encode
        JButton encode = new JButton("Encode");
        encode.setBounds(40, 120, 200, 40);
        encode.setFont(new Font("Arial", Font.PLAIN, 20));
        controlPanel.add(encode);
        JLabel orLabel = new JLabel("OR");
        orLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        orLabel.setBounds(120, 170, 50, 30);
        controlPanel.add(orLabel);
        //decode
        JButton decode = new JButton("Decode");
        decode.setBounds(40, 210, 200, 40);
        decode.setFont(new Font("Arial", Font.PLAIN, 20));
        controlPanel.add(decode);
        ///////////////////////////////////////////////////////////////////////////////////////////
        //copy button with icon
        JButton copy = new JButton("Copy");
        copy.setBounds(140, 400, 100, 35);
        copy.setFont(new Font("Arial", Font.PLAIN, 19));
        controlPanel.add(copy);
        //save button with icon
        JButton save = new JButton("Save...");
        save.setBounds(140, 450, 100, 35);
        save.setFont(new Font("Arial", Font.PLAIN, 19));
        controlPanel.add(save);
        
        //minimize button -
        JButton minimize = new JButton("-");
        minimize.setBounds(40, 400, 45, 35);
        minimize.setFont(new Font("Arial", Font.PLAIN, 19));
        controlPanel.add(minimize);
        //maximize button +
        JButton maximize = new JButton("+");
        maximize.setBounds(40, 450, 45, 35);
        maximize.setFont(new Font("Arial", Font.PLAIN, 19));
        controlPanel.add(maximize);

        //dark mode switch
        JCheckBox darkMode = new JCheckBox("Dark Mode");
        darkMode.setBounds(80, 540, 117, 30);
        darkMode.setFont(new Font("Arial", Font.PLAIN, 19));
        controlPanel.add(darkMode);

        ///////////////////////////////////////////////////////////////////////////////////////////
        //listeners
        new ControlListener(method, encode, decode, copy, save, minimize, maximize, inputArea, outputArea);
        Theme.lightMode(inputArea, outputArea, method, encode, decode,
                        copy, save, minimize, maximize, darkMode);
        new Help(method, helpTooltip, copy, save, minimize, maximize);
        darkMode.addActionListener(e -> {
            if (darkMode.isSelected()) {
                Theme.darkMode(inputArea, outputArea, method, encode, decode,
                        copy, save, minimize, maximize, darkMode);
            } else {
                Theme.lightMode(inputArea, outputArea, method, encode, decode,
                        copy, save, minimize, maximize, darkMode);
            }
        });
        ///////////////////////////////////////////////////////////////////////////////////////////
        panel.add(controlPanel);
    }
}