package geometry.Mains;

import geometry.Shapes.Circle; // Import the Circle class
import java.util.Scanner;

public class Main {
    // Static String pewarna
    static String pewarna = "\u001B[34m"; // Warna biru di terminal

    // Static method untuk mencetak garis
    public static void printGaris() {
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();

        // Input Nama dan NIM
        printGaris();
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("NIM  : ");
        String nim = scanner.nextLine();
        printGaris();

        // Input ID dan Radius
        System.out.println("Circle");
        printGaris();
        System.out.print("Isikan ID     : ");
        int id = scanner.nextInt();
        System.out.print("Isikan Radius : ");
        double radius = scanner.nextDouble();
        printGaris();

        // Set nilai ke objek Circle
        circle.setId(id);
        circle.setRadius(radius);

        // Menampilkan hasil
        circle.printDeskripsi();

        // Menutup scanner
        scanner.close();
    }
}