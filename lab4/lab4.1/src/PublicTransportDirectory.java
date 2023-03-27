import java.util.ArrayList;

public class PublicTransportDirectory {
    // Main class for storing directory of public transport
    private ArrayList<TransportInfo> directory;

    // Constructor for creating new directory
    public PublicTransportDirectory() {
        directory = new ArrayList<>();
    }

    // Add new transport information to directory
    public void addTransportInfo(String time, String route, double fare) {
        TransportInfo transportInfo = new TransportInfo(time, route, fare);
        directory.add(transportInfo);
    }

    // Get transport information by index
    public TransportInfo getTransportInfo(int index) {
        return directory.get(index);
    }

    // Get total number of transport information in directory
    public int getSize() {
        return directory.size();
    }
    // Inner class for storing information about time, routes and fare
    private class TransportInfo {
        private String time;
        private String route;
        private double fare;

        public TransportInfo(String time, String route, double fare) {
            this.time = time;
            this.route = route;
            this.fare = fare;
        }

        public String getTime() {
            return time;
        }

        public String getRoute() {
            return route;
        }

        public double getFare() {
            return fare;
        }
    }
}