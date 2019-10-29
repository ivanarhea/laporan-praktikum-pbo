# Laporan Praktikum #9 - Abstract Class dan Interface

## Kompetensi

Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu: 

 1. Menjelaskan maksud dan tujuan penggunaan Abstract Class; 

 2. Menjelaskan maksud dan tujuan penggunaan Interface; 
 
 3. Menerapkan Abstract Class dan Interface di dalam pembuatan program. 


## Ringkasan Materi

- Abstract Class Abstract Class adalah class yang tidak dapat diinstansiasi namun dapat di-extend. 
  Abstract class baru dapat dimanfaatkan ketika ia di-extend. 

- Kegunaan Abstract : Menggambarkan sesuatu yang bersifat umum, yang hanya bisa berfungsi setelah ia dideskripsikan ke dalam bentuk yang lebih spesifik. 

- Interface Interface adalah struktur data yang hanya berisi abstract methods. Tidak ada apa-apa selain method abstract pada interface, 
  termasuk atribut getter dan setter. 

- Kegunaan Interface : Bertindak seperti semacam kontrak/syarat yang HARUS dipenuhi bagi suatu class agar class tersebut dapat dianggap sebagai ‘sesuatu yang lain’. 


## Percobaan

### Percobaan 1

- Class Hewan1841720189Rhea.java

    ![ss](img/Hewan1841720189Rhea.JPG)

    Link kode program : 

    [Hewan1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/Hewan1841720189Rhea.java)

- Class Kucing1841720189Rhea.java

    ![ss](img/Kucing1841720189Rhea.JPG)

    Link kode program : 

    [Kucing1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/Kucing1841720189Rhea.java)

- Class Ikan1841720189Rhea

    ![ss](img/Ikan1841720189Rhea.JPG)

    Link kode program : 

    [Ikan1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/Ikan1841720189Rhea.java)

- Class Orang1841720189Rhea

    ![ss](img/Hewan1841720189Rhea.JPG)

    Link kode program : 

    [Orang1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/Orang1841720189Rhea.java)

- Class Program 

    ![ss](img/ProgramMain1841720189Rhea.JPG)

    Link kode program : 

    [ProgramMain1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/Program1841720189Rhea.java)


## Pertanyaan 1

- Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak 
  mengimplementasikan method abstract yang ada di class induknya? Buktikan

  Jawab : Tidak boleh, karena kelas turunan HARUS mengoverride method yang ada dari kelas induk dan bila tidak maka akan muncul eror, misalnya di kelas ‘Kucing’ dihapus method bergerak(), makan akan muncul eror

### Percobaan 2

- Class Icumlaude1841720189Rhea.java

    ![ss](img/Icumlaude1841720189Rhea.JPG)

    [Icumlaude1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/Icumlaude1841720189Rhea.java)

- Class Mahasiswa1841720189Rhea.java

    ![ss](img/Mahasiswa1841720189Rhea.JPG)

    [Mahasiswa1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/Mahasiswa1841720189Rhea.java)

- Class Sarjana1841720189Rhea.java
    ![ss](img/Sarjana1841720189Rhea.JPG)

    [Sarjana1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/Sarjana1841720189Rhea.java)

- Class PascaSarjana1841720189Rhea.java
    ![ss](img/PascaSarjana1841720189Rhea.JPG)

    [PascaSarjana1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/PascaSarjana1841720189Rhea.java)

- ClassRektor1841720189Rhea
    ![ss](img/Rektor1841720189Rhea.JPG)
    
    [Rektor1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/Rektor1841720189Rhea.java)

- Class Program
    ![ss](img/ProgramMain1841720189Rhea2.JPG)
    
    [Program.java](../../src/9_Abstract_Class_dan_Interface/ProgramMain1841720189Rhea2.java)

## Pertanyaan 2

a. Mengapa pada langkah nomor 9 terjadi error? Jelaskan! 
   Jawab : Karena pada class Mahasiswa1841720189Rhea tidak ter implementasi interfaces dari Icumlaude1841720189Rhea sehingga eror ketika akan dipanggil oleh ‘pakRektor’ 

   b. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian?
   Jawab : Bisa, karena sarjanaCumlaude dari class Sarjana1841720046 adalah kelas turunan dari ‘Mahasiswa181720046Rhea’, sehingga method ‘KulihadiKampus’ bisa               dipanggil ke class Sarjana1841720189Rhea

c. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?
   Jawab : Tidak bisa, karena class rektor hanya menggunakan implementasi dari Icumlaude, dan ‘kuliahDiKampus’ dari Mahasiswa tidak pernah di inisiasi di kelas rektor 

d. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut ini: 


### Percobaan 3
- Class P3_Icumlaude1841720189Rhea.java

    ![ss](img/P3_ICumlaude1841720189Rhea.JPG)

    [ICumlaude1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/ICumlaude1841720189Rhea.java)

- Class P3_IBerprestasi1841720189Rhea.java

    ![ss](img/P3_IBerprestasi1841720189Rhea.JPG)

    [IBerprestasi1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/P3_IBerprestasi1841720189Rhea.java)

- Class P3_Mahasiswa1841720189Rhea.java

    ![ss](img/P3_Mahasiswa1841720189Rhea.JPG)

    [P3_Mahasiswa1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/P3_Mahasiswa1841720189Rhea.java)

- Class P3_Sarjana1841720189Rhea.java
    ![ss](img/P3_Sarjana1841720189Rhea.JPG)

    [Sarjana1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/P3_Sarjana1841720189Rhea.java)

- Class P3_PascaSarjana1841720189Rhea.java
    ![ss](img/P3_PascaSarjana1841720189Rhea.JPG)

    [PascaSarjana1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/P3_PascaSarjana1841720189Rhea.java)

- Class P3_Rektor1841720189Rhea
    ![ss](img/P3_Rektor1841720189Rhea.JPG)
    
    [Rektor1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/P3_Rektor1841720189Rhea.java)

- Class P3_MahasiswaMain1841720189Rhea
    ![ss](img/P3_MahasiswaMain1841720189Rhea.JPG)
    
    [P3_MahasiswaMain1841720189Rhea.java](../../src/9_Abstract_Class_dan_Interface/P3_MahasiswaMain1841720189Rhea.java)


## Pertanyaan 3

Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, 
maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat 
memberikan sertifikat mawapres pada objek sarjanaCumlaude. 

## Kesimpulan

a. Kita Dapat Memahami maksud dan tujuan penggunaan Abstract Class

b. Kita Dapat Memahami maksud dan tujuan penggunaan Interface, 

c. Kita Dapat Menerapkan Abstract Class dan Interface di dalam pembuatan program

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain. Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.


Ttd,

*(Ivanarhea Endagavrila Clareta)*