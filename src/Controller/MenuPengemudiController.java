/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuPengemudi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class MenuPengemudiController implements ActionListener {
    MenuPengemudi viMenPe;

    public MenuPengemudiController() {
        viMenPe = new MenuPengemudi();
        viMenPe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
