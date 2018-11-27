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
    ArrayList<String> namaBarang = new ArrayList<String>();
    ArrayList<Integer> jumlahBarang = new ArrayList<Integer>();
    ArrayList<Integer> hargaBarang = new ArrayList<Integer>();
    
    public Data(String namaBarang, int jumlahBarang, int hargaBarang){
        this.namaBarang.add(namaBarang);
        this.jumlahBarang.add(jumlahBarang);
        this.hargaBarang.add(hargaBarang);
    }
    
}
