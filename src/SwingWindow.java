import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingWindow extends JFrame implements ActionListener {
    private JPanel MainPanel;
    private JLabel Hello;
    private JButton resetButton;
    private JTextField textField1;

    public SwingWindow(){
        setContentPane(MainPanel);
        setTitle("Window");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        resetButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        Object a = ae.getSource();
        if(a instanceof JButton){
            JButton button = (JButton)a;
            if(button.getText().equals("Reset")){
           int random = (int)(Math.random() * 10);
           if(Integer.parseInt(textField1.toString()) == random){
               resetButton.setText("Correct!");
               textField1.setText("");
           }
           else {button.setText("How'd you get this wrong? No wonder why your mother left you!");
           textField1.setText("");
           }
        }
    }}
}
