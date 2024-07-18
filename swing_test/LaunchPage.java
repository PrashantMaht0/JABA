package swing_test;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    MyFrame myFrame = new MyFrame();
    JButton myButton = new JButton("Click Me");

    public LaunchPage() {
        myButton.setBounds(350, 350, 100, 30);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        myFrame.setLayout(null);
        myFrame.add(myButton);
        myFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            myFrame.dispose();
            Panels panels = new Panels();
        }
    }
}