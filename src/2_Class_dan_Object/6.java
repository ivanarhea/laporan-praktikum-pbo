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
public class Toko1841720189Rhea {
    public int memberID;
    public int harga;
    public int jumlah;
    public String nama;
    public String alamat;
    public String umur;
    public String judulbuku;
    
    public void dataPembeli(){
        System.out.println("No Member       : " + memberID);
        System.out.println("Nama            : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Umur            : " + umur);
        System.out.println("Judul Buku      : " + judulbuku);
        System.out.println("Jumlah          : " + jumlah);
        System.out.println("Harga           : " + harga);
    }
    
    public int totalHarga(int totalBayar){
        int bayar = harga * totalBayar;
        return bayar;
    }
}
