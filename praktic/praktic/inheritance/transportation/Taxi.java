package transportation;
public class Taxi extends Vehicle {
    private static final int FARE_PER_KM = 5000;

    public Taxi(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    public void calculateFare(int distance) {
        int tarif = FARE_PER_KM;
        int fare = distance* tarif;
        System.out.println("Total Penumpang: " + getCurrentPassengers());
        System.out.println("Total jarak rute: " + distance + " KM");
        System.out.println("Tarif per KM: Rp " + tarif);
        System.out.println("Total tarif perjalanan Taksi: Rp " + fare);
    }
}