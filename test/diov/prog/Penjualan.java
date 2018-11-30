/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diov.prog;

import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author falcao
 */
public final class Penjualan { 
  
    private String code;
    private final ArrayList<Item> items= new ArrayList<>();
    private double total;
    private DefaultTableModel tabel = new DefaultTableModel();
    

    public Penjualan(String code, double total) {
        this.code = code;
        this.total = total;
    }

    public Penjualan() {
        getTabel().addColumn("Nama");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Jumlah");
    } 
    
    

    public String getCode() {
        return code;
    }

    public DefaultTableModel getTabel() {
        return tabel;
    }

    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public String Daftar() { 
        getTotal();
        String moza = "";
        moza += "Code\t\t: "+ this.code +"\n";
        moza += "List Belanja : \n";
        moza = this.items.stream().map((item) -> "\t"+ item.getNama() +"(z"+ item.getJumlah() +") : "+ item.getTotal() +"\n").reduce(moza, String::concat);
        moza += "Total\t\t: "+ this.total;
        return moza;
    }
}