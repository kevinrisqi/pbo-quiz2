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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Table {
    DefaultTableModel tabel;
    
    public final TableModel setTable(){
        String [] NamaKolom = {"Nama","Harga","Jumlah"};
        int i = 0;
        tabel = new DefaultTableModel(NamaKolom, i);
        return tabel;
    }
}
