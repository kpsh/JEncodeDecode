import javax.swing.*;
public class Decode {
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //caesar cipher decoder using a key
    public static void caesar(JTextArea inputArea, JTextArea outputArea) {
        String input = inputArea.getText();
        StringBuilder output = new StringBuilder();
        int shift = Integer.parseInt(JOptionPane.showInputDialog("Enter shift number: "));
        int newShift = 26 - (shift % 26);
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                output.append((char) (((input.charAt(i) - 'a' + newShift) % 26) + 'a'));
            } else {
                output.append(input.charAt(i));
            }
        }
        outputArea.setText(output.toString());
    }
    //morse code decoder
    public static void morse(JTextArea inputArea, JTextArea outputArea) {
        String input = inputArea.getText();
        StringBuilder output = new StringBuilder();
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
        "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
        "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "/", "#"};
        String[] normal = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", " ", ""};
        String[] words = input.split(" ");
        for (String word : words) {
            for (int j = 0; j < morse.length; j++) {
                if (word.equals(morse[j])) {
                    output.append(normal[j]);
                    if (word.contains("#")) {
                        output.append("\n");
                    }
                }
            }
        }
        outputArea.setText(output.toString());
    }
    //rot13 decoder (rotate 13 times)
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
    //atbash decoder (reverse the alphabet)
    public static void atbash(JTextArea inputArea, JTextArea outputArea) {
        String input = inputArea.getText();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] reverse = {"z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "o", "n", "m", "l", "k", "j", "i",
                "h", "g", "f", "e", "d", "c", "b", "a"};
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (input.charAt(i) == alphabet[j].charAt(0)) {
                    output.append(reverse[j]);
                }
                
            }
        }
        outputArea.setText(output.toString());
    }
    //vigenere decoder (shift each letter by the keyphrase)
    public static void vigenere(JTextArea inputArea, JTextArea outputArea) {
        String input = inputArea.getText();
        StringBuilder output = new StringBuilder();
        String key = JOptionPane.showInputDialog("Enter key (letters only!): ");
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                char c = key.charAt(i % key.length());
                output.append((char) (((input.charAt(i) + 'a' - c - 'a') % 26) + 'a'));
            } else {
                output.append(input.charAt(i));
            }
        }
        outputArea.setText(output.toString());
    }
}