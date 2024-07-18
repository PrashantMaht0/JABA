package swing_test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Guessnum {

    Guessnum() {
        MyFrame frame = new MyFrame();
        frame.setLayout(null);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 750, 375);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout());
        panel2.setBounds(0, 375, 750, 375);
        panel2.setBackground(Color.GRAY);

        JLabel label1 = new JLabel("Guess The Number");
        label1.setBounds(165, 120, 450, 60);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setFont(new Font("Verdana", Font.BOLD, 40));

        JButton hint = new JButton("Hint");
        hint.setBounds(550, 10, 120, 40); 
        hint.setFocusable(false);
        hint.setHorizontalAlignment(JButton.RIGHT);
        hint.setFont(new Font("Verdana", Font.BOLD, 20));
        try {
            Image image = ImageIO.read(new File("D:\\Codes\\JABA\\swing_test\\bulb.png"));
            Image newimg = image.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(newimg);
            hint.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }

        panel1.add(label1);
        panel1.add(hint);

        frame.add(panel1);
        frame.add(panel2);

        frame.revalidate();
        frame.repaint();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Guessnum();
    }
}
