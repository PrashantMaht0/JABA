package swing_test;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Panels {

        
    Panels() {
        MyFrame myFrame = new MyFrame();
        myFrame.setSize(600, 600);
        myFrame.setLayout(null);

        JPanel red_Panel = new JPanel();
        JPanel green_Panel = new JPanel();
        JPanel blue_Panel = new JPanel();
        JPanel yellow_Panel = new JPanel();

        red_Panel.setBackground(Color.RED);
        yellow_Panel.setBackground(Color.YELLOW);
        green_Panel.setBackground(Color.GREEN);
        blue_Panel.setBackground(Color.BLUE);

        red_Panel.setBounds(0, 0, 250, 250);
        red_Panel.setLayout(new BorderLayout());
        JLabel redlabel = new JLabel();
        try {
            Image image = ImageIO.read(new File("D:\\Codes\\JABA\\swing_test\\logo.png"));
            Image newimg = image.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);  // Scaling the image
            ImageIcon imageIcon = new ImageIcon(newimg);
            redlabel.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }
        redlabel.setHorizontalAlignment(JLabel.CENTER);
        redlabel.setHorizontalAlignment(JLabel.CENTER);
        red_Panel.add(redlabel);

        green_Panel.setBounds(250, 0, 250, 250);


        blue_Panel.setBounds(0, 250, 250, 250);


        yellow_Panel.setBounds(250, 250, 250, 250);

        myFrame.add(red_Panel);
        myFrame.add(green_Panel);
        myFrame.add(blue_Panel);
        myFrame.add(yellow_Panel);

        myFrame.revalidate();
        myFrame.repaint();
        myFrame.setVisible(true);
    }
}
