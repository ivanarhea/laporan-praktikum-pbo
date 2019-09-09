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
public class TestToko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toko1841720189Rhea tokobuku1 = new Toko1841720189Rhea();
        
        tokobuku1.memberID   = 101;
        tokobuku1.nama       = "Ivanarhea Endagavrila Clareta";
        tokobuku1.alamat     = "Jl.Ahmad Yani no.23 Ngajum";
        tokobuku1.umur       = "18";
        tokobuku1.judulbuku  = "Terbitnya Matahari";
        tokobuku1.jumlah     = 2;
        tokobuku1.harga      = 15000;
        System.out.println("");
        tokobuku1.dataPembeli();
        
        System.out.println("Total yang harus dibayar = " + tokobuku1.totalHarga(2));
    }
    
}
