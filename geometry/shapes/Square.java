package geometry.shapes; // Mendeklarasikan package tempat kelas ini berada.

import geometry.bases.Shape;
import geometry.interfaces.TwoDimensional;

public class Square extends Shape implements TwoDimensional { 
    // Kelas Square adalah turunan dari Shape dan mengimplementasikan antarmuka TwoDimensional.
    
    private double side; 
    // Variabel instance untuk menyimpan panjang sisi persegi.

    public Square() {
        // Konstruktor tanpa parameter.
        setName("2D Square"); 
        // Mengatur nama default untuk persegi.
    }

    public Square(double side) {
        // Konstruktor dengan parameter panjang sisi.
        setName("Square"); 
        // Mengatur nama persegi.
        this.side = side; 
        // Menginisialisasi panjang sisi.
    }

    @Override
    public double getArea() {
        // Implementasi metode getArea dari antarmuka TwoDimensional.
        return side * side; 
        // Menghitung luas persegi (sisi * sisi).
    }

    @Override
    public double getPerimeter() {
        // Implementasi metode getPerimeter dari antarmuka TwoDimensional.
        return 4 * side; 
        // Menghitung keliling persegi (4 * sisi).
    }

    @Override
    public void printInfo() {
        // Implementasi metode abstrak printInfo dari kelas Shape.
        this.setName("Square"); 
        // Mengatur nama persegi.
        System.out.println("Name            : " + getName()); 
        // Menampilkan nama persegi.
        System.out.println("Area            : " + getArea()); 
        // Menampilkan luas persegi.
        System.out.println("Perimeter       : " + getPerimeter()); 
        // Menampilkan keliling persegi.
    }
}
