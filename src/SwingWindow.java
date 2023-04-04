import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingWindow extends JFrame implements ActionListener {
    private JPanel MainPanel;
    private JLabel Hello;
    private JButton resetButton;
    private JTextField textField1;

    public SwingWindow() {
        setContentPane(MainPanel);
        setTitle("Window");
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        resetButton.addActionListener(this);
    }


    public void actionPerformed(ActionEvent ae) {
        // cast ae to a JButton object since we want to call the getText method on it;
        // casting is needed since getSource() returns Object type, NOT a JButton
        Object source = ae.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            String text = button.getText();

            if (text.equals("Reset")) {
                int random = (int) (Math.random() * 10);
                if (Integer.parseInt(textField1.toString()) == random) {
                    resetButton.setText("");
                    textField1.setText("Correct!");

                }
                else{
                    textField1.setText("Wrong!");
                }

            }
        }
    }
}
