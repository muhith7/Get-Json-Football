# Pencarian Tim Sepak Bola

Program ini memungkinkan Anda untuk mencari tim sepak bola berdasarkan nama mereka. Program ini membaca data tim dari sebuah file JSON dan menyediakan fitur pencarian.

## Cara Penggunaan

1. Pastikan Anda memiliki Java terinstal di sistem Anda.
2. Clone repository atau unduh kode sumber program.
3. Buka proyek pada IDE Java pilihan Anda.
4. Tambahkan dependensi `json-simple` ke proyek Anda. Jika Anda menggunakan Maven, tambahkan dependensi berikut pada file `pom.xml`:

   ```xml
   <dependency>
       <groupId>com.googlecode.json-simple</groupId>
       <artifactId>json-simple</artifactId>
       <version>1.1.1</version>
   </dependency>

5. Tempatkan file data JSON Anda dalam direktori src/main/resources.
6. Buka file Main.java dan ubah variabel jsonFile dengan jalur file data JSON Anda.
7. Compile dan jalankan file Main.java untuk menjalankan program.
   
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

`updated`
Dalam kode di atas, terdapat satu method yaitu `countTotalSpacesInName()`. Berikut adalah penjelasan mengenai method tersebut:

**Method: countTotalSpacesInName()**
- Deskripsi: Method ini digunakan untuk menghitung jumlah total spasi pada notasi 'name' dalam file JSON.
- Tipe: Method instance (non-static).
- Kembalian (return): Tipe data `int`. Jumlah total spasi pada notasi 'name'.
- Parameter: Tidak ada.

**Langkah-langkah dalam method countTotalSpacesInName()**
1. Menginisialisasi variabel `totalSpaces` dengan nilai awal 0 yang akan digunakan untuk menyimpan jumlah total spasi.
2. Membaca file JSON menggunakan `BufferedReader` dan `FileReader`.
3. Memparsing isi file JSON menggunakan `JSONParser` dan menyimpan hasilnya dalam objek `JSONObject`.
4. Mengakses array "clubs" dalam objek `JSONObject` yang berisi data tim.
5. Melakukan perulangan untuk setiap objek tim dalam array "clubs".
6. Mengakses notasi 'name' dalam objek tim dan menghitung jumlah spasi menggunakan method `countSpaces()`.
7. Menambahkan jumlah spasi pada `totalSpaces`.
8. Menutup `BufferedReader`.
9. Mengembalikan nilai `totalSpaces` sebagai hasil perhitungan.

**Method: countSpaces(String text)**
- Deskripsi: Method ini digunakan untuk menghitung jumlah spasi dalam sebuah teks.
- Tipe: Method private (hanya dapat diakses oleh kelas `TeamData`).
- Kembalian (return): Tipe data `int`. Jumlah spasi dalam teks.
- Parameter: `text` (tipe data `String`). Teks yang akan dihitung jumlah spasi.

**Langkah-langkah dalam method countSpaces(String text)**
1. Menginisialisasi variabel `count` dengan nilai awal 0 yang akan digunakan untuk menyimpan jumlah spasi.
2. Melakukan perulangan untuk setiap karakter dalam teks.
3. Jika karakter tersebut merupakan spasi, maka increment nilai `count`.
4. Mengembalikan nilai `count` sebagai hasil perhitungan.

Dengan menggunakan method `countTotalSpacesInName()`, kita dapat menghitung jumlah total spasi pada notasi 'name' dalam file JSON.


Cc : Abdul Muhith
