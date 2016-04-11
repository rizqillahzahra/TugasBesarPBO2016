/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class Koneksi {
    private Connection conn;
    public void bikinKoneksi(){
        try {
            //load jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        //buat objek koneksi
        try{
            this.conn = DriverManager.getConnection("jdbc:mysql://213.52.130.99:2083/mechajun_transportasi_online","mechajun_PBO","tubespbo3810");
            
        }catch(SQLException e){
            System.err.println("Koneksi gagal !!!!");
            System.err.println(e);
        }
    }
    
    public void tutupKoneksi(){
        try {
            this.conn.close();
        } catch (SQLException ex) {
            System.err.println("tidak ada koneksi yang terbuka");
        }
    }
}
