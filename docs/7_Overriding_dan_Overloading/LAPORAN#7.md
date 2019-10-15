# Laporan Praktikum #7 - OVERLOADING DAN OVERRIDING

## Kompetensi
Setelah menempuh pokok bahasan ini, mahasiswa mampu : 

a. Memahami konsep overloading dan overriding, 
b. Memahami perbedaan overloading dan overriding, 
c. Ketepatan dalam mengidentifikasi method overriding dan overloading 
d. Ketepatan dalam mempraktekkan instruksi pada jobsheet 
e. Mengimplementasikan method overloading dan overriding


## Ringkasan Materi

- Overloading adalah menuliskan kembali method dengan nama yang sama pada suatu class. Tujuannya dapat 
  memudahkan penggunaan/pemanggilan method dengan fungsionalitas yang mirip

- Perbedaan daftar parameter bukan hanya terjadi pada perbedaan banyaknya parameter, tetapi juga urutan darai parameter tersebut

- Overriding adalah Sublass yang berusaha memodifkasi tingkah laku yang diwarisi dari superclass. 
  Tujuannya subclass dapat memiliki tingkah laku yang lebih spesifik sehingga dapat dilakukan 
  dengan cara mendeklarasikan kembali method milik parent class di subclass. 

- Overriding method tidak boleh throw checked exceptions yang tidak dideklarasikan oleh overridden method. 

## Percobaan

### Percobaan 1

- Class classKaryawan1841720189Rhea.java

![ss](img/Karyawan1841720189Rhea.jpg)

Link kode program : [Karyawan1841720189Rhea.java](../../src/7_Overriding_dan_Overloading/Karyawan1841720189Rhea.java)

- Class classStaff1841720189Rhea.java

![ss](img/Staff1841720189Rhea.jpg)

Link kode program : [Staff1841720189Rhea.java](../../src/7_Overriding_dan_Overloading/Staff1841720189Rhea.java)

- Class Manager1841720189Rhea.java

![ss](img/Manager1841720189Rhea.jpg)

Link kode program : [Manager1841720189Rhea.java](../../src/7_Overriding_dan_Overloading/Manager1841720189Rhea.java)

- Class Utama1841720189Rhea.java

![ss](img/Utama1841720189Rhea.jpg)

Link kode program : [Utama1841720189Rhea.java](../../src/7_Overriding_dan_Overloading/Utama1841720189Rhea.java)


## Latihan

- Class Perkalianku1841720189Rhea.java

Link kode program : [Perkalianku1841720189Rhea.java](../../src/7_Overriding_dan_Overloading/Perkalianku1841720189Rhea.java)

![ss](img/Perkalianku1841720189Rhea.jpg)

Pertanyaan 
 
  - 1. Dari source coding diatas terletak dimanakah overloading?
       Jawab: 
       ![ss](img/Perkalianku1841720189Rhea.jpg)

  - 2. Jika terdapat overloading ada berapa jumlah parameter yang berbeda? 
       Jawab:
       Parameter yang berbeda berjumlah 1 terletak pada method perkalian yang pertama berparameter (int a, int b). 
       Sedangkan method perkalian yang kedua berparameter (int a, int b, int c) 


- Class Perkalianku21841720189Rhea.java

  Link kode program : [Perkalianku21841720189Rhea.java](../../src/7_Overriding_dan_Overloading/Perkalianku21841720189Rhea.java)

  [ss](img/Perkalianku21841720189Rhea.jpg)

  Pertanyaan 
 
   - 1. Dari source coding diatas terletak dimanakah overloading? 
       Jawab: 
       ![ss](img/Perkalianku21841720189Rhea.jpg)

   - 2. Jika terdapat overloading ada berapa tipe parameter yang berbeda? 
       Jawab:
       terdapat 1 tipe parameter berbeda, yang method overloading pertama menggunakan tipe parameter integer, sedangkan pada method overloading kedua menggunakan tipe parameter double, meskipun sama-sama berjumlah 2 parameter

- Class Fish21841720189Rhea.java

  Link kode program : [Fish1841720189Rhea.java](../../src/7_Overriding_dan_Overloading/Fish1841720189Rhea.java)

  ![ss](img/Fish1841720189Rhea.jpg)

   Pertanyaan 
 
   - 1.  Dari source coding diatas terletak dimanakah overriding?
       Jawab: 
       ![ss](img/Fish1841720189Rhea.jpg)

   - 2. Jabarkanlah apabila sourcoding diatas jika terdapat overriding?
       Jawab:
       Terdapat overriding, yaitu pada method swim() di class Piranha. Disebut method overriding karena nama method tersebut sama dengan
       nama method di superclass nya, akan tetapi berbeda di isi methodnya (dimodifikasi)  

## Tugas

1. Overloading
   
   - Class segitiga1841720189Rhea.java

     Link kode program : [Segitiga1841720189Rhea.java](../../src/7_Overriding_dan_Overloading/tugassegitiga1841720189Rhea.java)
   
    - ClassMainSegitiga1841720189Rhea.java

     Link kode program : [MainSegitiga1841720189Rhea.java](../../src/7_Overriding_dan_Overloading/tugasMainSegitiga1841720189Rhea.java)
      
     ![ss](img/Segitiga1841720189Rhea.jpg)


2. Overriding
   
   - Class Manusia1841720189Rhea.java

     Link kode program : [Manusia1841720189Rhea.java](../../src/7_Overriding_dan_Overloading/Manusia1841720189Rhea.java)
 

   - Class Mahasiswa1841720189Rhea.java

     Link kode program : [Mahasiswa1841720189Rhea.java](../../src/7_Overriding_dan_Overloading/Mahasiswa1841720189Rh.java)


   - Class Dosen1841720189Rhea.java

     Link kode program : [Dosen1841720189Rhea.java](../../src/7_Overriding_dan_Overloading/Dosen1841720189Rhea.java)
      
  
   - Class MainOverriding1841720189Rhea.java

     Link kode program : [MainManusia1841720189Rhea.java](../../src/7_Overriding_dan_Overloading/MainOverriding1841720189Rhea.java)
     
    ![ss](img/MainOverriding1841720189Rhea.jpg)
  


## Kesimpulan

a. Kita Dapat Memahami konsep overloading dan overriding, 
b. Kita Dapat Memahami perbedaan overloading dan overriding, 
c. Kita Dapat mengidentifikasi method overriding dan overloading 
d. Kita Dapat Mempraktekkan instruksi pada jobsheet 
e. Kita Dapat Mengimplementasikan method overloading dan overriding



## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Ivanarhea Endagavrila Clareta)***