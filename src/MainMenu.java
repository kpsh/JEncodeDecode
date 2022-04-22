import javax.swing.*;

public class MainMenu {
    public static void main(String[] args) {
        /////////////////////////////////////////////////////////
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /////////////////////////////////////////////////////////
        new TopPanel(frame);
        new BottomPanel(frame);
        /////////////////////////////////////////////////////////
        //icon
        frame.setIconImage(new ImageIcon("src/resources/images/icon.png").getImage());
        /////////////////////////////////////////////////////////
        frame.setVisible(true);
    }
}