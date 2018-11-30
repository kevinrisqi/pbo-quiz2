/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diov.prog;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author falcao
 */
public class ComboBox {
    //hashMap
    private final HashMap<String, Double> items = new HashMap<>();
    
    //konstruktor

    public ComboBox() {
        this.items.put("Kopi", new Double(5000));
        this.items.put("Susu", new Double(15000));
        this.items.put("Gula", new Double(20000));
    }
    
    //ArrayList JenisNama Getter
    public ArrayList<String> getJenis(){
        ArrayList<String> str = new ArrayList<>();
        this.items.keySet().forEach((item) -> {
            str.add(item);
        });
        return str;
    }
    //ArrayList hargaBarang Getter
    public ArrayList<Double> getHarga(){
        ArrayList<Double> flt = new ArrayList<>();
        this.items.values().forEach((item) -> {
            flt.add(item);
        });
        return flt;
    }
    //menambahkan  item 
    public void addItem(String nama, Double harga){
        this.items.put(nama, harga);
    }
}
