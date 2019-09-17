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
public class AggotaTugas1841720189Rhea {
    private String mNomorKTP;
    private String mNama;
    private int mLimitPinjaman;
    private int mJumlahPinjaman;
    
    AggotaTugas1841720189Rhea(String nomorKTP, String nama, int limitPinjaman){
        this.mNomorKTP = nomorKTP;
        this.mNama = nama;
        this.mLimitPinjaman = limitPinjaman;
    }
    
    public void pinjamRhea(int jmlPinjam){
        if(jmlPinjam > 5000000) {
            System.out.println("Maaf, jumlah pinjam melebihi limit.");
        }else {
            mJumlahPinjaman += jmlPinjam;
        }
    }
    
    public void angsurRhea(int angsur){
        if(angsur < (mJumlahPinjaman*10)/100){
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }else{
            mJumlahPinjaman -= angsur;
            
        }
    }
   
    public String getNamaRhea(){
        return mNama;
    }
    
    public int getLimitPinjamanRhea(){
        return mLimitPinjaman;
    }
    
    public int getJumlahPinjamaanRhea(){
        return mJumlahPinjaman;
    }
}
