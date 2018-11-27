/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fauzan.quiz2.pbo;

/**
 *
 * @author fauzan
 */

import java.util.*;
public class Data {
    protected String namaBarang;
    protected int jumlahBarang;
    protected int hargaBarang;
    
    public Data(String namaBarang, int jumlahBarang, int hargaBarang){
        if (namaBarang.equals("Kopi")){
            hargaBarang += 10000;
        }else if (namaBarang.equals("Susu")){
            hargaBarang += 20000;
        }else if (namaBarang.equals("Gula")){
            hargaBarang += 50000;
        }
        
        this.namaBarang = namaBarang;
        this.jumlahBarang = jumlahBarang;
        this.hargaBarang = hargaBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }
    
}