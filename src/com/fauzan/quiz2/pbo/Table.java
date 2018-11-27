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
    InputData data = new InputData();
    
    public final TableModel setTable(){
        String [] NamaKolom = {"Nama","Harga","Jumlah"};
        Object[][] objekData = new Object [data.getData().size()][3];
        int i = 0;
        for (Data dataPelanggan : data.getData()){
            Object arrData[] = {dataPelanggan.getNamaBarang(),dataPelanggan.getHargaBarang(),dataPelanggan.getJumlahBarang()};
            objekData[i] = arrData;
            i++;
        }
        tabel = new DefaultTableModel(NamaKolom, i);
        return tabel;
    }
}
