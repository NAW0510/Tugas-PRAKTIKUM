package transportation;
public class Train extends Vehicle {
    private static final int FIXED_FARE = 10000;

    public Train(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    public void calculateFare() {
        int tarif = FIXED_FARE;
        int fare = getCurrentPassengers() * tarif;
        System.out.println("Total Penumpang: " + getCurrentPassengers());
        System.out.println("Tarif tetap per Penumpang: Rp " + tarif);
        System.out.println("Total tarif perjalanan bus: Rp " + fare);
    }
}