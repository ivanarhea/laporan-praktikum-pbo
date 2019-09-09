# Laporan Praktikum #2 - Class dan Object

## Kompetensi

-  Mahasiswa dapat memahami deskripsi dari class dan object
-   Mahasiswa memahami implementasi dari class
-   Mahasiswa dapat memahami implementasi dari attribute
-   Mahasiswa dapat memahami implementasi dari method
-   Mahasiswa dapat memahami implementasi dari proses instansiasi
-   Mahasiswa dapat memahami implementasi dari try-catch
-   Mahasiswa dapat memahami proses pemodelan class diagram menggunakan UML

## Ringkasan Materi

-   Method adalah suatu blok dari program yang berisi kode program nama dan properti yang dapat digunakan kembali. Method dapat mempunyai nilai balik atau tidak. Method yang tidak mempunyai nilai balik dipanggil dalam pernyataan yang akan dikerjakan, sedangkan method yang mempunyai nilai balik dipanggil dari suatu ekpresi. Kata kunci untuk mengembalikan/mengeluarkan suatu nilai adalah return

-   Proses membuat objek dari suatu class adalah INSTANSIASI, dan ditandai kata kunci new. 

-   Untuk menangani error di Java, digunakan sebuah statement yang bernama try - catch. Statement tersebut digunakan untuk mengurung eksekusi yang menampilkan error dan dapat membuat program tetap berjalan tanpa dihentikan secara langsung. Error yang ditangani oleh try – catch biasa disebut dengan exception.

-   Unified Modeling Language ( UML ) adalah tujuan umum, perkembangan, bahasa pemodelan di bidang rekayasa perangkat lunak , yang dimaksudkan untuk menyediakan cara standar untuk memvisualisasikan desain sistem. 

-   Class diagram adalah sebuah class yang menggambarkan struktur dan penjelasan class, paket, dan objek serta hubungan satu sama lain seperti pewarisan, asosiasi, dan lain-lain. Class diagram juga menjelaskan hubungan antar class dalam sebuah sistem yang sedang dibuat dan bagaimana caranya agar mereka saling berkolaborasi untuk mencapai sebuah tujuan.

## Percobaan

### Percobaan 1 : Membuat Class Diagram

Studi Kasus 1:

Dalam suatu perusahaan salah satu data yang diolah adalah data karyawan. Setiap karyawan memiliki id, nama, jenis kelamin, jabatan, jabatan, dan gaji. Setiap mahasiswa juga bisa menampilkan data diri pribadi dan melihat gajinya.

1.Gambarkan desain class diagram dari studi kasus 1!

![ss](img/1.JPG)

2.Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!
-   Class Karyawan dan Class TestKaryawan

3.Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing class dari studi kasus 1!
-   int id, String nama, String jenisKelamin, String jabatan, int gaji

4.Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi kasus 1!
-   void tampilData()

### Percobaan 2 : Membuat dan mengakses anggota suatu class

- Class Mahasiswa1841720189Rhea.java

![ss](img/2.JPG)

Link kode program : [Mahasiswa1841720189Rhea.java](../../src/2_Class_dan_Object/1.java)

- Class main, TestMahasiswa1841720189Rhea.java
![ss](img/3.JPG)

Link kode program : [TestMahasiswa.java](../../src/2_Class_dan_Object/2.java)

7. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!
-  Pada class Mahasiswa18417200189Rhea.java

    ![ss](img/4.JPG)

8. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!
-  Pada class Mahasiswa1841720189Rhea.java

    ![ss](img/5.JPG)

9. Berapa banyak objek yang di instansiasi pada program diatas!
-  Hanya satu yaitu pada class TestMahasiswa1841720189Rhea.java

    ![ss](img/6.JPG)

10. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?
-   Kode NIM pada object mhs 1 diisi dengan angka "101"

11. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()?
-   Untuk memanggil method tampilBiodata(); untuk menampilkan hasil biodata mahasiswa

12. Instansiasi 2 objek lagi pada program diatas!
-   Class main, TestMahasiswa.java
    ![ss](img/7.JPG)

    ![ss](img/8.JPG)

Link kode program : [TestMahasiswa.java](../../src/2_Class_dan_Object/3.java)

### Percobaan 3 : Menulis method yang memiliki argument/parameter dan memiliki return

- Class Barang1841720189Rhea.java

    ![ss](img/9.JPG)

Link kode program : [Barang1841720189Rhea.java](../../src/2_Class_dan_Object/4.java)

- Class main, TestBarang1841720046Reza.java
    ![ss](img/10.JPG)

Link kode program : [TestBarang.java](../../src/2_Class_dan_Object/5.java)

7. Apakah fungsi argumen dalam suatu method?
-  Untuk memberikan nilai pada suatu method 

8. Ambil kesimpulan tentang kegunaan dari kata kunci return, dan kapan suatu method harus memiliki return!
-  Kegunaan return adalah untuk memberikan nilai kembalian contoh tipe data sperti int, float, double sedangkan untuk tipe data void tidak memerlukan return karena tidak memberikan nilai kembalian. 

## Tugas
1. Gambar class diagram dari class Toko1841720189Rhea
    ![ss](img/11.JPG)

2. Class Toko1841720189Rhea.java
    ![ss](img/12.JPG)

Link kode program : [Toko1841720189Rhea.java](../../src/2_Class_dan_Object/6.java)

- Class main, TestToko.java 
    ![ss](img/13.JPG)

Link kode program : [TestToko.java](../../src/2_Class_dan_Object/7.java)

3. Buatlah program sesuai dengan class diagram berikut ini:
    ![ss](img/14.JPG)

    
Link kode program : [Lingkaran1841720189Rhea.java](../../src/2_Class_dan_Object/8.java)

    ![ss](img/15.JPG)

Link kode program : [TestLingkaran.java](../../src/2_Class_dan_Object/9.java)

4.	Buatlah program sesuai dengan class diagram berikut ini: 
 
    Deskripsi / Penjelasan : 
    Nilai atribut hargaDasar dalam Rupiah dan atribut diskon dalam % 
    Method hitungHargaJual() digunakan untuk menghitung harga jual dengan perhitungan berikut ini: harga jual = harga dasar – (diskon x harga dasar)
    
    Jawab : 

    ![ss](img/16.JPG)

    Link kode program : [BarangTugas1841720189Rhea.java](../../src/2_Class_dan_Object/10.java)

    ![ss](img/17.JPG)

    Link kode program : [TestBarangTugas.java](../../src/2_Class_dan_Object/11.java)

## Kesimpulan
- Kita dapat mendemonstrasikan bagaimana membuat class dan object dengan baik dan benar
- Kita dapat mengetahui aturan penulisan yang benar untuk penulisan sebuah atribut dan method

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Ivanarhea Endagavrila Clareta)***
