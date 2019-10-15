/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Rhea Ivana
 */
public class MainOverriding1841720189Rhea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia1841720189Rhea m = new Manusia1841720189Rhea();
        Dosen1841720189Rhea d   = new Dosen1841720189Rhea();
        Mahasiswa1841720189Rhea mhs = new Mahasiswa1841720189Rhea();
        
        m.makanRhea();
        m.bernafasRhea();
        d.makanRhea();
        d.lemburRhea();
        mhs.makanRhea();
        mhs.tidurRhea();
    }
    
}
