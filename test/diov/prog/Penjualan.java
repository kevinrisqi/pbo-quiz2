package diov.prog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author falcao
 */
import java.util.ArrayList;
public class Penjualan {
    //variable untuk menampilkan kode pembayaran 
    private final String kode;
    //item untuk menampilkan item apa saja yang dibeli
    private  ArrayList<Item> items = new ArrayList();
    //variable menampilkan total pembelian
    private float total;
    
    //konstruktor

    public Penjualan() {
        this.kode = null;
    }
    

    public Penjualan(String kode, ArrayList<Item> items) {
        this.kode = kode;
        this.items = items;
    }
    
    //total setter
    public void setTotal(){
        double total = 0;
        for(Item item : this.items){
            total += item.getTotal();
        }
        this.total = (float) total;
    }
    //output transaksi
    public String Pembayaran(){
        setTotal();
        String x = "";
        x += "Kode\t\t : " + this.kode + "\n";
        x += "Daftar Belanja : \n ";
        x = this.items.stream().map((item) -> "\t" + item.getNama()  + "(" + item.getJumlah() + ") : " +item.getTotal() + "\n").reduce(x, String::concat);
        x += "Total\t\t : " + this.total;
        return x;
    }
    
}
