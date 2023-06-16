package football;

import org.json.simple.JSONArray; // Mengimpor kelas JSONArray dari pustaka JSON.simple
import org.json.simple.JSONObject; // Mengimpor kelas JSONObject dari pustaka JSON.simple
import org.json.simple.parser.JSONParser; // Mengimpor kelas JSONParser dari pustaka JSON.simple untuk memparsing file JSON
import org.json.simple.parser.ParseException; // Mengimpor kelas ParseException dari pustaka JSON.simple untuk menangani kesalahan parsing
import java.io.BufferedReader; // Mengimpor kelas BufferedReader dari pustaka java.io untuk membaca file
import java.io.FileReader; // Mengimpor kelas FileReader dari pustaka java.io untuk membaca file teks
import java.io.IOException; // Mengimpor kelas IOException dari pustaka java.io untuk menangani kesalahan I/O

public class TeamData {
    private String jsonFile; // Atribut untuk menyimpan jalur file JSON

    public TeamData(String jsonFile) {
        this.jsonFile = jsonFile; // Menginisialisasi atribut jsonFile dengan nilai dari parameter konstruktor
    }

    // Method untuk menghitung jumlah total spasi dalam notasi 'name'
    public int countTotalSpacesInName() {
        int totalSpaces = 0;

        try {
            // Membuat objek JSONParser untuk memparsing file JSON
            JSONParser parser = new JSONParser();
            // Membuat objek BufferedReader untuk membaca file JSON
            BufferedReader reader = new BufferedReader(new FileReader(jsonFile));

            // Memparsing file JSON menjadi objek JSONObject
            JSONObject data = (JSONObject) parser.parse(reader);
            // Mengambil array JSON dengan key 'clubs'
            JSONArray teamsData = (JSONArray) data.get("clubs");

            // Iterasi melalui setiap objek tim dalam array 'clubs'
            for (Object teamObj : teamsData) {
                // Mengubah objek tim menjadi objek JSONObject
                JSONObject teamData = (JSONObject) teamObj;
                // Mengambil nilai dari kunci 'name' sebagai string
                String name = (String) teamData.get("name");
                // Menghitung jumlah spasi dalam string 'name' dan menambahkannya ke totalSpaces
                totalSpaces += countSpaces(name);
            }

            // Menutup objek BufferedReader setelah selesai digunakan
            reader.close();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        // Mengembalikan jumlah total spasi dalam notasi 'name'
        return totalSpaces;
    }

    // Method untuk menghitung jumlah spasi dalam sebuah string
    private int countSpaces(String text) {
        int count = 0;
        // Iterasi melalui setiap karakter dalam string
        for (char c : text.toCharArray()) {
            // Memeriksa apakah karakter adalah spasi
            if (c == ' ') {
                // Jika iya, maka menambahkan 1 ke count
                count++;
            }
        }
        // Mengembalikan jumlah total spasi dalam string
        return count;
    }
}
