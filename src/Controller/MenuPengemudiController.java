/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuPengemudi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class MenuPengemudiController implements ActionListener {
    MenuPengemudi viMenPe;

    public MenuPengemudiController() {
        viMenPe = new MenuPengemudi();
        viMenPe.setVisible(true);
        viMenPe.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e == viMenPe.getBtnTakeOrder())
        {   
            if (viMenPe.getTxtinputid().getText().isEmpty())
            {
                JOptionPane.showMessageDialog(viMenPe,"Masukan ID pesanan !!!");
            }
            else{
                new price_pengemudiController();
                viMenPe.dispose();
            }

        }
        else if (e == viMenPe.getBtnLogout())
        {
            new Menu1Controller();
            viMenPe.dispose();
        }
    }
    
}
