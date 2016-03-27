/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesarpbo2016;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class Console {
    
    private List<Pelanggan> daftarPelanggan = new ArrayList<Pelanggan>();
    private List<Pengemudi> daftarPengemudi = new ArrayList<Pengemudi>();
    
    public void addPelanggan(String nama, long no_telp, String alamat_pelanggan, long id_pelanggan){
        Pelanggan tmp_pelanggan = new Pelanggan(nama,no_telp,alamat_pelanggan,id_pelanggan);
        daftarPelanggan.add(tmp_pelanggan);
    }
    
    public void addPengemudi(String nama, long no_telp, long id_pengemudi){
        Pengemudi tmp_pengemudi = new Pengemudi(nama,no_telp,id_pengemudi);
        daftarPengemudi.add(tmp_pengemudi);
    }
    
    public Pengemudi getPengemudi(long idPengemudi){
        int panjang = daftarPengemudi.size();
        for (int i = 0; i < panjang; i++) {
            if(daftarPengemudi.get(i).getId_pengemudi() == idPengemudi){
                return daftarPengemudi.get(i);
            }
        }
        return null;
    }
    
    public void deletePengemudi(long idPengemudi){
        int panjang = daftarPengemudi.size();
        for (int i = 0; i < panjang; i++) {
            if(daftarPengemudi.get(i).getId_pengemudi() == idPengemudi){
                daftarPengemudi.remove(i);
            }
        }
    }
    
    public Pelanggan getPelanggan(long idPelanggan){
        int panjang = daftarPelanggan.size();
        for (int i = 0; i < panjang; i++) {
            if(daftarPelanggan.get(i).getId_pelanggan() == idPelanggan){
                return daftarPelanggan.get(i);
            }
        }
        return null;
    }
    
    public void deletePelanggan(long idPelanggan){
        int panjang = daftarPelanggan.size();
        for (int i = 0; i < panjang; i++) {
            if(daftarPelanggan.get(i).getId_pelanggan() == idPelanggan){
                daftarPelanggan.remove(i);
            }
        }
    }
}
