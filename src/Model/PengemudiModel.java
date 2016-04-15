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
import tugasbesarpbo2016.Pengemudi;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class PengemudiModel {
    private Koneksi conn;
    private Statement stmt;
    
    public PengemudiModel(){
        this.conn = new Koneksi();
        conn.bikinKoneksi();
    }
    
    public boolean cekPengemudi(String username, String password) throws SQLException{
        stmt = conn.getConn().createStatement();
        String query = "select * from pengemudi where username='"+username+"' and password = '"+password+"'";
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null && rs.next()) {
           return true;
        }else{
           return false;
        }
    }
    
    public Pengemudi getDataPengemudi(String username, String password) throws SQLException{        
        stmt = conn.getConn().createStatement();
        String query = "select * from pengemudi where username='"+username+"' and password = '"+password+"'";
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null && rs.next()) {
           Pengemudi p = new Pengemudi(rs.getString("nama"),rs.getLong("no_telepon"),rs.getLong("id_pengemudi"),username,password);
           return p;
        }
        
        return null;
    }
    
    
}
