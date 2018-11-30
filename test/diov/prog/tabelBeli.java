/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diov.prog;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author falcao
 */
public class tabelBeli extends DefaultTableModel{
    //berfungsi untuk menyimpan nama kolom
    private String[] kolom;
    
    //konstruktor

    public tabelBeli() {
        this.kolom = new String[]{
          "Nama" , "Harga"  , "Jumlah"
        };
    }
    //kolomNama getter
    public String[] getKolomNama(){
        return this.kolom;
    
    }
}