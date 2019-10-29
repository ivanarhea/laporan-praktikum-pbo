/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass;

/**
 *
 * @author Rhea Ivana
 */
public class Orang1841720189Rhea {
    private String nama;
    private Hewan1841720189Rhea hewanPeliharaan;

    public Orang1841720189Rhea(String nama) {
        this.nama = nama;
    }


    public void peliharaHewan(Hewan1841720189Rhea hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku "+this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerak();
        System.out.println("-----------------------------------------");
    }
}
