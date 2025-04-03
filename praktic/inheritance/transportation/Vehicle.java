package transportation;
public class Vehicle {
    private String route, name;
    private int capacity, currentPassengers;

    public Vehicle(String name, int capacity, String route) {
        this.currentPassengers = 0;
        this.name = name;
        this.capacity = capacity;
        this.route = route;
        this.currentPassengers = 0;
    }

    public void boardPassenger(int count) {
        if (currentPassengers + count <= capacity) {
            currentPassengers += count;
            System.out.println(count + " penumpang naik ke dalam" + name);
        } else {
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " + count + " penumpang.");
        }
    }

    public void dropPassenger(int count) {
        if (currentPassengers - count >= 0) {
            currentPassengers -= count;
            System.out.println(count + " penumpang turun dari " + name);
        } else {
            System.out.println("Tidak ada cukup penumpang untuk turun!");
        }
    }

    public void startJourney() {
        System.out.println(name + " memulai perjalanan di " + route);
    }

    public void stopJourney() {
        System.out.println(name + " Mencapai tujuan akhir dan berhenti ");
    }
    public int getCurrentPassengers() {
        return currentPassengers;
    }
    public void calculateFare() {
    }

    
}
