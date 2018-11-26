/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevinrisqi.quiz2;

/**
 *
 * @author Anonymous
 */
public class Barang {
    private String tanggal;
    private String item;
    private int qty;

    public Barang(String tanggal, String item, int qty) {
        this.tanggal = tanggal;
        this.item = item;
        this.qty = qty;
    }

    Barang() {
        
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
}
