/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rhea Ivana
 */
public class P3_MahasiswaMain1841720189Rhea {
    public static void main(String[] args) {
         P3_Rektor1841720189Rhea pakRektor = new P3_Rektor1841720189Rhea();
        
        //P3_Mahasiswa1841720189Rhea MahasiswaBiasa = new P3_Mahasiswa1841720146Bagus("Charlie");
        P3_Sarjana1841720189Rhea sarjanaCumlaude = new P3_Sarjana1841720189Rhea("Dini");
        P3_PascaSarjana1841720189Rhea masterCumlaude = new P3_PascaSarjana1841720189Rhea("Elok");
        
        //MahasiswaBiasa.kuliahDikampusBagus();
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);
        //sarjanaCumlaude.kuliahDikampusBagus();
        //pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
        //masterCumlaude.kuliahDikampusBagus();
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        
        pakRektor.beriSertifikatMawapres(masterCumlaude);
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
    }
    
}
