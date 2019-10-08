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
public class Laptop1841720189Rhea extends Komputer1841720189Rhea {
    public String jnsBaterai;
    
    public Laptop1841720189Rhea(){
        
    }

    public Laptop1841720189Rhea(String jnsBaterai, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBaterai = jnsBaterai;
    }
    
    public void tampilLeptop(){
        super.tampilData();
        System.out.println("Jenis Baterai       ="+jnsBaterai);
    }
}
