/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 *
 * @author Rhea Ivana
 */
public class Utama1841720189Rhea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720189Rhea man[] = new Manager1841720189Rhea[2];
        Staff1841720189Rhea staff1[] = new Staff1841720189Rhea[2];
        Staff1841720189Rhea staff2[] = new Staff1841720189Rhea[3];
        
        System.out.println();
        man[0] = new Manager1841720189Rhea();
        man[0].setmNamaRhea("Tedjo");
        man[0].setmNipRhea("101");
        man[0].setmGolonganRhea("1");
        man[0].setmTunjanganRhea(5000000);
        man[0].setmBagianRhea("Administrasi");
        
        System.out.println();
        man[1] = new Manager1841720189Rhea();
        man[1].setmNamaRhea("Atika");
        man[1].setmNipRhea("102");
        man[1].setmGolonganRhea("1");
        man[1].setmTunjanganRhea(2500000);
        man[1].setmBagianRhea("Pemasran");
        
        System.out.println();
        staff1[0] = new Staff1841720189Rhea();
        staff1[0].setmNamaRhea("Usman");
        staff1[0].setmNipRhea("0003");
        staff1[0].setmGolonganRhea("2");
        staff1[0].setmLemburRhea(10);
        staff1[0].setmGajiLemburRhea(10000);
        
        System.out.println();
        staff1[1] = new Staff1841720189Rhea();
        staff1[1].setmNamaRhea("Anugrah");
        staff1[1].setmNipRhea("0005");
        staff1[1].setmGolonganRhea("2");
        staff1[1].setmLemburRhea(10);
        staff1[1].setmGajiLemburRhea(55000);
        man[0].setStRhea(staff1);
        
        System.out.println();
        staff2[0] = new Staff1841720189Rhea();
        staff2[0].setmNamaRhea("Hendra");
        staff2[0].setmNipRhea("0004");
        staff2[0].setmGolonganRhea("3");
        staff2[0].setmLemburRhea(15);
        staff2[0].setmGajiLemburRhea(5500);
        
        System.out.println();
        staff2[1] = new Staff1841720189Rhea();
        staff2[1].setmNamaRhea("Arie");
        staff2[1].setmNipRhea("0006");
        staff2[1].setmGolonganRhea("4");
        staff2[1].setmLemburRhea(5);
        staff2[1].setmGajiLemburRhea(100000);
        
        System.out.println();
        staff2[2] = new Staff1841720189Rhea();
        staff2[2].setmNamaRhea("Mentari");
        staff2[2].setmNipRhea("0007");
        staff2[2].setmGolonganRhea("3");
        staff2[2].setmLemburRhea(6);
        staff2[2].setmGajiLemburRhea(20000);
        man[1].setStRhea(staff2);
        
        System.out.println();
        man[0].lihatInfoRhea();
        man[1].lihatInfoRhea();
    }
    
}
