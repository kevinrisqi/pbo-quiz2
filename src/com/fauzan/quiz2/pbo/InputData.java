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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputData {
    ArrayList<Data> dataPelanggan;
    int ID = 1;
    
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
    
    public String giveID(){
        DateFormat dateFormat = new SimpleDateFormat("yyMMdd");
        Date date = new Date();
        String dt=String.valueOf(dateFormat.format(date));
        String id = String.format("%02d", ID);
        ID++;
        return dt+id;
    }
}