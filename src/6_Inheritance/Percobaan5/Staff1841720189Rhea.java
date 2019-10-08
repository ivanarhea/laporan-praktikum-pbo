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
public class Staff1841720189Rhea extends Karyawan1841720189Rhea {
    public int lembur,potongan;
    
    public Staff1841720189Rhea(){
    }
    
    Staff1841720189Rhea(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    public void tampilDataStaffRhea() {
        super.tampilDataKaryawan();
        System.out.println("Lembur: " + lembur);
        System.out.println("Potongan: " + potongan);
        System.out.println("Total Gaji: " + (gaji + lembur - potongan));
    }
}
