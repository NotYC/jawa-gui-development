package gui_APP;

import database.Select;
import database.Update;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditAcc extends JFrame{
    private JPanel pnlPersonal;
    private JLabel lbluser;
    private JLabel lblfirst;
    private JLabel lblmail;
    private JLabel lbllast;
    private JButton bck;
    private JTextField tfNuser;
    private JTextField tfNfirst;
    private JTextField tfNlast;
    private JTextField tfNmail;
    private JPasswordField tfcp;
    private JPasswordField tfncp;
    private JButton saveC;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JPanel pnlOver;

    public EditAcc(){
        setContentPane(pnlOver);
        setTitle("Personal");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        String user = UserCredentials.username;
        Select sl = new Select();
        sl.check(user);
        lbluser.setText(sl.username);
        lblfirst.setText(sl.first);
        lbllast.setText(sl.second);
        lblmail.setText(sl.email);
        bck.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new Home();
                    }
                }
        );
        saveC.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String user = UserCredentials.username;
                        if(tfNuser.getText() != null){

                            Update up = new Update();
                            String s = tfNuser.getText();
                            up.modify("username",s,user);
                            UserCredentials.username = s;
                        }if(tfNfirst.getText() != null){

                            Update up = new Update();
                            String s = tfNfirst.getText();
                            up.modify("first_name",s,user);}
                        if(tfNlast.getText() != null){

                            Update up = new Update();
                            String s = tfNlast.getText();
                            up.modify("last_name",s,user);}
                        if(tfNmail.getText() != null){

                            Update up = new Update();
                            String s = tfNmail.getText();
                            up.modify("email",s,user);}
                        if(tfcp.getText().equals(UserCredentials.password))
                            if(tfcp.getText().equals(tfncp.getText())){
                                Update up = new Update();
                                String s = tfncp.getText();
                                up.modify("password",s,user);
                                UserCredentials.password = s;
                            }

                    JOptionPane.showMessageDialog(saveC,"Updated Successfully!");
                    }
                }
        );
    }

    public static void main(String[] args) {
        EditAcc ea = new EditAcc();
    }
}
