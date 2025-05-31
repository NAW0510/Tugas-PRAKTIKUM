package interfaces; // Mendeklarasikan package interfaces

/**
 * Interface untuk perhitungan massa.
 * Menyediakan konstanta densitas dan ketebalan.
 */
public interface masscalculable {
    public static final int DENSITY = 8; // Densitas bahan
    public static final double THICKNESS = 0.5; // Ketebalan bahan
    double getMass(); // Method untuk mendapatkan massa
}
