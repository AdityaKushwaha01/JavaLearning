package NewLearningsJava;
import java.util.*;
import java.util.stream.Collectors;

public class JavStreams {
	// Sample TravelClass enum
    enum TravelClass {
        ECONOMY("Economy", 1),
        BUSINESS("Business", 2),
        FIRST("First Class", 3);
        private final String className;
        private final int tier;
        TravelClass(String className, int tier) {
            this.className = className;
            this.tier = tier;
        }
        public String getClassName() {
            return className;
        }
        public int getTier() {
            return tier;
        }
    }
   // Booking class
    static class Booking {
        String flightId;
        String passengerName;
        double fare;
        String destination;
        String status;
        TravelClass travelClass;
        public Booking(String flightId, String passengerName, double fare, String destination, String status, TravelClass travelClass) {
            this.flightId = flightId;
            this.passengerName = passengerName;
            this.fare = fare;
            this.destination = destination;
            this.status = status;
            this.travelClass = travelClass;
        }
        public String getDestination() {
            return destination;
        }
        public String getPassengerName() {
            return passengerName;
        }
    }
    public static void main(String[] args) {
        List<Booking> bookings = Arrays.asList(
            new Booking("F101", "Alice", 150.0, "Paris", "Confirmed", TravelClass.ECONOMY),
            new Booking("F102", "Bob", 250.0, "London", "Confirmed", TravelClass.BUSINESS),
            new Booking("F103", "Charlie", 200.0, "Paris", "Pending", TravelClass.FIRST),
            new Booking("F104", "David", 300.0, "New York", "Confirmed", TravelClass.BUSINESS),
            new Booking("F105", "Eva", 180.0, "London", "Confirmed", TravelClass.ECONOMY)
        );
        // Group by destination -> list of passenger names
        Map<String, List<String>> groupedByDestination = bookings.stream()
            .collect(Collectors.groupingBy(
                Booking::getDestination,
                Collectors.mapping(Booking::getPassengerName, Collectors.toList())
            ));
        // Output
        groupedByDestination.forEach((destination, passengers) ->
            System.out.println(destination + " => " + passengers));
    }

}
