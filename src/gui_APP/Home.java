package gui_APP;

import database.Select;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Home extends JFrame{

    private JPanel pnlpersonal;
    private JButton ad_d;
    private JButton OPcar1;
    private JButton OPcar2;
    private JButton OPcar3;
    private JLabel car1;
    private JLabel car2;
    private JLabel car3;
    private JButton pinfo;
    private JButton minfo;

    public Home(){
        setContentPane(pnlpersonal);
        setTitle("Home Page");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        pinfo.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new Personal();
                    }
                }

        );
        minfo.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new EditAcc();
                    }
                }
        );
        ad_d.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new AddDevice();
                    }
                }
        );


    }

    public static void main(String[] args) {
        Home ho = new Home();
    }
}
