package geometry.main;
// Mendeklarasikan package tempat kelas ShapeCalculator berada.

// I Gusti Ngurah Anantawijaya Mahardika
// 245150700111027                                                                                                                                                                                                                          

//@@@  @@@   @@@@@@@@  @@@  @@@  @@@@@@@    @@@@@@   @@@  @@@  
//@@@@ @@@  @@@@@@@@@  @@@  @@@  @@@@@@@@  @@@@@@@@  @@@  @@@  
//@@!@!@@@  !@@        @@!  @@@  @@!  @@@  @@!  @@@  @@!  @@@  
//!@!!@!@!  !@!        !@!  @!@  !@!  @!@  !@!  @!@  !@!  @!@  
//@!@ !!@!  !@! @!@!@  @!@  !@!  @!@!!@!   @!@!@!@!  @!@!@!@!  
//!@!  !!!  !!! !!@!!  !@!  !!!  !!@!@!    !!!@!!!!  !!!@!!!!  
//!!:  !!!  :!!   !!:  !!:  !!!  !!: :!!   !!:  !!!  !!:  !!!  
//:!:  !:!  :!:   !::  :!:  !:!  :!:  !:!  :!:  !:!  :!:  !:!  
// ::   ::   ::: ::::  ::::: ::  ::   :::  ::   :::  ::   :::  
//::    :    :: :: :    : :  :    :   : :   :   : :   :   : :

import geometry.bases.*; 
// Mengimpor semua kelas dari package geometry.bases yang berisi kelas dasar.

import geometry.interfaces.*; 
// Mengimpor semua antarmuka dari package geometry.interfaces untuk mendukung polimorfisme.

import geometry.shapes.*; 
// Mengimpor semua kelas dari package geometry.shapes yang berisi bentuk-bentuk geometris.

import java.util.Scanner; 
// Mengimpor kelas Scanner untuk membaca input dari pengguna.

public class ShapeCalculator { 
    // Kelas utama untuk menjalankan program kalkulator bentuk.

    public static void main(String[] args) { 
        // Metode utama untuk menjalankan program.

        // Konstanta untuk warna teks di terminal.
        final String WHITE = "\033[0;37m";
        final String RED = "\033[0;31m";
        final String RESET = "\033[0m";

        Scanner sc = new Scanner(System.in); // Membuat objek Scanner untuk membaca input.

        // Menampilkan header program.
        System.out.println(WHITE + "======================================" + RESET);
        System.out.println(RED + "Shape Calculator" + RESET);
        System.out.println(WHITE + "I Gusti Ngurah Anantawijaya Mahardika" + RESET);
        System.out.println(RED + "245150700111027" + RESET);

        // Menampilkan informasi default untuk lingkaran.
        Shape defaultCircle = new Circle(); // Membuat objek lingkaran default.
        System.out.println(WHITE + "======================================" + RESET);
        System.out.println(RED + defaultCircle.getName() + RESET); // Menampilkan nama bentuk.
        System.out.println(WHITE + "======================================" + RESET);
        System.out.print(RED + "Enter radius    : " + RESET); // Meminta input radius dari pengguna.
        double r1 = sc.nextDouble(); // Membaca input radius.
        CircularShape Lingkaran = new Circle(r1); // Membuat objek lingkaran dengan radius yang dimasukkan.
        System.out.println(WHITE + "======================================" + RESET);
        Lingkaran.printInfo(); // Menampilkan informasi lingkaran.

        // Menampilkan informasi default untuk persegi.
        Shape defaultSquare = new Square(); // Membuat objek persegi default.
        System.out.println(RED + "======================================" + RESET);
        System.out.println(WHITE + defaultSquare.getName() + RESET); // Menampilkan nama bentuk.
        System.out.println(RED + "======================================" + RESET);
        System.out.print(WHITE + "Enter side      : " + RESET); // Meminta input sisi dari pengguna.
        double sisi = sc.nextDouble(); // Membaca input sisi.
        Square Kotak = new Square(sisi); // Membuat objek persegi dengan sisi yang dimasukkan.
        System.out.println(RED + "======================================" + RESET);
        Kotak.printInfo(); // Menampilkan informasi persegi.

        // Menampilkan informasi default untuk kubus.
        Shape defaultCube = new Cube(); // Membuat objek kubus default.
        System.out.println(WHITE + "======================================" + RESET);
        System.out.println(RED + defaultCube.getName() + RESET); // Menampilkan nama bentuk.
        System.out.println(WHITE + "======================================" + RESET);
        System.out.print(RED + "Enter edge      : " + RESET); // Meminta input panjang sisi kubus.
        double sisi2 = sc.nextDouble(); // Membaca input panjang sisi.
        System.out.print(WHITE + "Enter mass      : " + RESET); // Meminta input massa kubus.
        double massaKubus = sc.nextDouble(); // Membaca input massa.
        Cube kubus = new Cube(sisi2, massaKubus); // Membuat objek kubus dengan panjang sisi dan massa yang dimasukkan.
        System.out.println(RED + "======================================" + RESET);
        kubus.printInfo(); // Menampilkan informasi kubus.

        // Menampilkan informasi default untuk bola.
        Shape defaultSphere = new Sphere(); // Membuat objek bola default.
        System.out.println(WHITE + "======================================" + RESET);
        System.out.println(RED + defaultSphere.getName() + RESET); // Menampilkan nama bentuk.
        System.out.println(WHITE + "======================================" + RESET);
        System.out.print(RED + "Enter radius    : " + RESET); // Meminta input radius bola.
        double r = sc.nextDouble(); // Membaca input radius.
        System.out.print(WHITE + "Enter mass      : " + RESET); // Meminta input massa bola.
        double massaBola = sc.nextDouble(); // Membaca input massa.
        Sphere bola = new Sphere(r, massaBola); // Membuat objek bola dengan radius dan massa yang dimasukkan.
        System.out.println(RED + "======================================" + RESET);
        bola.printInfo(); // Menampilkan informasi bola.

        // Menampilkan informasi volume kubus dan bola menggunakan polimorfisme.
        System.out.println(WHITE + "======================================" + RESET);
        System.out.println(RED + "Volume of Cube and Sphere" + RESET);
        System.out.println(WHITE + "POLYMORPHISM: INTERFACE" + RESET);
        System.out.println(RED + "======================================" + RESET);

        System.out.print(WHITE + "Enter edge      : " + RESET); // Meminta input panjang sisi kubus.
        double sisi3 = sc.nextDouble(); // Membaca input panjang sisi.
        System.out.print(RED + "Enter radius    : " + RESET); // Meminta input radius bola.
        double r2 = sc.nextDouble(); // Membaca input radius.
        System.out.print(WHITE + "Enter mass      : " + RESET); // Meminta input massa.
        double massa = sc.nextDouble(); // Membaca input massa.
        sc.close(); // Menutup Scanner.

        // Menggunakan antarmuka untuk menghitung volume dan berat.
        ThreeDimensional kubus3D= new Cube(sisi3, massa); // Objek kubus menggunakan antarmuka ThreeDimensional.
        ThreeDimensional lingkaran3D = new Sphere(r2, massa); // Objek bola menggunakan antarmuka ThreeDimensional.
        Weightable beratbola = new Sphere(r2, massa); // Objek bola menggunakan antarmuka Weightable.

        // Menampilkan hasil perhitungan.
        System.out.println(RED + "======================================" + RESET);
        System.out.println(WHITE + "Cube's volume   : " + kubus3D.getVolume() + RESET); // Volume kubus.
        System.out.println(RED + "Sphere's volume : " + lingkaran3D.getVolume() + RESET); // Volume bola.
        System.out.println(WHITE + "Weight          : " + beratbola.getWeight() + RESET); // Berat bola.
        System.out.println(RED + "======================================" + RESET);
    }
}
