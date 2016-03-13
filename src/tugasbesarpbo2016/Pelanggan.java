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
public class Pelanggan extends Orang {
    private Pesanan pesanan[] = new Pesanan[100];;
    private long id_pelanggan;
    private String alamat_pelanggan;
    private int jml_pesanan;

    public Pelanggan(String nama, long no_telp, String alamat_pelanggan, long id_pelanggan){
        super.setNama(nama);
        super.setNo_telp(no_telp);
        this.alamat_pelanggan = alamat_pelanggan;
        this.id_pelanggan = id_pelanggan;
    }
    
    public long getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(long id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public String getAlamat_pelanggan() {
        return alamat_pelanggan;
    }

    public void setAlamat_pelanggan(String alamat_pelanggan) {
        this.alamat_pelanggan = alamat_pelanggan;
    }
    
    public void createPesanan(Pesanan p){
        if (jml_pesanan<100){
            pesanan[jml_pesanan] = p;
            jml_pesanan++;
        }else{
            System.out.println("Array Pesanan Penuh !!!");
        }
    }
    
    public void createPesananKurir(Kurir k){
        if (jml_pesanan<100){
            pesanan[jml_pesanan] = k;
            jml_pesanan++;
        }else{
            System.out.println("Array Pesanan Penuh !!!");
        }
    }
    
    public Pesanan getPesanan(int index){
        return pesanan[index];
    }
    
    public boolean removePesanan(long id_pesanan){
        for (int j = 0; j < jml_pesanan; j++) {
            if(pesanan[j].getId_pesanan() == id_pesanan){
                //cek dia index keberapa
                if(j == 0){
                    //index pertama alias delete first
                    pesanan[0] = null;
                    for (int k = 0; k < jml_pesanan-1; k++) {
                        pesanan[k] = pesanan[k+1];
                    }
                    pesanan[jml_pesanan] = null;
                    jml_pesanan--;
                    return true;
                }else if(j == jml_pesanan){
                    //index terakhir alias delete last
                    pesanan[j] = null;
                    jml_pesanan--;
                    return true;
                }else{
                    //index tengah alias delete after
                    pesanan[j] = null;
                    for (int k = j; k < jml_pesanan-1; k++) {
                        pesanan[k] = pesanan[k+1];
                    }
                    pesanan[jml_pesanan] = null;
                    jml_pesanan--;
                    return true;
                }
            }
        }
        return false;
    }
}
