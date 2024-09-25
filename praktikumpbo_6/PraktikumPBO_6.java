/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_6;

/**
 *
 * @author afifa
 */
public class PraktikumPBO_6 {

    public static void main(String[] args) {
        Hewan kucing = new Hewan();
        kucing.bersuara();
        kucing.makan("Ikan Tongkol");
        kucing.makan("Ikan Tongkol", 3);
        
        Hewan anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("Daging");
        anjing.makan("Daging", 5);
    }
}
