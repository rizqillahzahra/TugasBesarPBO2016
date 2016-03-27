/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesarpbo2016;

/**
 *
 * @author BOSS-PC
 */
public class Pengemudi extends Orang{
    private long id_pengemudi;
    private Pesanan[] pesanan = new Pesanan[100];
    private int i;

    public Pengemudi(String nama, long no_telp, long id_pengemudi)
    {
        super.setNama(nama);
        super.setNo_telp(no_telp);
        this.id_pengemudi = id_pengemudi;
    }

    public Pesanan getPesanan(int n)
    {
        if (n<100)
        {
            return pesanan[n];
        } 
        else 
        {
            return null;
        }
    }

    public void createPesanan(Pesanan p)
    {
        if (i<100)
        {
            pesanan[i] = p;
            i++;
        }
        else
        {
            System.out.println("Array Pesanan Penuh !!!");
        }
    }

    public boolean removePesanan(long id_pesanan){
        for (int j = 0; j < i; j++) {
            if(pesanan[j].getId_pesanan() == id_pesanan){
                //cek dia index keberapa
                if(j == 0){
                    //index pertama alias delete first
                    pesanan[0] = null;
                    for (int k = 0; k < i-1; k++) {
                        pesanan[k] = pesanan[k+1];
                    }
                    pesanan[i] = null;
                    i--;
                    return true;
                }else if(j == i){
                    //index terakhir alias delete last
                    pesanan[j] = null;
                    i--;
                    return true;
                }else{
                    //index tengah alias delete after
                    pesanan[j] = null;
                    for (int k = j; k < i-1; k++) {
                        pesanan[k] = pesanan[k+1];
                    }
                    pesanan[i] = null;
                    i--;
                    return true;
                }
            }
        }
        return false;
    }

    public long getId_pengemudi() {
        return id_pengemudi;
    }
}
