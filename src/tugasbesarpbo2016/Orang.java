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
public abstract class Orang {
    private String nama;
    private long no_telp;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(long no_telp) {
        this.no_telp = no_telp;
    }

}
