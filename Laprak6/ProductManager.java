package Laprak6;

import java.util.*;

// Kelas untuk mengelola produk di marketplace
public class ProductManager {
    private List<Produk<?>> produk1; // Daftar produk
    private Set<String> categories; // Set untuk menyimpan kategori unik
    private Queue<Produk<?>> processedQueue; // Antrian produk yang telah diproses

    // Konstruktor untuk inisialisasi atribut
    public ProductManager() {
        produk1 = new ArrayList<>(); // Inisialisasi daftar produk
        categories = new HashSet<>(); // Inisialisasi set kategori
        processedQueue = new LinkedList<>(); // Inisialisasi antrian produk
    }

    // Menambahkan produk baru ke daftar
    public void addProduct(Produk<?> product) {
        produk1.add(product); // Tambahkan produk ke daftar
        categories.add(product.getCategory().toString()); // Tambahkan kategori ke set
        System.out.println("Product added: " + product); // Tampilkan pesan sukses
    }

    // Menghapus produk berdasarkan ID
    public void removeProductById(int id) {
        boolean removed = produk1.removeIf(p -> p.getId() == id); // Hapus produk dengan ID yang cocok
        if (removed) {
            System.out.println("Product with ID " + id + " removed."); // Pesan jika berhasil dihapus
        } else {
            System.out.println("No product found with ID " + id); // Pesan jika tidak ditemukan
        }
    }

    // Mencari produk berdasarkan nama dan kategori
    public void searchProduct(String name, String category) {
        System.out.println("Search Results:"); // Header hasil pencarian
        for (Produk<?> p : produk1) { // Iterasi melalui daftar produk
            if (p.getName().equalsIgnoreCase(name) && 
                p.getCategory().toString().equalsIgnoreCase(category)) {
                System.out.println(p); // Tampilkan produk yang cocok
            }
        }
    }

    // Menampilkan semua produk yang diurutkan berdasarkan kategori
    public void displayAllProductsSortedByCategory() {
        List<Produk<?>> sorted = new ArrayList<>(produk1); // Salin daftar produk
        sorted.sort((p1, p2) -> p1.getCategory().toString().compareTo(p2.getCategory().toString())); // Urutkan berdasarkan kategori
        System.out.println("All Products (Sorted by Category):"); // Header
        for (Produk<?> p : sorted) { // Iterasi melalui daftar yang diurutkan
            System.out.println(p); // Tampilkan produk
        }
    }

    // Menampilkan semua kategori unik
    public void displayUniqueCategories() {
        System.out.println("Unique Categories:"); // Header
        for (String cat : categories) { // Iterasi melalui set kategori
            System.out.println("- " + cat); // Tampilkan kategori
        }
    }

    // Memproses produk dan menambahkannya ke antrian
    public void processProduct(Produk<?> product) {
        processedQueue.add(product); // Tambahkan produk ke antrian
        System.out.println("Product added to processed queue: " + product); // Pesan sukses
    }

    // Menampilkan antrian produk yang telah diproses
    public void showProcessedQueue() {
        System.out.println("Processed Products Queue:"); // Header
        for (Produk<?> p : processedQueue) { // Iterasi melalui antrian
            System.out.println(p); // Tampilkan produk
        }
    }

    // Mengembalikan daftar produk
    public List<Produk<?>> getProducts() {
        return produk1; // Kembalikan daftar produk
    }
}
