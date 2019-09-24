/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jb4relasi;

/**
 *
 * @author Rhea Ivana
 */
public class Pelanggan1841720189Rhea {
    private String nama;
    private int hari;
    private Sopir1841720189Rhea sopir;
    private Mobil1841720189Rhea mobil;

    Pelanggan1841720189Rhea() {
    }

    public void setnama(String nama) {

        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setMobil(Mobil1841720189Rhea mobil) {

        this.mobil = mobil;
    }

    public Mobil1841720189Rhea getMobil() {
        return mobil;
    }

    public void setsopir(Sopir1841720189Rhea sopir) {
        this.sopir = sopir;
    }

    public Sopir1841720189Rhea getsopir() {
        return sopir;
    }

    public void sethari(int hari) {
        this.hari = hari;
    }

    public int gethari() {
        return hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}
