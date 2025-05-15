package Laprak6;

// Kelas generic Produk dengan tipe kategori yang harus mengimplementasikan Comparable
public class Produk<T extends Comparable<T>> implements Comparable<Produk<T>> {
    private int id; // ID unik untuk produk
    private String name; // Nama produk
    private T category; // Kategori produk
    private double price; // Harga produk

    // Konstruktor untuk menginisialisasi produk
    public Produk(int id, String name, T category, double price) {
        this.id = id; // Inisialisasi ID
        this.name = name; // Inisialisasi nama
        this.category = category; // Inisialisasi kategori
        this.price = price; // Inisialisasi harga
    }

    // Getter untuk ID produk
    public int getId() { 
        return id; // Mengembalikan ID produk
    }

    // Getter untuk nama produk
    public String getName() { 
        return name; // Mengembalikan nama produk
    }

    // Getter untuk kategori produk
    public T getCategory() { 
        return category; // Mengembalikan kategori produk
    }

    // Getter untuk harga produk
    public double getPrice() { 
        return price; // Mengembalikan harga produk
    }

    // Implementasi metode compareTo untuk membandingkan produk berdasarkan kategori
    @Override
    public int compareTo(Produk<T> other) {
        return this.category.compareTo(other.category); // Membandingkan kategori produk
    }

    // Override metode toString untuk memberikan representasi string dari produk
    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Category: %s | Price: %.2f",
                              id, name, category.toString(), price); // Format string untuk produk
    }
}
