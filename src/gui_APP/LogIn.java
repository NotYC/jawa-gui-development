package gui_APP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import database.*;
public class LogIn extends JFrame{
    private JLabel lbl1;
    private JPanel pnl;
    private JTextField tfName;
    private JTextField tfPass;
    private JButton s_up;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JButton l_in;

    public LogIn(){
        setContentPane(pnl);
        setTitle("Log-In");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        l_in.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String user = tfName.getText();
                        String pass = tfPass.getText();
                        UserCredentials uc = new UserCredentials();

                        Select sl = new Select();
                        int val = sl.check(user,pass);
                        if(val == 1){
                            UserCredentials.username = user;
                            UserCredentials.password = pass;
                            JOptionPane.showMessageDialog(l_in,"Welcome!");
                            new Home();

                        } else if (val == -1) {
                            JOptionPane.showMessageDialog(l_in,"Incorrect Password");
                        }else if(val == -2){
                            JOptionPane.showMessageDialog(l_in,"Username Does Not Exist");
                        }
                    }
                }
        );
        s_up.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new SignUp();
                    }
                }
        );

    }

    public static void main(String[] args) {
        LogIn l = new LogIn();

    }
}
