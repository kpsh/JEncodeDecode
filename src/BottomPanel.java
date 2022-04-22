import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BottomPanel {
    public BottomPanel(JFrame frame) {
        ///////////////////////////////////////////////////////////////////////////////////////////
        //panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setBounds(0, 32, 720, 668);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createMatteBorder(0, 2, 2, 2, Color.BLACK));
        ///////////////////////////////////////////////////////////////////////////////////////////
        //Input
        JLabel inputLabel = new JLabel("Input:");
        inputLabel.setBounds(20, 50, 100, 20);
        inputLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(inputLabel);

        JTextArea inputArea = new JTextArea();
        inputArea.setFont(new Font("Arial", Font.PLAIN, 20));
        inputArea.setLineWrap(true);
        inputArea.setWrapStyleWord(true);
        JScrollPane input = new JScrollPane(inputArea);
        input.setBounds(20, 70, 680, 290);
        input.setBorder(null);
        input.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        input.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(input);

        JButton clearInput = new JButton("x");
        clearInput.setBounds(700, 70, 19, 19);
        clearInput.setFont(new Font("Arial", Font.BOLD, 12));
        clearInput.setBackground(Color.WHITE);
        clearInput.setBorder(null);
        clearInput.setVisible(false);
        panel.add(clearInput);
        ///////////////////////////////////////////////////////////////////////////////////////////
        //Output
        JLabel outputLabel = new JLabel("Output:");
        outputLabel.setBounds(20, 370, 100, 20);
        outputLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(outputLabel);

        JTextArea outputArea = new JTextArea();
        outputArea.setFont(new Font("Arial", Font.PLAIN, 20));
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        outputArea.setEditable(false);
        JScrollPane output = new JScrollPane(outputArea);
        output.setBounds(20, 390, 680, 290);
        output.setBorder(null);
        output.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        output.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(output);
        ///////////////////////////////////////////////////////////////////////////////////////////
        inputArea.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isUpperCase(c)) {
                    e.setKeyChar(Character.toLowerCase(c));
                }
                clearInput.setVisible(inputArea.getText().length() > 0);
            }
        });
        outputArea.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isUpperCase(c)) {
                    e.setKeyChar(Character.toLowerCase(c));
                }
            }
        });
        clearInput.addActionListener(e -> {
            inputArea.setText("");
            clearInput.setVisible(false);
        });
        
        new ControlPanel(panel, inputArea, outputArea);
        frame.add(panel);
    }
}