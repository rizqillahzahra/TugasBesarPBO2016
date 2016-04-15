/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tugasbesarpbo2016.Pelanggan;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class PelangganModel {
    private Koneksi conn;
    private Statement stmt;
    
    public PelangganModel() throws SQLException{
        this.conn = new Koneksi();
        conn.bikinKoneksi();
    }
    
    public void tambahPelanggan(Pelanggan p){
      try{
        stmt = conn.getConn().createStatement();
        String query = "Insert into pelanggan (nama, no_telepon, username, password, alamat) values('"+p.getNama()+"',"+p.getNo_telp()+",'"+p.getUsername()+"','"+p.getPassword()+"','"+p.getAlamat_pelanggan()+"');";
        stmt.executeUpdate(query);
      }catch(SQLException e){
          System.err.println(e);
      }            
    }
    
    public boolean cekPelanggan(String username, String password) throws SQLException{
        stmt = conn.getConn().createStatement();
        String query = "select * from pelanggan where username='"+username+"' and password = '"+password+"'";
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null && rs.next()) {
           return true;
        }else{
           return false;
        }
    }
    
    public Pelanggan getDataPelanggan(String username, String password) throws SQLException{        
        stmt = conn.getConn().createStatement();
        String query = "select * from pelanggan where username='"+username+"' and password = '"+password+"'";
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null && rs.next()) {
           Pelanggan p = new Pelanggan(rs.getString("nama"),rs.getLong("no_telepon"),rs.getString("alamat"),rs.getLong("id_pelanggan"),username,password);
           return p;
        }
        
        return null;
    }
}
