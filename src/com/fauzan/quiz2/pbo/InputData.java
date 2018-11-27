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
import com.sun.glass.ui.Size;
import java.util.*;
public class InputData {
    ArrayList<Data> dataPelanggan;
    
    public InputData(){
        dataPelanggan = new ArrayList();
    }
    
    public int duplicateChecking(String nama, int jumlah){
            for (int i = 0;i<dataPelanggan.size();i++){
                if (dataPelanggan.get(i).namaBarang.contains(nama)){
                    return i;
            }
        }
            return -1;
    }
    
    public void isiData(String nama, int jumlah, int harga){
        int tmp = duplicateChecking (nama,jumlah);
        
        if (tmp >= 0){
            jumlah += dataPelanggan.get(tmp).jumlahBarang;
            Data data = new Data(nama,jumlah,harga);
            dataPelanggan.add(data);
        }else{
            Data data = new Data(nama,jumlah,harga);
            dataPelanggan.add(data);
        }
    }
    
    public ArrayList<Data> getData(){
        return dataPelanggan;
    }
}