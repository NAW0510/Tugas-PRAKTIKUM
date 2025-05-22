import java.util.Scanner; // import Scanner untuk input dari user

public class main { // deklarasi kelas utama
    public static void main(String[] args) { // method utama
        Scanner scanner = new Scanner(System.in); // membuat objek Scanner
        // Exception Handler #1 dengan input user
        try { // blok try untuk menangkap exception
            System.out.print("Masukkan ukuran array: "); // meminta input ukuran array
            int size = scanner.nextInt(); // membaca input integer
            double[] Angka2 = new double[size]; // membuat array dengan ukuran input
            System.out.println("Array berhasil dibuat dengan panjang: " + Angka2.length); // menampilkan panjang array
        } catch (NegativeArraySizeException e) { // menangkap exception jika ukuran array negatif
            System.out.println("Array ga boleh negatif ya beb"); // pesan jika array negatif
        } finally { // blok finally selalu dijalankan
            System.out.println("ini Finally"); // pesan finally
        }
        scanner.nextLine(); // consume newline agar input berikutnya benar
        // Exception Handler #2 dengan input user
        try { // blok try untuk exception kedua
            System.out.print("Ketik sesuatu (ketik 'hack' untuk trigger SecurityException): "); // meminta input string
            String input = scanner.nextLine(); // membaca input string
            if (input.equalsIgnoreCase("hack")) { // jika input 'hack'
                scanner.close(); // menutup scanner
                throw new SecurityException("HACKER IS COMING!!!"); // melempar exception SecurityException
            } else { // jika input bukan 'hack'
                System.out.println("Input aman: " + input); // menampilkan input aman
            }
        } catch (SecurityException se) { // menangkap SecurityException
            System.out.println("HACKER TERTANGKAP!!!, HACKER sudah diserahkan pada damkar (karena polisi ga mau nangkap)"); // pesan jika exception tertangkap
        } finally { // blok finally kedua
            System.out.println("SISTEM AMAN (maybe...)"); // pesan finally kedua
        }
        System.out.println("jaga jaga, kalau ini jalan berarti udah 2x berhasil ya"); // pesan akhir
    }
}