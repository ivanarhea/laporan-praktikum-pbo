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
public class ProgramMain1841720189Rhea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kucing1841720189Rhea Kucingkampung = new Kucing1841720189Rhea();
        Ikan1841720189Rhea Lumbalumba = new Ikan1841720189Rhea();
        
        Orang1841720189Rhea ani = new Orang1841720189Rhea("Ani");
        Orang1841720189Rhea Budi = new Orang1841720189Rhea("Budi");
        
        ani.peliharaHewan(Kucingkampung);
        Budi.peliharaHewan(Lumbalumba);
        
        ani.ajakPeliharaanJalanJalan();
        Budi.ajakPeliharaanJalanJalan();
    }
    
}
