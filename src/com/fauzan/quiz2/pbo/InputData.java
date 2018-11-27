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
public class InputData {
    Object [][] DataPelanggan;
    
    public InputData(){
        
    }
    
    public void isiData(String nama, int jumlah, int harga){
        Data data = new Data(nama,jumlah,harga);
        
    }
}
