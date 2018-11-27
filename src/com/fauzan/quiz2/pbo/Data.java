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
    protected ArrayList<String> namaBarang = new ArrayList<String>();
    protected ArrayList<Integer> jumlahBarang = new ArrayList<Integer>();
    protected ArrayList<Integer> hargaBarang = new ArrayList<Integer>();
    
    public Data(String namaBarang, int jumlahBarang, int hargaBarang){
        this.namaBarang.add(namaBarang);
        this.jumlahBarang.add(jumlahBarang);
        this.hargaBarang.add(hargaBarang);
    }
    
    public void checkingDuplicate(String barangDuplikat, int items){
        for (int i = 0; i<namaBarang.size();i++){
            if (namaBarang.contains(barangDuplikat)){
                hargaBarang.set(i, items);
            }
        }
    }
    
    public void deleteAll(){
        namaBarang.clear();
        jumlahBarang.clear();
        hargaBarang.clear();
    }
}
