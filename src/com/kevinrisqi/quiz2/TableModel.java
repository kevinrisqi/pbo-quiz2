/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevinrisqi.quiz2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anonymous
 */
public class TableModel extends DefaultTableModel{
    private String[] columns;
    
    //constructor
    public TableModel(){
        this.columns = new String[]{
            "Nama","Harga","Jumlah"
        };
    }
    
    //Getter dari kolom
    public String[] getColumnsName(){
        return this.columns;
    }
}
