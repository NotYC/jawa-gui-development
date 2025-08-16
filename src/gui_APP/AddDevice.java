package gui_APP;

import gui_APP.Home;
import database.*;
import gui_APP.UserCredentials;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDevice extends JFrame{
    private JTextField tfRNum;
    private JTextField tfCMod;
    private JTextField tfCCol;
    private JButton ad_d;
    private JLabel lbl1;
    private JLabel lbl2;
    private JTextField tfLKey;
    private JButton bck;
    private JPanel pnl;


    public AddDevice(){
        setContentPane(pnl);
        setTitle("Log-In");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        bck.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new Home();
                    }
                }
        );
        ad_d.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = tfLKey.getText();
                        Select sl = new Select();
                        Insert in = new Insert();

                        int x = sl.check(1,s);
                        if(x == 1){
                            String a = tfRNum.getText();
                            String b = tfCMod.getText();
                            String c = tfCCol.getText();
                            String d = UserCredentials.username;
                            int num = 1;
                            int y = in.put(d,s,a,b,c,num);
                            if(y==1){
                                Delete dc = new Delete();

                                dc.pop(s);
                                JOptionPane.showMessageDialog(ad_d,"Device Activated!");

                                new Home();
                            }
                        }else{
                            JOptionPane.showMessageDialog(ad_d,"Invalid Licence Key");
                        }
                    }
                }
        );
    }

    public static void main(String[] args) {
        AddDevice ad = new AddDevice();
    }
}
