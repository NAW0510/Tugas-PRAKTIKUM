package transportation;

public class Train extends Vehicle {
    private static final int FIXED_FARE = 10000;

    // Konstruktor untuk inisialisasi nama, kapasitas, dan rute kereta
    public Train(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    // Fungsi untuk menghitung tarif perjalanan dengan tarif tetap per penumpang
    public void calculateFare() {
        int tarif = FIXED_FARE;
        int fare = getCurrentPassengers() * tarif;
        System.out.println("Total Penumpang: " + getCurrentPassengers());
        System.out.println("Tarif tetap per Penumpang: Rp " + tarif);
        System.out.println("Total tarif perjalanan bus: Rp " + fare);
    }
}