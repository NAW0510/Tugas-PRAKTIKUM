import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Exception Handler #1 dengan input user
        try {
            System.out.print("Masukkan ukuran array: ");
            int size = scanner.nextInt();
            double[] Angka2 = new double[size];
            System.out.println("Array berhasil dibuat dengan panjang: " + Angka2.length);
        } catch (NegativeArraySizeException e) {
            System.out.println("Array ga boleh negatif ya beb");
        } finally {
            System.out.println("ini Finally");
        }
        scanner.nextLine(); // consume newline
        // Exception Handler #2 dengan input user
        try {
            System.out.print("Ketik sesuatu (ketik 'hack' untuk trigger SecurityException): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("hack")) {
                scanner.close();
                throw new SecurityException("HACKER IS COMING!!!");
            } else {
                System.out.println("Input aman: " + input);
            }
        } catch (SecurityException se) {
            System.out.println("HACKER TERTANGKAP!!!, HACKER sudah diserahkan pada damkar (karena polisi ga mau nangkap)");
        } finally {
            System.out.println("SISTEM AMAN (maybe...)");
        }
        System.out.println("jaga jaga, kalau ini jalan berarti udah 2x berhasil ya");
    }
}