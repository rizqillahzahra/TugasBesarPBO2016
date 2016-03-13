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
public class Kurir extends Pesanan {
    private String nama_barang;
    public Kurir(String alamat_tujuan, String status, String nama_barang, long id_pesanan) {
        super(alamat_tujuan, status,id_pesanan);
        this.nama_barang = nama_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
}
