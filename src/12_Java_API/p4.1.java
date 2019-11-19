/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan4;
import java.util.ArrayList;
/**
 *
 * @author Rhea Ivana
 */
public class InputData1841720189Rhea {
    ArrayList<Mahasiswa1841720189Rhea> ListMahasiswa;

    public InputData1841720189Rhea() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDataRhea(String Nim, String Nama, String Alamat) {
        Mahasiswa1841720189Rhea mhs = new Mahasiswa1841720189Rhea(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720189Rhea> getData() {
        return ListMahasiswa;
    }
}
