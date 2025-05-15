package Laprak6;
import java.util.Scanner;

// Kelas utama untuk menjalankan aplikasi Marketplace
public class Marketplace {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager(); // Inisialisasi pengelola produk
        Scanner scanner = new Scanner(System.in); // Scanner untuk input pengguna

        while (true) { // Loop utama untuk menu
            System.out.println("\n=== Marketplace Menu ===");
            System.out.println("1. Add Product"); // Tambah produk
            System.out.println("2. Remove Product by ID"); // Hapus produk berdasarkan ID
            System.out.println("3. Search Product"); // Cari produk
            System.out.println("4. Display All Products (Sorted by Category)"); // Tampilkan semua produk
            System.out.println("5. Display Unique Categories"); // Tampilkan kategori unik
            System.out.println("6. Process Product"); // Proses produk
            System.out.println("7. Show Processed Queue"); // Tampilkan antrian produk yang diproses
            System.out.println("0. Exit"); // Keluar dari aplikasi
            System.out.print("Select menu: ");
            int choice = scanner.nextInt(); // Input pilihan menu
            scanner.nextLine(); // Membersihkan buffer input

            switch (choice) {
                case 1 -> { // Tambah produk baru
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt(); // Input ID produk
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine(); // Input nama produk
                    System.out.print("Enter Category: ");
                    String category = scanner.nextLine(); // Input kategori produk
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble(); // Input harga produk
                    scanner.nextLine();

                    Produk<String> newProduct = new Produk<>(id, name, category, price); // Buat produk baru
                    manager.addProduct(newProduct); // Tambahkan produk ke daftar
                }
                case 2 -> { // Hapus produk berdasarkan ID
                    System.out.print("Enter ID to remove: ");
                    int id = scanner.nextInt(); // Input ID produk yang akan dihapus
                    scanner.nextLine();
                    manager.removeProductById(id); // Hapus produk
                }
                case 3 -> { // Cari produk berdasarkan nama dan kategori
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine(); // Input nama produk
                    System.out.print("Enter Category: ");
                    String category = scanner.nextLine(); // Input kategori produk
                    manager.searchProduct(name, category); // Cari produk
                }
                case 4 -> manager.displayAllProductsSortedByCategory(); // Tampilkan semua produk yang diurutkan
                case 5 -> manager.displayUniqueCategories(); // Tampilkan kategori unik
                case 6 -> { // Proses produk berdasarkan ID
                    System.out.print("Enter ID of product to process: ");
                    int id = scanner.nextInt(); // Input ID produk yang akan diproses
                    scanner.nextLine();
                    for (Produk<?> p : manager.getProducts()) { // Iterasi melalui daftar produk
                        if (p.getId() == id) { // Jika ID cocok
                            manager.processProduct(p); // Proses produk
                            break;
                        }
                    }
                }
                case 7 -> manager.showProcessedQueue(); // Tampilkan antrian produk yang telah diproses
                case 0 -> { // Keluar dari aplikasi
                    System.out.println("Exiting Marketplace...");
                    return; // Keluar dari loop
                }
                default -> System.out.println("Invalid option."); // Pesan jika pilihan tidak valid
            }
        }
    }
}
