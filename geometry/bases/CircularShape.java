package geometry.bases; 
// Mendeklarasikan package tempat kelas CircularShape berada.

public abstract class CircularShape extends Shape { 
    // CircularShape adalah kelas abstrak yang merupakan turunan dari kelas Shape.
    
    private double radius; 
    // Variabel instance untuk menyimpan jari-jari lingkaran.

    protected static final int PI_NUMERATOR = 22; 
    // Konstanta untuk pembilang nilai PI (22/7).

    protected static final int PI_DENOMINATOR = 7; 
    // Konstanta untuk penyebut nilai PI (22/7).

    public CircularShape() {
        super(); 
        // Memanggil konstruktor kelas induk (Shape).
    }

    public void setRadius(double inputRadius) {
        radius = inputRadius; 
        // Metode untuk mengatur nilai jari-jari lingkaran.
    }

    public double getRadius() {
        return radius; 
        // Metode untuk mendapatkan nilai jari-jari lingkaran.
    }
}