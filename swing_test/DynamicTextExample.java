package swing_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DynamicTextExample {
    private JFrame frame;
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public DynamicTextExample() {
        // Create the frame
        frame = new JFrame("Dynamic Text Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create the label
        label = new JLabel("Initial Text");
        frame.add(label);

        // Create a text field for input
        textField = new JTextField(20);
        frame.add(textField);

        // Create a button to update the label
        button = new JButton("Update Text");
        frame.add(button);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newText = textField.getText();
                label.setText(newText);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the example
        // SwingUtilities.invokeLater(new Runnable() {
        //     @Override
        //     public void run() {
        //         new DynamicTextExample();
        //     }
        // });
        new DynamicTextExample();
    }
}
