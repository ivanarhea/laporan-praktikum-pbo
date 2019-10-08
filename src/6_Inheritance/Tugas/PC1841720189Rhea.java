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
public class PC1841720189Rhea extends Komputer1841720189Rhea {
    public int ukuranMonitor;

    public PC1841720189Rhea(){
        
    }
    public PC1841720189Rhea(int ukuranMonitor, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPc(){
        super.tampilData();
        System.out.println("ukuran PC           ="+ukuranMonitor);
    }
}
