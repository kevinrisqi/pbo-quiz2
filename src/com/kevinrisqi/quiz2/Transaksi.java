/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevinrisqi.quiz2;

import java.util.ArrayList;

/**
 *
 * @author Anonymous
 */
public class Transaksi {
    private final String code;
    private ArrayList<Barang> barang = new ArrayList<>();
    private float total;
    
    //constructor
    public Transaksi(String code, ArrayList<Barang> barang){
        this.code = code;
        this.barang = barang;
    }
    
    // Total
    public void setTotal(){
        float total = 0;
        for(Barang barang : this.barang){
            total += barang.getTotal();
        }
        this.total = total;
    }
    
    //Hasil dari transaksi
    public String prtDetail(){
        setTotal();
        String str = "";
        str += "Kode\t\t: "+this.code + "\n";
        str += "Daftar Belanja : \n";
        for(Barang barang : this.barang){
            str += "\t" +barang.getName() + "(x"+barang.getQty()+") : "+barang.getTotal()+"\n";
        }
        str += "Total\t\t : "+this.total;
        return str;
    }
}
