/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal6;

/**
 *
 * @author afifa
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja(3);
        
        keranjang.keranjangbelanja(new Buku("Laut Bercerita", 98000));
        keranjang.keranjangbelanja(new Elektronik("AC", 2500000));
        keranjang.keranjangbelanja(new Pakaian("PDH", 130000));
        
        keranjang.detailBarang();
        
        double totalHarga = keranjang.hitungHarga();
        System.out.println("Total harga sebelum diskon : " + totalHarga);
        double totalHargaDiskon = keranjang.hitungHargaDiskon();
        System.out.println("Total harga setelah diskon : " + totalHargaDiskon);
    }
}
