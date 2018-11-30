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
    private String name;
    private int qty;
    private float price;

    public Barang(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    Barang() {
        
    }

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
    
    public float getTotal(){
       return this.price * this.qty;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
}
