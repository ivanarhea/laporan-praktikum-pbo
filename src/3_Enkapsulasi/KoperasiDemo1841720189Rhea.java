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
public class KoperasiDemo1841720189Rhea {
    public static void main(String[] args) {
        Anggota1841720189Rhea anggota1 = new Anggota1841720189Rhea();
        anggota1.setNama("Ivanarhea Endagavrila Clareta");
        anggota1.setAlamat("Jalan Soekarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}
