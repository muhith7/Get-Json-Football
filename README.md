# Pencarian Tim Sepak Bola

Program ini memungkinkan Anda untuk mencari tim sepak bola berdasarkan nama mereka. Program ini membaca data tim dari sebuah file JSON dan menyediakan fitur pencarian.

## Cara Penggunaan

1. Pastikan Anda memiliki Java terinstal di sistem Anda.
2. Clone repository atau unduh kode sumber program.
3. Buka proyek pada IDE Java pilihan Anda.
4. Tempatkan file data JSON Anda dalam direktori `src/main/resources`.
5. Buka file `Main.java` dan ubah variabel `jsonFile` dengan jalur file data JSON Anda.
6. Compile dan jalankan file `Main.java` untuk menjalankan program.

## Struktur Kode

### `Main.java`

File `Main.java` merupakan program utama yang menginisialisasi objek `TeamList` dan berinteraksi dengan pengguna. Berikut adalah langkah-langkah yang dilakukan oleh program:

1. Membaca file JSON yang berisi data tim sepak bola.
2. Menampilkan semua data tim yang ada.
3. Menerima input pengguna untuk pencarian berdasarkan nama tim.
4. Melakukan pencarian dan menampilkan hasilnya.

### `TeamList.java`

File `TeamList.java` berisi definisi kelas `TeamList` yang bertanggung jawab untuk memuat data tim dari file JSON dan menyediakan metode pencarian. Berikut adalah fungsi utama dari kelas ini:

1. Menginisialisasi array `teams` yang akan menyimpan objek `Team`.
2. Memuat data tim dari file JSON ke dalam array `teams`.
3. Menampilkan semua data tim yang ada.
4. Melakukan pencarian berdasarkan nama tim.

### `Team.java`

File `Team.java` berisi definisi kelas `Team` yang merepresentasikan sebuah tim sepak bola. Kelas ini memiliki atribut `name`, `code`, dan `country` yang menyimpan informasi tentang tim. Berikut adalah fungsi utama dari kelas ini:

1. Membuat objek `Team` dengan parameter nama, kode, dan negara.
2. Memberikan akses ke atribut nama, kode, dan negara tim melalui metode getter.

## Ketergantungan

Program ini menggunakan library eksternal berikut:

- [JSON.simple](https://code.google.com): Library ini digunakan untuk memparsing data JSON.

Pastikan untuk menambahkan library JSON.simple ke proyek Anda sebelum menjalankan program.

Jika Anda memiliki pertanyaan lebih lanjut, jangan ragu untuk mengajukannya!
