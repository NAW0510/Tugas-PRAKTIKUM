package mains;

import transportation.Bus;
import transportation.Taxi;
import transportation.Train;

public class main {
    public static void main(String[] args) { 
        // Membuat objek Bus dengan nama, kapasitas, dan rute
        Bus bus = new Bus("Bus Transjakarta", 50, "Terminal A - Terminal B");
        // Membuat objek Train dengan nama, kapasitas, dan rute
        Train train = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat");
        // Membuat objek Taxi dengan nama, kapasitas, dan rute
        Taxi taxi = new Taxi("Taksi Bluebird", 4, "Bandara - Hotel");

        // Simulasi perjalanan Bus
        bus.startJourney(); // Memulai perjalanan bus
        bus.boardPassenger(30); // Menambahkan 30 penumpang ke bus
        bus.boardPassenger(20); // Menambahkan 20 penumpang lagi ke bus
        bus.calculateFare(5); // Menghitung tarif perjalanan untuk 5 pemberhentian
        bus.stopJourney(); // Mengakhiri perjalanan bus
        bus.dropPassenger(50); // Menurunkan 50 penumpang dari bus
        
        System.out.println("---------------------------------");

        // Simulasi perjalanan Train
        train.startJourney(); // Memulai perjalanan kereta
        train.boardPassenger(150); // Menambahkan 150 penumpang ke kereta
        train.calculateFare(); // Menghitung tarif perjalanan berdasarkan jumlah penumpang
        train.stopJourney(); // Mengakhiri perjalanan kereta
        train.dropPassenger(150); // Menurunkan 150 penumpang dari kereta

        System.out.println("---------------------------------");

        // Simulasi perjalanan Taxi
        taxi.startJourney(); // Memulai perjalanan taksi
        taxi.boardPassenger(3); // Menambahkan 3 penumpang ke taksi
        System.out.println("Total penumpang Taksi: " + taxi.getCurrentPassengers() + " penumpang."); // Menampilkan jumlah penumpang saat ini
        taxi.calculateFare(10); // Menghitung tarif perjalanan untuk jarak 10 km
        taxi.stopJourney(); // Mengakhiri perjalanan taksi
        taxi.dropPassenger(3); // Menurunkan 3 penumpang dari taksi

        System.out.println("---------------------------------");

        // Simulasi perjalanan Bus kedua
        bus.startJourney(); // Memulai perjalanan bus
        bus.boardPassenger(30); // Menambahkan 30 penumpang ke bus
        bus.boardPassenger(100); // Menambahkan 100 penumpang lagi ke bus
        bus.calculateFare(5); // Menghitung tarif perjalanan untuk 5 pemberhentian
        bus.stopJourney(); // Mengakhiri perjalanan bus
        bus.dropPassenger(30); // Menurunkan 30 penumpang dari bus
        bus.dropPassenger(50); // Menurunkan 50 penumpang dari bus

        System.out.println("---------------------------------");

        // Simulasi perjalanan Train kedua
        train.startJourney(); // Memulai perjalanan kereta
        train.boardPassenger(150); // Menambahkan 150 penumpang ke kereta
        train.boardPassenger(300); // Menambahkan 300 penumpang lagi ke kereta
        train.calculateFare(); // Menghitung tarif perjalanan berdasarkan jumlah penumpang
        train.stopJourney(); // Mengakhiri perjalanan kereta
        train.dropPassenger(150); // Menurunkan 150 penumpang dari kereta
        train.dropPassenger(150); // Menurunkan 150 penumpang lagi dari kereta

        System.out.println("---------------------------------");

        // Simulasi perjalanan Taxi kedua
        taxi.startJourney(); // Memulai perjalanan taksi
        taxi.boardPassenger(3); // Menambahkan 3 penumpang ke taksi
        taxi.boardPassenger(10); // Menambahkan 10 penumpang lagi ke taksi
        System.out.println("Total penumpang Taksi: " + taxi.getCurrentPassengers() + " penumpang."); // Menampilkan jumlah penumpang saat ini
        taxi.calculateFare(10); // Menghitung tarif perjalanan untuk jarak 10 km
        taxi.stopJourney(); // Mengakhiri perjalanan taksi
        taxi.dropPassenger(3); // Menurunkan 3 penumpang dari taksi
        taxi.dropPassenger(3); // Menurunkan 3 penumpang lagi dari taksi
    }
}
