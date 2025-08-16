package gui_APP;
import database.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Personal extends JFrame{
    private JButton bck;
    private JPanel pnlPersonal;
    private JLabel lbluser;

    private JLabel lblfirst;
    private JLabel lbllast;
    private JLabel lblmail;

    public Personal(){
        setContentPane(pnlPersonal);
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
    }

    public static void main(String[] args) {
        Personal ps = new Personal();
    }
}
