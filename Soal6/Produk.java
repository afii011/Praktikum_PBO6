/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal6;

/**
 *
 * @author afifa
 */
public abstract class Produk {
    protected String nama;
    protected double harga;
    
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
    public double hitungDiskon() {
        return harga * 0;
    }
}
