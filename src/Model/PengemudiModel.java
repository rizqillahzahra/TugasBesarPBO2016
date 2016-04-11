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
public class PengemudiModel {
    private Koneksi conn;
    
    public PengemudiModel(){
        this.conn = new Koneksi();
        conn.bikinKoneksi();
    }
    
    
}
