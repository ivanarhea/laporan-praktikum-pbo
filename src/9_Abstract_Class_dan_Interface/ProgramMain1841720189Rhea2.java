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
public class ProgramMain1841720189Rhea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rektor1841720189Rhea pakRektor = new Rektor1841720189Rhea();
        
        Mahasiswa1841720189Rhea MahasiswaBiasa = new Mahasiswa1841720189Rhea("Charlie");
        Sarjana1841720189Rhea sarjanaCumlaude = new Sarjana1841720189Rhea("Dini");
        PascaSarjana1841720189Rhea masterCumlaude = new PascaSarjana1841720189Rhea("Elok");
        
        MahasiswaBiasa.kuliahDikampusBagus();
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
        sarjanaCumlaude.kuliahDikampusBagus();
        pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
        masterCumlaude.kuliahDikampusBagus();
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
    }
}

