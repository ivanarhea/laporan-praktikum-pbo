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
public class TugasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mac1841720189Rhea mc = new Mac1841720189Rhea();
        mc.security = "Smadav";
        mc.jnsBaterai = "9h";
        mc.merk = "HP";
        mc.jnsProsesor = "core i5";
        mc.kecProsesor = 679;
        mc.sizeMemory = 8;
        mc.tampilMac();
        
        Windows1841720189Rhea wn = new Windows1841720189Rhea();
        wn.fitur = "Windows";
        wn.merk = "Asus";
        wn.jnsProsesor = "core i7";
        wn.kecProsesor = 970;
        wn.sizeMemory = 18;
        wn.tampilWindows();
        
        PC1841720189Rhea pc1 = new PC1841720189Rhea();
        pc1.ukuranMonitor = 14;
        pc1.merk = "Strix";
        pc1.jnsProsesor = "core i9";
        pc1.kecProsesor = 999;
        pc1.sizeMemory = 1000;
        pc1.tampilPc();
    }
    
}
