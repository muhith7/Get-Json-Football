package football; // Mendefinisikan paket (package) "football" untuk kelas TeamList

import football.Team; // Mengimpor kelas Team dari paket football
import org.json.simple.JSONArray; // Mengimpor kelas JSONArray dari paket org.json.simple
import org.json.simple.JSONObject; // Mengimpor kelas JSONObject dari paket org.json.simple
import org.json.simple.parser.JSONParser; // Mengimpor kelas JSONParser dari paket org.json.simple.parser
import org.json.simple.parser.ParseException; // Mengimpor kelas ParseException dari paket org.json.simple.parser
import java.io.BufferedReader; // Mengimpor kelas BufferedReader dari paket java.io
import java.io.FileReader; // Mengimpor kelas FileReader dari paket java.io
import java.io.IOException; // Mengimpor kelas IOException dari paket java.io
import java.util.ArrayList; // Mengimpor kelas ArrayList dari paket java.util
import java.util.List; // Mengimpor kelas List dari paket java.util

class TeamList {
    private Team[] teams; // Mendeklarasikan atribut private "teams" bertipe Team[] (array of Team)

    public TeamList(String jsonFile) { // Konstruktor kelas TeamList dengan parameter "jsonFile" bertipe String
        teams = loadTeams(jsonFile); // Memanggil metode loadTeams() untuk memuat data tim dari file JSON
    }

    private Team[] loadTeams(String jsonFile) { // Metode private loadTeams() dengan parameter "jsonFile" bertipe String dan mengembalikan nilai Team[]
        JSONParser parser = new JSONParser(); // Membuat objek JSONParser untuk mem-parsing data JSON
        BufferedReader reader = null; // Deklarasi objek BufferedReader untuk membaca file
        try {
            reader = new BufferedReader(new FileReader(jsonFile)); // Membuka file JSON untuk dibaca menggunakan BufferedReader
            JSONObject data = (JSONObject) parser.parse(reader); // Mem-parsing isi file JSON menjadi objek JSONObject
            JSONArray teamsData = (JSONArray) data.get("clubs"); // Mendapatkan array JSON dengan kunci "clubs"
            List<Team> teamList = new ArrayList<Team>(); // Membuat objek List untuk menyimpan data tim
            for (Object teamObj : teamsData) { // Melakukan iterasi untuk setiap objek dalam array JSON
                JSONObject teamData = (JSONObject) teamObj; // Mengubah objek JSON menjadi objek JSONObject
                String name = (String) teamData.get("name"); // Mendapatkan nilai atribut "name" dari objek tim
                String code = (String) teamData.get("code"); // Mendapatkan nilai atribut "code" dari objek tim
                String country = (String) teamData.get("country"); // Mendapatkan nilai atribut "country" dari objek tim
                Team team = new Team(name, code, country); // Membuat objek Team dengan menggunakan data yang ditemukan
                teamList.add(team); // Menambahkan objek Team ke dalam List teamList
            }
            return teamList.toArray(new Team[teamList.size()]); // Mengembalikan data tim dalam bentuk array Team[]
        } catch (IOException e) { // Menangani exception jika terjadi kesalahan saat membaca file
            e.printStackTrace(); // Mencetak stack trace dari exception
        } catch (ParseException e) { // Menangani exception jika terjadi kesalahan saat mem-parsing JSON
            e.printStackTrace(); // Mencetak stack trace dari exception
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Menutup BufferedReader setelah selesai digunakan
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null; // Mengembalikan nilai null jika terjadi kesalahan dalam memuat data tim
    }

    public void displayData() { // Metode public displayData() tanpa parameter dan tidak mengembalikan nilai
        for (Team team : teams) { // Melakukan iterasi untuk setiap objek Team dalam array teams
            System.out.println("Nama: " + team.getName()); // Menampilkan nama tim
            System.out.println("Kode: " + team.getCode()); // Menampilkan kode tim
            System.out.println("Negara: " + team.getCountry()); // Menampilkan negara tim
            System.out.println(); // Mencetak baris kosong sebagai pemisah antara setiap tim
        }
    }

    public Team[] searchByName(String name) { // Metode public searchByName() dengan parameter "name" bertipe String dan mengembalikan nilai Team[]
        List<Team> result = new ArrayList<Team>(); // Membuat objek List untuk menyimpan hasil pencarian
        for (Team team : teams) { // Melakukan iterasi untuk setiap objek Team dalam array teams
            if (team.getName().equalsIgnoreCase(name)) { // Memeriksa apakah nama tim cocok dengan nama yang dicari (dengan mengabaikan perbedaan besar kecil huruf)
                result.add(team); // Menambahkan objek Team yang cocok ke dalam List result
            }
        }
        return result.toArray(new Team[result.size()]); // Mengembalikan hasil pencarian dalam bentuk array Team[]
    }
}
