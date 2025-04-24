package geometry.shapes; 
// Mendeklarasikan package tempat kelas Cube berada.

import geometry.interfaces.ThreeDimensional;
import geometry.interfaces.Weightable;
import geometry.bases.Shape;

public class Cube extends Shape implements ThreeDimensional, Weightable { 
    // Kelas Cube adalah turunan dari Shape dan mengimplementasikan antarmuka ThreeDimensional dan Weightable.

    private double edge, mass; 
    // Variabel instance untuk menyimpan panjang sisi dan massa kubus.

    public Cube() {
        setName("3D Weightable Cube"); 
        // Konstruktor default, mengatur nama kubus.
    }

    public Cube(double edge, double mass) {
        setName("Cube"); 
        // Konstruktor dengan parameter edge dan mass, mengatur nama kubus.
        this.mass = mass; 
        // Mengatur nilai massa.
        this.edge = edge; 
        // Mengatur nilai panjang sisi.
    }

    @Override
    public double getSurfaceArea() {
        return 6 * edge * edge; 
        // Menghitung luas permukaan kubus (6 * sisi^2).
    }

    @Override
    public double getVolume() {
        return edge * edge * edge; 
        // Menghitung volume kubus (sisi^3).
    }

    @Override
    public double getWeight() {
        return mass * g; 
        // Menghitung berat kubus (massa * gravitasi).
    }

    @Override
    public void printInfo() {
        this.setName("Cube"); 
        // Mengatur nama kubus.
        System.out.println("Name            : " + getName()); 
        // Menampilkan nama kubus.
        System.out.println("Surface area    : " + getSurfaceArea()); 
        // Menampilkan luas permukaan kubus.
        System.out.println("Volume          : " + getVolume()); 
        // Menampilkan volume kubus.
        System.out.println("Weight          : " + getWeight()); 
        // Menampilkan berat kubus.
    }
}
