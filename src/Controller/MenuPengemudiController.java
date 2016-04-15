/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuPengemudi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import tugasbesarpbo2016.Pengemudi;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class MenuPengemudiController extends JTable implements ActionListener {
    MenuPengemudi viMenPe;
    private Pengemudi pe;
    JTable tabel;

    public MenuPengemudiController(Pengemudi p) {
        viMenPe = new MenuPengemudi();
        viMenPe.setVisible(true);
        viMenPe.addListener(this);
        
        pe = p;
        
        Object tes[][] = {{"a","a","a","a","a","a"},
            {"a","a","a","a","a","a"},
        };
        
        String judulKolom[] = {
            "Nomor Pesanan",
            "Category",
            "Origin",
            "Destination",
            "Phone Number",
            "Status"
        };
        
        tabel = new JTable(tes, judulKolom);
        viMenPe.setTblOrder(tabel);
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
                new price_pengemudiController(pe);
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
