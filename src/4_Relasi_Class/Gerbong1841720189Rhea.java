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
public class Gerbong1841720189Rhea {
    private String kode;
    private Kursi1841720189Rhea[]arrKursi;
    
    Gerbong1841720189Rhea(String kode,int jumlah){
        this.kode=kode;
        this.arrKursi=new Kursi1841720189Rhea[jumlah];
        this.initKursi();
    }
    private void initKursi() { 
        for (int i = 0; i < arrKursi.length; i++) {
        this.arrKursi[i] = new Kursi1841720189Rhea(String.valueOf(i + 1)); 
        }
    }
    public void setkode(String kode){
        this.kode=kode;
    }
    public String getKode(){
        return kode;
    }
    public void setPenumpang(Penumpang1841720189Rhea penumpang, int nomor) {
        this.arrKursi[nomor - 1].setpenumpang(penumpang); 
    }
    public String info1841720189Rhea() { String info = ""; 
    info += "Kode: " + kode + "\n"; 
    for (Kursi1841720189Rhea kursi : arrKursi) {
        info += kursi.info1841720189Rhea(); 
    } 
    return info; 
} 
}
