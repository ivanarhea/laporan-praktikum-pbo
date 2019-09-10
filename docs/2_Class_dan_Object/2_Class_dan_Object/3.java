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
public class TestMahasiswa {
    public static void main (String args[]) {
        Mahasiswa1841720189Rhea mhs1 = new Mahasiswa1841720189Rhea();
        Mahasiswa1841720189Rhea mhs2 = new Mahasiswa1841720189Rhea();
        Mahasiswa1841720189Rhea mhs3 = new Mahasiswa1841720189Rhea();
        
        mhs1.nim        = 101;
        mhs1.nama       = "Ivanarhea Endagavrila Clareta";
        mhs1.alamat     = "Jl.Ahmad Yani no.23 Ngajum";
        mhs1.kelas      = "2D";
        System.out.println("");
        mhs1.tampilBiodata();
        
        mhs1.nim        = 102;
        mhs1.nama       = "Ivanarhea Endagavrila";
        mhs1.alamat     = "Jl.Ahmad Yani no.23 Ngajum";
        mhs1.kelas      = "3D";
        System.out.println("");
        mhs1.tampilBiodata();
        
        mhs1.nim        = 103;
        mhs1.nama       = "Ivanarhea";
        mhs1.alamat     = "Jl.Ahmad Yani no.23 Ngajum";
        mhs1.kelas      = "4D";
        System.out.println("");
        mhs1.tampilBiodata();
    }
}
