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
    private HashMap<String,Float> items = new HashMap<>();
    
    public ComboBoxModel(){
        this.items.put("Gula", new Float(3000));
        this.items.put("Kopi", new Float(2500));
        this.items.put("Susu", new Float(2000));
    }
    
    public ArrayList<Float> getPrices(){
        ArrayList<Float> flt = new ArrayList<>();
        for(float item : this.items.values){
            flt.add(item);
        }
        return flt;
    }
    
    public ArrayList<Float> getNames(){
        ArrayList<String> str = new ArrayList<>();
        for(String str : this.items.keySet()){
            str.add(item);
        }
        return str;
    }
    
    public void addItem(String name, float price){
        this.items.put(name,price);
    }
}
