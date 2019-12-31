/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb.pkg14;;

import backend1841720189Rhea.Kategori1841720189Rhea;

public class TestBackend1841720189Rhea {
    public static void main(String[] args) {
        Kategori1841720189Rhea kat1 = new Kategori1841720189Rhea("Novel", "Koleksi buku novel");
        Kategori1841720189Rhea kat2 = new Kategori1841720189Rhea("Referensi", "Buku referensi ilmiah");
        Kategori1841720189Rhea kat3 = new Kategori1841720189Rhea("Komik", "Komik anak-anak");
        
        //test insert
        kat1.save();
        kat2.save();
        kat3.save();
        
        //test update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();
        
        //test delete
        kat3.delete();
        
        //tes select all
        for(Kategori1841720189Rhea k : new Kategori1841720189Rhea().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
        
        //test search
        for(Kategori1841720189Rhea k : new Kategori1841720189Rhea().search("ilmiah")){
            System.out.println("Nama: " + k.getNama()) + ", Ket: " + k.getKeterangan());
        }
    }
}
