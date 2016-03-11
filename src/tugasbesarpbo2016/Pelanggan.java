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
    private Pesanan pesanan[];
    private long id_pelanggan;
    private String alamat_pelanggan;
    private int jml_pesanan;

    public Pelanggan(String nama, long no_telp, String alamat_pelanggan, long id_pelanggan){
        this.nama = nama;
        this.no_telp = no_telp;
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
    
    public void createPesanan(){
        pesanan[jml_pesanan] = new Pesanan();
        jml_pesanan++;
    }
    
    public Pesanan getPesanan(int index){
        return pesanan[index];
    }
}
