package swing_test;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class labels {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setSize(800, 800);
        //myFrame.setLayout(null);  

        JLabel label = new JLabel();

        // Layout and size of label
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(20, 20, 400, 400);  // Set specific position and size

        Border border = BorderFactory.createLineBorder(Color.green, 3);
        label.setBorder(border);

        // Added an icon (image) to the label
        try {
            Image image = ImageIO.read(new File("D:\\Codes\\JABA\\swing_test\\black_cat.jpg"));
            Image newimg = image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);  // Scaling the image
            ImageIcon imageIcon = new ImageIcon(newimg);
            label.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Adding text to the label
        label.setText("Hello nigga");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("MV Boli", Font.PLAIN, 50));
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);

        // Adding label to the frame
        myFrame.add(label);

        myFrame.revalidate();
        myFrame.repaint();
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
