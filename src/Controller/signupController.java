
package Controller;

import View.signup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class signupController implements ActionListener{
    signup su;
    public signupController()
    {
        su = new signup();
        su.setVisible(true);
        su.addListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e == su.getBtnsignup()) {
            if ((su.getTxtname().getText().isEmpty()) && (su.getTxtPass().getText().isEmpty()) && (su.getTxtusername().getText().isEmpty()) && (su.getTxtphone().getText().isEmpty()))
            {
                JOptionPane.showMessageDialog(su, "Data Pengguna tidak boleh kosong");
            }
            else
            {
                System.out.println("Sign Up berhasil dilakukan");
                JOptionPane.showMessageDialog(su, "Sign Up berhasil dilakukan");
                new MenuPelangganController();
                su.dispose();                 
            }

        }
        else if (e == su.getBtnloginnow()) {
            System.out.println("Loading.....");
            new signinController();
            su.dispose();   
        }
    }
}