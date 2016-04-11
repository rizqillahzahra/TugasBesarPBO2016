/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class PelangganModel {
    private Koneksi conn;
    
    public PelangganModel(){
        this.conn = new Koneksi();
        conn.bikinKoneksi();
    }
    
    public void tambahPengemudi(){
        
    }
}
