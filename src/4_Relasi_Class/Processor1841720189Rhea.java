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
public class Processor1841720189Rhea {
    private String merk;
    private double cache;

    public Processor1841720189Rhea() {
    }

    public Processor1841720189Rhea(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }
    
    public void infoRhea() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
