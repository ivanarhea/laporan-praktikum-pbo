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
public class Percobaan11841720189Rhea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Processor1841720189Rhea p = new Processor1841720189Rhea("Intel i5",3);
        Laptop1841720189Rhea L = new Laptop1841720189Rhea("Thinkpad" , new Processor1841720189Rhea("Intel i5", 3));
        
        L.infoRhea();
        
        Processor1841720189Rhea p1 = new Processor1841720189Rhea();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop1841720189Rhea L1 = new Laptop1841720189Rhea();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.infoRhea(); 
    }  
}
