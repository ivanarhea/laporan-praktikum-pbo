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
public class Mac1841720189Rhea extends Laptop1841720189Rhea{
    public String security;
    
    public Mac1841720189Rhea(){
        
    }

    public Mac1841720189Rhea(String security, String jnsBaterai, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(jnsBaterai, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilData();
        System.out.println("Security            ="+security);
    }
}
