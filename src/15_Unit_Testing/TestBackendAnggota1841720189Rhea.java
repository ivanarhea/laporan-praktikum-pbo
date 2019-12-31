package jb.pkg15;

import database.Anggota1841720189Rhea;
import database.Kategori1841720189Rhea;

public class TestBackendAnggota1841720189Rhea {

    public static void main(String[] args) {
        Anggota1841720189Rhea anggota1 = new Anggota1841720189Rhea("Andy", "Landungsari", "085766566560");
        Anggota1841720189Rhea anggota2 = new Anggota1841720189Rhea("Udean", "Batu", "085331456789");
        Anggota1841720189Rhea anggota3 = new Anggota1841720189Rhea("Ella", "Kepanjen", "081445335267");
        
        anggota1.save();
        anggota2.save();
        anggota3.save();
       
        // test update
        anggota2.setAlamat("Probolinggo");
        anggota2.save();

        // test delete
        anggota3.delete();

        // test select all
        for (Anggota1841720189Rhea a : new Anggota1841720189Rhea().getAll()) {
            System.out.println("Nama: " + a.getNama()+ ", Alamat: " + a.getAlamat()
                    + ", Telepon: "+ a.getTelepon());
        }

        // test search
        for (Anggota1841720189Rhea a : new Anggota1841720189Rhea().search("udean")) {
            System.out.println("Nama: " + a.getNama()+ ", Alamat: " + a.getAlamat()
                    + ", Telepon: "+ a.getTelepon());
        }
    }
}
