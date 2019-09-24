/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Rhea Ivana
 */
public class PS1841720189Rhea {
    private JenisPS1841720189Rhea jenis;
    private int bayar;

    PS1841720189Rhea(){
    }

    public void setJenisPs(String jenisPs){
    this.jenis = jenis;
    }
    public JenisPS1841720189Rhea getJenisPs(){
    return jenis;
    }

    public void setBayar(int bayar){
    this.bayar = bayar;
    }
    public int getBayar(){
    return bayar;
    }

    public int hitungBayarRentalPs(int jam){
    return bayar * jam;
    }

    public void info(){
    System.out.println("Jenis PS : " + jenis);
    System.out.println("Bayar Rental PS : " + "RP." + bayar);
   }
}
