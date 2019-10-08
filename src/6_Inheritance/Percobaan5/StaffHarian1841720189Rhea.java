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
public class StaffHarian1841720189Rhea extends Staff1841720189Rhea{
    public int jmlJamKerja;
    
    public StaffHarian1841720189Rhea(){
    
}
    public StaffHarian1841720189Rhea(String nama, String alamat, String jk, int umur,
            int gaji,int lembur,int potongan,int jmlJamKerja){
        super(nama,alamat,jk,umur,gaji,lembur,potongan);
        this.jmlJamKerja=jmlJamKerja;
    }
    public void tampilStaffHarian1841720046Reza(){
        System.out.println("========== Data Staff Harian==========");
        super.tampilDataStaffRhea();
        System.out.println("Jumlah Jam Kerja ="+jmlJamKerja);
        System.out.println("Gaji Bersih      ="+(gaji*jmlJamKerja+lembur-potongan));
        
    }
}
