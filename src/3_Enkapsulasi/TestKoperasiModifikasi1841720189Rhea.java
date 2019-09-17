/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jb3enkapsulasi;
import java.util.Scanner;
/**
 *
 * @author Rhea Ivana
 */
public class TestKoperasiModifikasi1841720189Rhea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        System.out.print("Masukkan Nomor KTP : ");
        String noKTP = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        String Nama = sc.nextLine();
        System.out.print("Masukkan Limit Pinjaman : ");
        int limitPinjaman = sc.nextInt();
        System.out.println();
        
        AggotaTugas1841720189Rhea ivnrhea = new AggotaTugas1841720189Rhea("33602850", "ivnrhea", 5000000);
        
        System.out.println("Nama Anggota: " + ivnrhea.getNamaRhea());
        System.out.println("Limit Pinjaman: " + ivnrhea.getLimitPinjamanRhea());
        
        do {
            System.out.println("--------------------------");
            System.out.println("Apa yang anda inginkan?");
            System.out.println("--------------------------");
            System.out.println("1. Pinjam");
            System.out.println("2. Angsur");
            System.out.println("3. Keluar");
            System.out.println("--------------------------");
            System.out.print("Masukan Pilihan");
            pilihan = sc.nextInt();
            System.out.println("--------------------------");
            switch(pilihan) {
                case 1 :
                    System.out.print("Masukkan Nominal Uang : ");
                    int pinjam = sc.nextInt();
                    System.out.println("Meminjam Uang " + pinjam);
                    ivnrhea.pinjamRhea(pinjam);
                    System.out.println("Jumlah pinjaman saat ini : " + ivnrhea.getJumlahPinjamaanRhea());
                    break;
                case 2 : 
                    System.out.print("Masukkan Nominal Uang : ");
                    int angsur = sc.nextInt();
                    System.out.println("Meminjam Uang " + angsur);
                    ivnrhea.pinjamRhea(angsur);
                    System.out.println("Jumlah pinjaman saat ini : " + ivnrhea.getJumlahPinjamaanRhea());
                    break;
            }
        }while(pilihan != 3);
    }
}
    
