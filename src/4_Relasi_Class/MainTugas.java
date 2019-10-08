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
public class MainTugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JenisPS1841720189Rhea jsps = new JenisPS1841720189Rhea();
        jsps.tampil();

        PS1841720189Rhea ps = new PS1841720189Rhea();
        ps.setBayar(5000);

        Server1841720189Rhea s = new Server1841720189Rhea();
        s.setPenjaga("yohan");
        s.setShiftJaga(3);
        s.info();
   
        Pelanggan1841720189Rhea u = new Pelanggan1841720189Rhea();
        u.setUser("Albani");
        u.setPs(ps);
        u.setServer(s);
        u.setJam(8);
        u.info();
        System.out.println("Biaya Total = " + ps.hitungBayarRentalPs(5));
        }
}

