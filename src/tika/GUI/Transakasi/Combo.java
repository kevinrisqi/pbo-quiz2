/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tika.GUI.Transakasi;

import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Tika Yln
 */
public class Combo {
    private HashMap<String,Float> items = new HashMap<>();

    public Combo() {
        this.items.put("Gula", new Float(30000));
        this.items.put("Kopi", new Float(10000));
        this.items.put("Susu", new Float(20000));
    }
    
    public ArrayList<String> getNama(){
        ArrayList<String> str = new ArrayList<>();
        for (String item : this.items.keySet()){
            str.add(item);
        }
        return str;
    }
    
    public ArrayList<Float> getHarga(){
        ArrayList<Float> flt = new ArrayList<>();
        for(float item : this.items.values()){
            flt.add(item);
        }
        return flt;
    }
    
    public void addItem(String nama, float harga){
        this.items.put(nama, harga);
    }
    
}
