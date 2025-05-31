package interfaces; // Mendeklarasikan package interfaces

/**
 * Interface untuk konversi massa dari gram ke kilogram.
 */
public interface massconverter {
    public static final int DENOMINATOR = 1000; // Konstanta pembagi gram ke kilogram
    double gramToKilogram(double grams); // Method konversi gram ke kilogram
}
