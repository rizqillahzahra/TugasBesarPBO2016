/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesarpbo2016;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class Kurir extends Orang {
    private Pesanan pesanan[];
    private int jml_pesanan;
    
    public void createPesanan(){
        pesanan[jml_pesanan] = new Pesanan();
        jml_pesanan++;
    }
    
    public Pesanan getPesanan(int index){
        return pesanan[index];
    }
}
