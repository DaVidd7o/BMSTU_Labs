public class Trip {
    String departure,destination,NameDriver;
    int distance,carID;
    boolean pending;

    public Trip(String departure, String destination, String nameDriver, int distance, int carID, boolean pending) {
        this.departure = departure;
        this.destination = destination;
        NameDriver = nameDriver;
        this.distance = distance;
        this.carID = carID;
        this.pending = pending;
    }
}
