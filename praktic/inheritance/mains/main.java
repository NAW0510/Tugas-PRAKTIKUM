package mains;

import transportation.Bus;
import transportation.Taxi;
import transportation.Train;

public class main {
    public static void main(String[] args) { 
        Bus bus = new Bus("Bus Transjakarta", 50, "Terminal A - Terminal B");
        Train train = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat");
        Taxi taxi = new Taxi("Taksi Bluebird", 4, "Bandara - Hotel");

        bus.startJourney();
        bus.boardPassenger(30);
        bus.boardPassenger(20);
        bus.calculateFare(5);
        bus.stopJourney();
        bus.dropPassenger(50);
        
System.out.println("---------------------------------");

        train.startJourney();
        train.boardPassenger(150);
        train.calculateFare();
        train.stopJourney();
        train.dropPassenger(150);

System.out.println("---------------------------------");

        taxi.startJourney();
        taxi.boardPassenger(3);
        System.out.println("Total penumpang Taksi: " + taxi.getCurrentPassengers() + " penumpang.");
        taxi.calculateFare(5);
        taxi.stopJourney();
        taxi.dropPassenger(3);

System.out.println("---------------------------------");

        bus.startJourney();
        bus.boardPassenger(30);
        bus.boardPassenger(100);
        bus.calculateFare(5);
        bus.stopJourney();
        bus.dropPassenger(30);
        bus.dropPassenger(50);


System.out.println("---------------------------------");

        train.startJourney();
        train.boardPassenger(150);
        train.boardPassenger(300);

        train.calculateFare();
        train.stopJourney();
        train.dropPassenger(150);
        train.dropPassenger(150);


System.out.println("---------------------------------");

        taxi.startJourney();
        taxi.boardPassenger(3);
        taxi.boardPassenger(10);
        System.out.println("Total penumpang Taksi: " + taxi.getCurrentPassengers() + " penumpang.");
        taxi.calculateFare(10);
        taxi.stopJourney();
        taxi.dropPassenger(3);
        taxi.dropPassenger(3);

    }
}
