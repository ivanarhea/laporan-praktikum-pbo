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
public class TestLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran1841720189Rhea ling = new Lingkaran1841720189Rhea();
        
        ling.r = 10;
        System.out.println("Luas Lingkaran adalah       = " + ling.hitungLuas());
        System.out.println("Keliling Lingkaran adalah   = " + ling.hitungKeliling());
    }
}
