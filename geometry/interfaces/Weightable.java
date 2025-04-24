package geometry.interfaces; 
// Mendeklarasikan package tempat antarmuka Weightable berada.

public interface Weightable { 
    // Antarmuka untuk objek yang memiliki berat.

    double g = 9.8; 
    // Konstanta gravitasi (m/s^2).

    double getWeight(); 
    // Metode untuk mendapatkan berat.
}
