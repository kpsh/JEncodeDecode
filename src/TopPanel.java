import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TopPanel {
    public TopPanel(JFrame frame) {
        ///////////////////////////////////////////////////////////////////////////////////////////
        //top panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(0, 0, 1000, 32);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.BLACK));

        JLabel logo = new JLabel("");
        logo.setIcon(new ImageIcon("src/resources/images/logo.png"));
        logo.setBounds(4, 4, 64, 32);
        panel.add(logo);

        JLabel title = new JLabel("Java Encoder-Decoder");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.PLAIN, 16));
        title.setBounds(425, 2, 1000, 30);
        panel.add(title);

        JButton minimize = new JButton();
        minimize.setBounds(938, 2, 30, 30);
        minimize.setIcon(new ImageIcon("src/resources/images/minimize.png"));
        minimize.setBorder(null);
        minimize.setContentAreaFilled(false);
        minimize.setFocusPainted(false);
        minimize.setRolloverIcon(new ImageIcon("src/resources/images/minimize-hover.png"));
        panel.add(minimize);

        JButton close = new JButton();
        close.setBounds(968, 2, 30, 30);
        close.setIcon(new ImageIcon("src/resources/images/close.png"));
        close.setBorder(null);
        close.setContentAreaFilled(false);
        close.setFocusPainted(false);
        close.setRolloverIcon(new ImageIcon("src/resources/images/close-hover.png"));
        panel.add(close);
        ///////////////////////////////////////////////////////////////////////////////////////////
        minimize.addActionListener(e -> frame.setState(JFrame.ICONIFIED));
        close.addActionListener(e -> System.exit(0));
        panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                frame.setLocation(frame.getX() + e.getX() - 500, frame.getY() + e.getY() - 10);
            }
        });
        ///////////////////////////////////////////////////////////////////////////////////////////
        frame.add(panel);
    }
}
