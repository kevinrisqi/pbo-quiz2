/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tika.GUI.Transaksi;
import javax.swing.table.*;
/**
 *
 * @author Tika Yln
 */

//pengaturan baris dan kolom pada tabel
public class Tabel extends DefaultTableModel {
    //membuat aribut
    private String[] columns;
    
    //konstruktor
    public Tabel(){
        this.columns = new String[]{
            "Nama", "Harga", "Jumlah"
        };
    }
    
    //kolom nama
    public String[] getColumnName(){
        return this.columns;
    }
}
