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
public class TestBarangTugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarangTugas1841720189Rhea tugas = new BarangTugas1841720189Rhea();
        
        tugas.kode          = "DUABELAS";
        tugas.namaBarang    = "Lemari";
        tugas.hargaDasar    = 120000;
        tugas.diskon        = 5;
        tugas.tampilData();
        
        System.out.println("Harga Jual Barang   : " + tugas.hitungHargaJual());
    }
    
}
