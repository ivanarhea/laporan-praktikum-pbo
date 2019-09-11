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
public class testBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barang1841720189Rhea brg1 = new Barang1841720189Rhea();
        brg1.namaBrg    = "Kotak Pensil";
        brg1.jenisBrg   = "ATK";
        brg1.stok       = 15;
        brg1.tampilBarang();
        
        //menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok baru adalah " + brg1.tambahStok(20));
    }
    
}
