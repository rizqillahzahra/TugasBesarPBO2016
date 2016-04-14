package Controller;

import View.Order_Courier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Order_CourierController implements ActionListener{
    Order_Courier oc;
    public Order_CourierController() {
        oc = new Order_Courier();
        oc.setVisible(true);
        oc.addListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e == oc.getBtnNext())
        {
            if (oc.getTxtfrom().getText().isEmpty() && oc.getTxtTo().getText().isEmpty() && oc.getTxtdesc().getText().isEmpty())
            {
                JOptionPane.showMessageDialog(oc,"Data Pesanan Tidak Boleh Kosong");
            }
            else{
            if (oc.getTxtfrom().getText().equals("Dago") && oc.getTxtTo().getText().equals("Riau"))
            {
                new price_courierController(oc.getTxtfrom().getText(),oc.getTxtTo().getText(),15);
                System.out.println("Order Berhasil Dilakukan");                
            }
            oc.dispose();
            }
        }
        else if (e == oc.getBtnBack())
        {
            System.out.println("Order Dibatalkan");
            new MenuPelangganController();
        }
    }
    
}
