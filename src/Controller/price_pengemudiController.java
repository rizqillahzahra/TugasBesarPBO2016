package Controller;

import View.price_pengemudi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tugasbesarpbo2016.Pengemudi;

public class price_pengemudiController implements ActionListener{
    price_pengemudi pp;
    private Pengemudi pe;
    
    public price_pengemudiController(Pengemudi p) {
        pp = new price_pengemudi();
        pp.setVisible(true);
        pp.addListener(this);
        pe = p;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if(e == pp.getBtnOrder())
        {
            JOptionPane.showMessageDialog(pp,"Order telah sukses diambil");
            new MenuPengemudiController(pe);
            pp.dispose();
        }
        else if(e == pp.getBtnCancel())
        {
            new MenuPengemudiController(pe);
        }
        
    }
    
}
