package Controller;

import View.price_transport;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class price_transportController implements ActionListener{
    price_transport pt;
    
    public price_transportController(String asal, String tujuan,int km)
    {
        pt = new price_transport();
        pt.setVisible(true);
        pt.addListener(this);
        pt.getTxtOrigin().setText(asal);
        pt.getTxtDestination().setText(tujuan);
        pt.getTxtHarga().setText(""+km*4000);
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if(e == pt.getBtnOrder())
        {
            JOptionPane.showMessageDialog(pt,"Order Pick Up Berhasil Dilakukan");
            new MenuPelangganController();
            pt.dispose();
        }
        else if(e == pt.getBtnCancel())
        {
            JOptionPane.showMessageDialog(pt,"Order Pick Up Dibatalkan");
            new MenuPelangganController();
            pt.dispose();
        }
    }
    
}
