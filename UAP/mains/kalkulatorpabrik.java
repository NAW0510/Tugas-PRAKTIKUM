package mains; // Mendeklarasikan package mains
import models.*; // Mengimpor semua kelas dari package models
import java.util.Scanner; // Mengimpor kelas Scanner

/**
 * Program utama kalkulator pabrik cetakan donat rumahan.
 * Menampilkan perhitungan untuk donat berlubang (torus) dan donat tanpa lubang (bola).
 */
public class kalkulatorpabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner

        System.out.println("============================================="); // Cetak garis
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan"); // Cetak judul
        System.out.println("I Gusti Ngurah Anantawijaya Mahardika"); // Cetak nama
        System.out.println("245150700111027"); // Cetak NIM
        System.out.println("============================================="); // Cetak garis

        // Input dan perhitungan untuk donat dengan lubang (torus)
        System.out.println("Donat dengan lubang"); // Cetak judul
        System.out.println("============================================="); // Cetak garis
        System.out.print("Isikan Radius : "); // Input major radius
        double R = scanner.nextDouble(); // Baca major radius

        System.out.print("Isikan radius : "); // Input minor radius
        double r = scanner.nextDouble(); // Baca minor radius

        torus torus = new torus(R, r); // Membuat objek torus
        System.out.println("============================================="); // Cetak garis
        torus.printInfo(); // Tampilkan info torus


        // Input dan perhitungan untuk donat tanpa lubang (bola)
        System.out.println("============================================="); // Cetak garis
        System.out.println("Donat tanpa lubang"); // Cetak judul
        System.out.println("============================================="); // Cetak garis
        System.out.print("Isikan radius : "); // Input radius bola
        double rBola = scanner.nextDouble(); // Baca radius bola

        sphere bola = new sphere(rBola); // Membuat objek bola
        bola.printInfo(); // Tampilkan info bola
        System.out.println("============================================="); // Cetak garis
        scanner.close(); // Tutup scanner
    }
}
