package gui_APP;

import javax.swing.*;

public class Operator extends JFrame{
    private JLabel carName;
    private JButton FORWARDButton;
    private JButton BACKWARDButton;
    private JButton LEFTButton;
    private JButton RIGHTButton;
    private JButton ENGINEONOFFButton;
    private JButton BACKButton;
    private JPanel pnl;


    public Operator(){
        setContentPane(pnl);
        setTitle("Operator");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Operator op = new Operator();
    }

}
