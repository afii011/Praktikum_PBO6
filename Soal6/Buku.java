/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal6;

/**
 *
 * @author afifa
 */
public class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }
    @Override
    public double hitungDiskon() {
        return harga * 0.10;
    }
}
