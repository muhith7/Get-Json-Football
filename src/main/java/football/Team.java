package football; // Mendefinisikan paket (package) "football" untuk kelas Team

class Team {
    private String name; // Mendeklarasikan atribut private "name" bertipe String
    private String code; // Mendeklarasikan atribut private "code" bertipe String
    private String country; // Mendeklarasikan atribut private "country" bertipe String

    public Team(String name, String code, String country) { // Konstruktor kelas Team dengan parameter "name", "code", dan "country" bertipe String
        this.name = name; // Menginisialisasi atribut "name" dengan nilai yang diterima dari parameter
        this.code = code; // Menginisialisasi atribut "code" dengan nilai yang diterima dari parameter
        this.country = country; // Menginisialisasi atribut "country" dengan nilai yang diterima dari parameter
    }

    public String getName() { // Metode public getName() tanpa parameter yang mengembalikan nilai String
        return name; // Mengembalikan nilai atribut "name"
    }

    public String getCode() { // Metode public getCode() tanpa parameter yang mengembalikan nilai String
        return code; // Mengembalikan nilai atribut "code"
    }

    public String getCountry() { // Metode public getCountry() tanpa parameter yang mengembalikan nilai String
        return country; // Mengembalikan nilai atribut "country"
    }
}
