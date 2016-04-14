package Controller;

import View.signin_pengemudi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

public class sign_pengemudiController implements ActionListener{
    signin_pengemudi sp;

    public sign_pengemudiController()
    {
        sp = new signin_pengemudi();
        sp.setVisible(true);
        sp.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e == sp.getBtnlogin())
        {
            if (sp.getTxtusername().getText().isEmpty() && sp.getTxtPass().getText().isEmpty())
            {
                JOptionPane.showMessageDialog(sp,"Data Pengemudi Tidak Boleh Kosong");
            }else 
            {
                JOptionPane.showMessageDialog(sp,"Log In Pengemudi Berhasil");
                new MenuPengemudiController();
                sp.dispose();       
            }
        }
        else if (e == sp.getBtnBack())
        {
            new Menu1Controller();
            sp.dispose();
        }
    }
    
    
    
}
