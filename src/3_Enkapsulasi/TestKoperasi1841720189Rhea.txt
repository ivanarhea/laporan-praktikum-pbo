/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jb3enkapsulasi;

/**
 *
 * @author Rhea Ivana
 */
public class TestKoperasi1841720189Rhea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AggotaTugas1841720189Rhea donny = new AggotaTugas1841720189Rhea("33602850", "Ivnrhea", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNamaRhea());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjamanRhea());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjamRhea(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamaanRhea());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjamRhea(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamaanRhea());
        
        System.out.println("\nMeminjam uang 200.000...");
        donny.angsurRhea(200000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamaanRhea());
        
        System.out.println("\nMeminjam uang 3.000.000...");
        donny.angsurRhea(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamaanRhea());
    }
    
}
