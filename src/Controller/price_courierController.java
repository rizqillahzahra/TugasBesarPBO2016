package Controller;

import View.price_courier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class price_courierController implements ActionListener{
    price_courier pc;

    public price_courierController(String asal, String tujuan, int km) {
        pc = new price_courier();
        pc.setVisible(true);
        pc.addListener(this);
        pc.getTxtFrom().setText(asal);
        pc.getTxtTo().setText(tujuan);
        pc.getTxtPrice().setText(""+((km*4000)+5000));
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e == pc.getBtnOrder())
        {
            JOptionPane.showMessageDialog(pc,"Order Courier Berhasil Dilakukan");
            new MenuPelangganController();
            pc.dispose();
        }
        else if(e == pc.getBtnCancel())
        {
            JOptionPane.showMessageDialog(pc,"Order Courier Dibatalkan");
            new MenuPelangganController();
            pc.dispose();
        }
    }
    
}
