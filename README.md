# 🧾 Program Kasir Sederhana

![Java Logo](https://github.com/ARFAMFADHILLAH/programkasirsederhana/blob/main/java.png)

Program ini adalah contoh **aplikasi kasir sederhana berbasis console** yang dibuat menggunakan bahasa **Java**.  
Pengguna dapat memilih menu makanan dan minuman, memasukkan jumlah porsi/gelas, lalu program akan menghitung total harga secara otomatis.

---

## 💡 Fitur
- Menampilkan daftar **menu makanan dan minuman** beserta harganya  
- Menghitung total harga makanan dan minuman berdasarkan pilihan pengguna  
- Menampilkan **rincian pembelian lengkap**  
- Menggunakan **try-with-resources** agar `Scanner` otomatis tertutup setelah digunakan  

---

## 🧰 Teknologi yang Digunakan
- **Java** (Minimal versi 17 direkomendasikan)
- IDE seperti **IntelliJ IDEA**, **VS Code**, atau **NetBeans**  

---

## 📜 Cara Menjalankan Program

1. Pastikan kamu sudah menginstal **Java JDK** di komputer kamu.  
   Cek dengan perintah:
   ```bash
   java -version

2. Clone repositori ini (atau unduh file .java-nya):
  ```text
git clone https://github.com/ARFAMFADHILLAH/programkasirsederhana.git
cd programkasirsederhana


4. Kompilasi program:
   javac programkasirsederhana.java

5. Jalankan program:
   java programkasirsederhana

## 📋 Contoh Tampilan Program

```text
|=========================================|
|          PROGRAM KASIR SEDERHANA        |
|=========================================|
|             PILIH MENU MAKANAN          |
|=========================================|
| 1. Nasi Goreng          Rp 12.000       |
| 2. Ayam Geprek          Rp 10.000       |
| 3. Ikan Bakar           Rp 20.000       |
| 4. Nasi Bakar           Rp 15.000       |
| 5. Cumi Goreng          Rp 8.000        |
|=========================================|
Pilih makanan 1/2/3/4/5 : 1
Berapa Porsi : 2

|=========================================|
|             PILIH MENU MINUMAN          |
|=========================================|
| 1. Es Teh Susu          Rp 5.000        |
| 2. Es Coklat            Rp 10.000       |
| 3. Es Cappucino         Rp 10.000       |
| 4. Es Cincau            Rp 5.000        |
| 5. Jus Apel             Rp 10.000       |
|=========================================|
Pilih minuman 1/2/3/4/5 : 2
Berapa Gelas : 1

|=========================================|
|             DAFTAR PEMBELIAN            |
|=========================================|
| Makanan      : Nasi Goreng
| Jumlah Porsi : 2
| Minuman      : Es Coklat
| Jumlah Gelas : 1
|=========================================|
 Total Harga   : Rp 34.000
|=========================================|
