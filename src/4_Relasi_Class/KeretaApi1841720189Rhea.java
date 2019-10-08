/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeretaApi;

/**
 *
 * @author Rhea Ivana
 */
public class KeretaApi1841720189Rhea {
    private String nama;
    private String kelas;
    private Pegawai1841720189Rhea masinis;
    private Pegawai1841720189Rhea asisten;

    KeretaApi1841720189Rhea(String nama, String kelas, Pegawai1841720189Rhea masinis, Pegawai1841720189Rhea asisten) {
        this.asisten = asisten;
        this.kelas = kelas;
        this.masinis = masinis;
        this.nama = nama;

    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getnama() {
        return nama;
    }

    public void setkelas(String kelas) {
        this.kelas = kelas;
    }

    public String getkelas() {
        return kelas;
    }

    public void setmasinis(Pegawai1841720189Rhea masinis) {
        this.masinis = masinis;
    }

    public Pegawai1841720189Rhea getmasinis() {
        return asisten;
    }

    public void setAsisten(Pegawai1841720189Rhea asisten) {
        this.asisten = asisten;
    }

    public Pegawai1841720189Rhea getAsisten() {
        return asisten;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }
}
