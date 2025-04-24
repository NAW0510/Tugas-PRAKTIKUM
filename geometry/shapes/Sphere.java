package geometry.shapes; 
// Mendeklarasikan package tempat kelas Sphere berada.

import geometry.interfaces.ThreeDimensional;
import geometry.bases.CircularShape;
import geometry.interfaces.Weightable;

public class Sphere extends CircularShape implements ThreeDimensional, Weightable { 
    // Kelas Sphere adalah turunan dari CircularShape dan mengimplementasikan antarmuka ThreeDimensional dan Weightable.

    private double mass; 
    // Variabel instance untuk menyimpan massa bola.

    public Sphere() {
        setName("3D Weightable Sphere"); 
        // Konstruktor default, mengatur nama bola.
    }

    public Sphere(double radius, double mass) {
        setName("Sphere"); 
        // Konstruktor dengan parameter radius dan mass, mengatur nama bola.
        setRadius(radius); 
        // Mengatur nilai radius.
        this.mass = mass; 
        // Mengatur nilai massa.
    }

    @Override
    public double getSurfaceArea() {
        return (4 * PI_NUMERATOR * getRadius() * getRadius()) / (double) PI_DENOMINATOR; 
        // Menghitung luas permukaan bola menggunakan formula 4πr^2.
    }

    @Override
    public double getVolume() {
        return (4 * PI_NUMERATOR * getRadius() * getRadius() * getRadius()) / (3.0 * PI_DENOMINATOR); 
        // Menghitung volume bola menggunakan formula 4/3πr^3.
    }

    @Override
    public double getWeight() {
        return mass * g; 
        // Menghitung berat bola (massa * gravitasi).
    }

    @Override
    public void printInfo() {
        this.setName("Sphere"); 
        // Mengatur nama bola.
        System.out.println("Nama            : " + getName()); 
        // Menampilkan nama bola.
        System.out.println("Surface area    : " + getSurfaceArea()); 
        // Menampilkan luas permukaan bola.
        System.out.println("Volume          : " + getVolume()); 
        // Menampilkan volume bola.
        System.out.println("Weight          : " + getWeight()); 
        // Menampilkan berat bola.
    }
}
