package gui_APP;
import database.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame {
    private JPanel pnl;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JTextField tfName;
    private JLabel lbl4;
    private JTextField tfPass;
    private JButton s_up;
    private JButton l_in;
    private JTextField tfFirst;
    private JTextField tfLast;
    private JTextField tfEmail;
    private JTextField tfRepass;
    private JLabel lbl5;
    private JLabel lbl6;
    private JLabel lbl7;
    private JLabel lbl8;


    public SignUp(){

        setContentPane(pnl);
        setTitle("Sign-UP");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        s_up.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String user = tfName.getText();
                        String first = tfFirst.getText();
                        String last = tfLast.getText();
                        String email = tfEmail.getText();
                        String pass = tfPass.getText();
                        String confo = tfRepass.getText();
                        UserCredentials uc = new UserCredentials();
                        uc.username = tfName.getText();
                        if(confo.equals(pass)){
                            Insert in = new Insert();
                            int x = in.put(user,first,last,email,pass);
                            JOptionPane.showMessageDialog(s_up,"Successfully Signed In");
                            new Home();
                        }else{
                            JOptionPane.showMessageDialog(s_up,"Password MisMatched");
                        }
                    }
                }
        );

        l_in.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        new LogIn();
                    }
                }
        );

    }

    public static void main(String[] args) {
        SignUp su = new SignUp();
    }
}
