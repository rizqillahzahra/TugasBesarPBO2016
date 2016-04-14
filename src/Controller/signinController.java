package Controller;

import View.MenuPelanggan;
import View.signin;
import View.signup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class signinController implements ActionListener{
    signin s;
    public signinController() {
        s = new signin();
        s.setVisible(true);
        s.addListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e == s.getLogin())
        {
            if ((s.getTxtusername().getText().isEmpty()) && s.getTxtPass().getText().isEmpty())
            {
                JOptionPane.showMessageDialog(s, "Data Pengguna tidak boleh kosong");
            }
            else
            {
                System.out.println("Proses Pilih Menu");
                JOptionPane.showMessageDialog(s,"Log In Berhasil Dilakukan");
                new MenuPelangganController();
                s.dispose();           
            }

        }
        else if (e == s.getSignupnow())
        {
            System.out.println("Proses Sign Up Pelanggan");
            new signupController();
            s.dispose(); 
        }
    }
    
}
