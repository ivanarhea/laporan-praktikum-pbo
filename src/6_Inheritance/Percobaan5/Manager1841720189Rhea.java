/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan5;

/**
 *
 * @author Rhea Ivana
 */
public class Manager1841720189Rhea extends Karyawan1841720189Rhea {
    public int tunjangan;
    
    public Manager1841720189Rhea(){
        
    }
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan        ="+tunjangan);
        System.out.println("Total Gaji       ="+super.gaji+tunjangan);
    }
}
