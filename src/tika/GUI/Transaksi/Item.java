/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tika.GUI.Transaksi;

/**
 *
 * @author Tika Yln
 */
public class Item {
    
    //memberi atribut yang dibutuhkan
    private String nama;
    private float harga;
    private int jumlah;
    
    //konstruktor class Item
    public Item(){
    }
    
    //konstruktor dan parameternya class Item
    public Item(String nama, float harga, int jumlah){
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    //pemberian setter getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    //rumus mencari total
    public float getTotal(){
        return harga*jumlah;
    }
    
    //untuk mengonvert to String
    public String toString(){
        return nama;
    }
}
