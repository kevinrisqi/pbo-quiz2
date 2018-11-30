/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevinrisqi.quiz2;

/**
 *
 * @author Anonymous
 */
public class Barang {
    private String name; // Membuat atribut name
    private int qty; // Membuat atribut qty
    private float price; // Membuat atribut price

    //constructor
    public Barang(String name, float price, int qty) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    //contructor
    Barang() {
        
    }
    
    //setter dan getter dari variable yang sudah di buat
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    // Menghitung total
    public float getTotal(){
       return this.price * this.qty;
    }
    
    // Meng - override atribut name
    @Override
    public String toString() {
        return this.name;
    }
    
    
}
