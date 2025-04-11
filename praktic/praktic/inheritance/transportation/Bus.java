package transportation;

public class Bus extends Vehicle {
    private static final int FARE_PER_STOP = 2000;

    // Konstruktor untuk inisialisasi nama, kapasitas, dan rute bus
    public Bus(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    // Fungsi untuk menghitung tarif perjalanan berdasarkan jumlah pemberhentian
    public void calculateFare(int stops) {
        int tarif = FARE_PER_STOP;
        int fare = getCurrentPassengers() * stops * FARE_PER_STOP;
        System.out.println("Total Penumpang: " + getCurrentPassengers());
        System.out.println("Total Pemberhentian: " + stops);
        System.out.println("Tarif per Halte: Rp " + tarif);
        System.out.println("Total tarif perjalanan bus: Rp " + fare);
    }
}