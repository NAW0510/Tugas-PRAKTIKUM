package transportation;

public class Vehicle {
    private String route, name;
    private int capacity, currentPassengers;

    // Konstruktor untuk inisialisasi nama, kapasitas, dan rute kendaraan
    public Vehicle(String name, int capacity, String route) {
        this.currentPassengers = 0;
        this.name = name;
        this.capacity = capacity;
        this.route = route;
        this.currentPassengers = 0;
    }

    // Fungsi untuk menaikkan penumpang ke dalam kendaraan
    public void boardPassenger(int count) {
        if (currentPassengers + count <= capacity) {
            currentPassengers += count;
            System.out.println(count + " penumpang naik ke dalam " + name);
        } else {
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " + count + " penumpang.");
        }
    }

    // Fungsi untuk menurunkan penumpang dari kendaraan
    public void dropPassenger(int count) {
        if (currentPassengers - count >= 0) {
            currentPassengers -= count;
            System.out.println(count + " penumpang turun dari " + name);
        } else {
            System.out.println("Tidak ada cukup penumpang untuk turun!");
        }
    }

    // Fungsi untuk memulai perjalanan kendaraan
    public void startJourney() {
        System.out.println(name + " memulai perjalanan di " + route);
    }

    // Fungsi untuk menghentikan perjalanan kendaraan
    public void stopJourney() {
        System.out.println(name + " Mencapai tujuan akhir dan berhenti ");
    }

    // Fungsi untuk mendapatkan jumlah penumpang saat ini
    public int getCurrentPassengers() {
        return currentPassengers;
    }

    // Fungsi placeholder untuk menghitung tarif (dapat di-override oleh subclass)
    public void calculateFare() {
    }
}
