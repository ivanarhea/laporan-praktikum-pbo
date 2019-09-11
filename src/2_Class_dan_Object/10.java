/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jobsheet2;

/**
 *
 * @author Rhea Ivana
 */
public class BarangTugas1841720189Rhea {
    String kode, namaBarang;
    int hargaDasar;
    float diskon;
    
    int hitungHargaJual(){
        return(int)(hargaDasar-(diskon*hargaDasar)/100);
    }
    
    public void tampilData(){
        System.out.println("Kode        = " + kode);
        System.out.println("Nama Barang = " + namaBarang);
        System.out.println("Harga Dasar = " + hargaDasar);
        System.out.println("Dsik        = " + diskon + "%");
    }
}
