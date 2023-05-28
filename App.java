package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame{
    private JButton button_smg;
    private JPanel panelMain;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JButton button_ok;
    private JButton button_clear;
    private JLabel lblWelcome;
    private JButton button_send;

    public App() {
        setContentPane(panelMain);
        setTitle("Welcome");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        button_smg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Alert test successful!");
            }
        });
        button_ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = txtFirstName.getText();
                String lastName = txtLastName.getText();
                lblWelcome.setText("Welcome " + firstName + " " + lastName);
            }
        });
        button_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtFirstName.setText("");
                txtLastName.setText("");
                lblWelcome.setText("");
            }
        });
        button_send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Data m = new Data();
                m.lblData.setText(txtFirstName.getText() + " " + txtLastName.getText());
                m.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        App app = new App();
    }
}
