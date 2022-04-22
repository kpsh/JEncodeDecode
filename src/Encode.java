import javax.swing.*;

public class Encode {
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //caesar cipher encode
    public static void caesar(JTextArea inputArea, JTextArea outputArea) {
        String input = inputArea.getText();
        StringBuilder output = new StringBuilder();
        int shift = Integer.parseInt(JOptionPane.showInputDialog("Enter shift number: "));
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                output.append((char) (((input.charAt(i) - 'a' + shift) % 26) + 'a'));
            } else {
                output.append(input.charAt(i));
            }
        }
        outputArea.setText(output.toString());
    }
    //morse code encode (use space to separate words, use # to add a new line)
    public static void morse(JTextArea inputArea, JTextArea outputArea) {
        String input = inputArea.getText();
        StringBuilder output = new StringBuilder();
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
        "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
        "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "/", "#"};
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                output.append(morse[input.charAt(i) - 'a']).append(" ");
            } else if (Character.isDigit(input.charAt(i))) {
                output.append(morse[input.charAt(i) - '0' + 26]).append(" ");
            } else if (input.charAt(i) == ' ') {
                output.append("/ ");
            } else if (input.charAt(i) == '\n') {
                output.append("# ");
            }
        }
        outputArea.setText(output.toString());
    }
    //rot13 encode (turns each letter into the letter 13 places to the right in the alphabet)
    public static void rot13(JTextArea inputArea, JTextArea outputArea) {
        String input = inputArea.getText();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                output.append((char) (((input.charAt(i) - 'a' + 13) % 26) + 'a'));
            } else {
                output.append(input.charAt(i));
            }
        }
        outputArea.setText(output.toString());
    }
    //atbash encode (a-z becomes z-a)
    public static void atbash(JTextArea inputArea, JTextArea outputArea) {
        String input = inputArea.getText();
        StringBuilder output = new StringBuilder();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                             "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                output.append(alphabet[25 - (input.charAt(i) - 'a')]);
            } else {
                output.append(input.charAt(i));
            }
        }
        outputArea.setText(output.toString());
    }
    //vigenere encode
    public static void vigenere(JTextArea inputArea, JTextArea outputArea) {
        String input = inputArea.getText();
        StringBuilder output = new StringBuilder();
        String key = JOptionPane.showInputDialog("Enter key (letters only!): ");
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                char c = key.charAt(i % key.length());
                output.append((char) (((input.charAt(i) - 'a' + c - 'a') % 26) + 'a'));
            } else {
                output.append(input.charAt(i));
            }
        }
        outputArea.setText(output.toString());
    }
}