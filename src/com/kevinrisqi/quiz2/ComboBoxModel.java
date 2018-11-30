/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevinrisqi.quiz2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Anonymous
 */
public class ComboBoxModel {
    private HashMap<String,Float> barang = new HashMap<>();
    
    public ComboBoxModel(){
        this.barang.put("Gula", new Float(3000));
        this.barang.put("Kopi", new Float(2500));
        this.barang.put("Susu", new Float(2000));
    }
    
    public ArrayList<Float> getPrices(){
        ArrayList<Float> flt = new ArrayList<>();
        for(float item : this.barang.values()){
            flt.add(item);
        }
        return flt;
    }
    
    public ArrayList<String> getNames(){
        ArrayList<String> str = new ArrayList<>();
        for(String item : this.barang.keySet()){
            str.add(item);
        }
        return str;
    }
    
    public void addItem(String name, float price){
        this.barang.put(name,price);
    }
}
