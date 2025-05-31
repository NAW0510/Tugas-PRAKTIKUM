package interfaces; // Mendeklarasikan package interfaces

/**
 * Interface untuk perhitungan biaya pengiriman berdasarkan massa.
 */
public interface shippingcostcalculator {
    public static final int PRICE_PER_KG = 2000; // Harga per kilogram
    double calculateCost(); // Method untuk menghitung biaya kirim
}
