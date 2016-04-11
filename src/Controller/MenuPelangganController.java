/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuPelanggan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class MenuPelangganController implements ActionListener {
    private MenuPelanggan menPelView;

    public MenuPelangganController() {
        menPelView = new MenuPelanggan();
        menPelView.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == menPelView.getPickUpButton()){
            System.out.println("Buka menu pickup");
        }else if(event == menPelView.getCourierButton()){
            System.out.println("Buka menu Kurir");
        }else if(event == menPelView.getLogOutButton()){
            System.out.println("Buka halaman login");
        }
    }
    
}
