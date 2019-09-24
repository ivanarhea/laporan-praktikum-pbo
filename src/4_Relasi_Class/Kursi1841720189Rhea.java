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
public class Kursi1841720189Rhea {
    private String nomer;
    private Penumpang1841720189Rhea penumpang;
   
    Kursi1841720189Rhea(String nomer) {
        this.nomer=nomer;   
    }
    public void setnomer(String nomer) {
        this.nomer = nomer;
    }
    public String getnomer() {
        return nomer;
   }
      
    public void setpenumpang(Penumpang1841720189Rhea penumpang) {
        this.penumpang = penumpang;
    }
    public Penumpang1841720189Rhea getpenumpang() {
        return penumpang;
}
    public String info1841720189Rhea() { 
        String info = ""; 
        info += "Nomor: " + nomer + "\n";
        if (this.penumpang != null) { 
        info += "Penumpang: " + penumpang.info() + "\n"; 
      } return info; 
    } 
}
