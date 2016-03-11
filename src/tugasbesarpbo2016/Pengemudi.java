/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesarpbo2016;

/**
 *
 * @author BOSS-PC
 */
public class Pengemudi {
    	private long id_pengemudi;
	private Pesanan[] pesanan = new Pesanan[100];
	private int i;
	
	public Pengemudi(String nama, long no_telp, long id_pelanggan)
	{
		super(nama,no_telp,id_pelanggan);
	}
	public void setPesanan(String id_pelanggan)
	{
		this.id_pelanggan = id_pelanggan;
	}
	public Pesanan getPesanan(int n)
	{
		if (n<100)
		{
			return pesanan[n];
		} 
		else 
		{
			return null;
		}
	}
	public void addPesanan(Pesanan p)
	{
		if (i<100)
		{
			pesanan[i] = p;
			i++;
		}
		else
		{
			System.out.println("Array Pesanan Penuh !!!");
		}
	}

}
