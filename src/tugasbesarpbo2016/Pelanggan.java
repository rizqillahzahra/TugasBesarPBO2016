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

    public Pelanggan(String nama, long no_telp, String alamat_pelanggan, long id_pelanggan,String username,String password){
        super.setNama(nama);
        super.setNo_telp(no_telp);
        super.setPassword(password);
        super.setUsername(username);
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
        if (getJml_pesanan()<100){
            pesanan[getJml_pesanan()] = p;
            setJml_pesanan(getJml_pesanan() + 1);
        }else{
            System.out.println("Array Pesanan Penuh !!!");
        }
    }
    
    public void createPesananKurir(Kurir k){
        if (getJml_pesanan()<100){
            pesanan[getJml_pesanan()] = k;
            setJml_pesanan(getJml_pesanan() + 1);
        }else{
            System.out.println("Array Pesanan Penuh !!!");
        }
    }
    
    public Pesanan getPesanan(int index){
        return pesanan[index];
    }
    
    public boolean removePesanan(long id_pesanan){
        for (int j = 0; j < getJml_pesanan(); j++) {
            if(pesanan[j].getId_pesanan() == id_pesanan){
                //cek dia index keberapa
                if(j == 0){
                    //index pertama alias delete first
                    pesanan[0] = null;
                    for (int k = 0; k < getJml_pesanan()-1; k++) {
                        pesanan[k] = pesanan[k+1];
                    }
                    pesanan[getJml_pesanan()] = null;
                    setJml_pesanan(getJml_pesanan() - 1);
                    return true;
                }else if(j == getJml_pesanan()){
                    //index terakhir alias delete last
                    pesanan[j] = null;
                    setJml_pesanan(getJml_pesanan() - 1);
                    return true;
                }else{
                    //index tengah alias delete after
                    pesanan[j] = null;
                    for (int k = j; k < getJml_pesanan()-1; k++) {
                        pesanan[k] = pesanan[k+1];
                    }
                    pesanan[getJml_pesanan()] = null;
                    setJml_pesanan(getJml_pesanan() - 1);
                    return true;
                }
            }
        }
        return false;
    }
    
    public String toString(){
        String x = "\nID Pelanggan : "+this.getId_pelanggan()+
                "\nNama Pelanggan : "+this.getNama()+
                "\nNo Telepon : "+this.getNo_telp()+
                "\nAlamat :" +this.getAlamat_pelanggan();
        return x;
    }

    public int getJml_pesanan() {
        return jml_pesanan;
    }

    public void setJml_pesanan(int jml_pesanan) {
        this.jml_pesanan = jml_pesanan;
    }
}
