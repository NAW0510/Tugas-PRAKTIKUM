package geometry.bases; 
// Mendeklarasikan package tempat kelas Shape berada.

public abstract class Shape { 
    // Shape adalah kelas abstrak yang menjadi dasar untuk semua bentuk geometris.

    private String name; 
    // Variabel instance untuk menyimpan nama bentuk.

    public Shape() {
        super(); 
        // Konstruktor default, memanggil konstruktor kelas induk (Object).
    }

    public void setName(String inputName) {
        name = inputName; 
        // Metode untuk mengatur nama bentuk.
    }

    public String getName() {
        return name; 
        // Metode untuk mendapatkan nama bentuk.
    }

    public abstract void printInfo(); 
    // Metode abstrak untuk mencetak informasi bentuk, harus diimplementasikan oleh kelas turunan.
}
