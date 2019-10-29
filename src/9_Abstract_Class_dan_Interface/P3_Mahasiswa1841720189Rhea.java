/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rhea Ivana
 */
public class P3_Mahasiswa1841720189Rhea implements P3_ICumlaude1841720189Rhea{
    protected String nama;

    public P3_Mahasiswa1841720189Rhea(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void lulusRhea() {
        System.out.println("BISMILLAH TERBAIK"); 
    }

    @Override
    public void meraihIPKTinggiRhea() {
        System.out.println("LEBIH DARI 3,5"); 
    }
    
    public void kuliahDikampusRhea(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

}
