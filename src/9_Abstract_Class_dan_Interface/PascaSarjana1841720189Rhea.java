/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author Rhea Ivana
 */
public class PascaSarjana1841720189Rhea extends Mahasiswa1841720189Rhea implements ICumlaude1841720189Rhea{
    public PascaSarjana1841720189Rhea(String nama) {
        super(nama);
    }
    
    @Override
    public void lulusRhea() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggiRhea() {
        System.out.println("IPK-ku lebih dari 3,71");
    }
    
}
