/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tika.GUI.Transakasi;

/**
 *
 * @author Tika Yln
 */
public class Item {
    
    private String nama;
    private float harga;
    private int jumlah;
    
    public Item(){
    }
    
    public Item(String nama, float harga, int jumlah){
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

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
    
    public float getTotal(){
        return harga*jumlah;
    }
    
    public String toString(){
        return nama;
    }
}
