package geometry.shapes; 
// Mendeklarasikan package tempat kelas Circle berada.

import geometry.bases.CircularShape;
import geometry.interfaces.TwoDimensional;


public class Circle extends CircularShape implements TwoDimensional { 
    // Kelas Circle adalah turunan dari CircularShape dan mengimplementasikan antarmuka TwoDimensional.

    public Circle() {
        setName("2D Circle"); 
        // Konstruktor default, mengatur nama lingkaran.
    }

    public Circle(double radius) {
        setName("Circle"); 
        // Konstruktor dengan parameter radius, mengatur nama lingkaran.
        setRadius(radius); 
        // Mengatur nilai radius.
    }

    @Override
    public double getPerimeter() {
        return (2 * PI_NUMERATOR * getRadius()) / (double) PI_DENOMINATOR; 
        // Menghitung keliling lingkaran menggunakan formula 2πr.
    }

    @Override
    public double getArea() {
        return (PI_NUMERATOR * getRadius() * getRadius()) / (double) PI_DENOMINATOR; 
        // Menghitung luas lingkaran menggunakan formula πr^2.
    }

    @Override
    public void printInfo() {
        this.setName("Circle"); 
        // Mengatur nama lingkaran.
        System.out.println("Name            : " + getName()); 
        // Menampilkan nama lingkaran.
        System.out.println("Area            : " + getArea()); 
        // Menampilkan luas lingkaran.
        System.out.println("Perimeter       : " + getPerimeter()); 
        // Menampilkan keliling lingkaran.
    }
}
