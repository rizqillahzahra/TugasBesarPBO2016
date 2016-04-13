package Controller;

import View.price_pengemudi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class price_pengemudiController implements ActionListener{
    price_pengemudi pp;

    public price_pengemudiController() {
        pp = new price_pengemudi();
        pp.setVisible(true);
        pp.addListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if(e == pp.getBtnOrder())
        {
            JOptionPane.showMessageDialog(pp,"Order telah sukses diambil");
            new MenuPengemudiController();
            pp.dispose();
        }
        else if(e == pp.getBtnCancel())
        {
            new MenuPengemudiController();
        }
        
    }
    
}
