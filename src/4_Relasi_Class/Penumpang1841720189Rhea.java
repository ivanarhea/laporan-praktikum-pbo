/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerbong;

/**
 *
 * @author Rhea Ivana
 */
public class Penumpang1841720189Rhea {
    private String ktp;
    private String nama;
    
    Penumpang1841720189Rhea(String nama, String ktp) {
        this.nama=nama;
        this.ktp=ktp;       
   }
    public void setnama(String nama) {
        this.nama = nama;
    }
    public String getnama() {
        return nama;
    }
    public void setktp(String ktp) {
        this.ktp = ktp;
    }

    public String getktp() {
        return ktp;
    }
    public String info() { 
           String info = "";
           info += "Ktp: " + ktp + "\n"; 
           info += "Nama: " + nama + "\n";
           return info; 
} 
}
