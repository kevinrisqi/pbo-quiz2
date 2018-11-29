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
public class Tabel extends DefaultTableModel {
    private String[] columns;
    
    //pengaturan baris dan kolom pada tabel
    public Tabel(){
        this.columns = new String[]{
            "Nama", "Harga", "Jumlah"
        };
    }
    public String[] getColumnName(){
        return this.columns;
    }
}
