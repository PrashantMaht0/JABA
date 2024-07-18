package swing_test;

import javax.swing.*;

public class buttons {
    public static void main(String[] args) {

        JFrame myFrame = new JFrame();
        myFrame.setSize(500, 500);
        myFrame.setLayout(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton jButton = new JButton();
        jButton = new JButton("Click me");
        jButton.setFocusable(false);
        jButton.setBounds(120, 120, 200, 40);
        jButton.addActionListener(e -> System.out.println("Hello, Nigga!"));

        myFrame.add(jButton);

        myFrame.revalidate();
        myFrame.repaint();
        myFrame.setVisible(true);
    }

    
}
