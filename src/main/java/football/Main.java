package football;

import football.Team;
import football.TeamList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String jsonFile = "src/main/resources/sepakbola.json";
        TeamList teamList = new TeamList(jsonFile); // Membuat objek TeamList dengan menggunakan file JSON

        // Menampilkan semua data tim
        System.out.println("Data Tim:");
        teamList.displayData(); // Memanggil metode displayData() dari objek teamList untuk menampilkan data tim

        // Menerima input pengguna untuk pencarian berdasarkan nama tim
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk menerima input pengguna
        System.out.print("Masukkan nama tim yang ingin dicari: ");
        String namaTimCari = scanner.nextLine(); // Membaca input nama tim dari pengguna

        // Melakukan pencarian dan menampilkan hasilnya
        Team[] hasilPencarian = teamList.searchByName(namaTimCari); // Melakukan pencarian berdasarkan nama tim
        if (hasilPencarian.length > 0) {
            System.out.println("\nHasil Pencarian:");
            for (Team team : hasilPencarian) {
                System.out.println("Nama: " + team.getName()); // Menampilkan nama tim
                System.out.println("Kode: " + team.getCode()); // Menampilkan kode tim
                System.out.println("Negara: " + team.getCountry()); // Menampilkan negara tim
                System.out.println();
            }
        } else {
            System.out.println("\nTidak ditemukan tim dengan nama tersebut.");
        }

        scanner.close(); // Menutup objek Scanner setelah selesai digunakan

        TeamData teamData = new TeamData(jsonFile);

        int totalSpaces = teamData.countTotalSpacesInName();
        System.out.println("Jumlah total spasi pada notasi 'name': " + totalSpaces);
    }

}
