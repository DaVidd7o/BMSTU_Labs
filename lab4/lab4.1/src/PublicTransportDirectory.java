import java.util.ArrayList;

class PublicTransportDirectory {
    // Main class for storing directory of public transport
    ArrayList<TransportInfo> directory;
     TransportInfo transportInfo;

    // Constructor for creating new directory
    public PublicTransportDirectory() {
        directory = new ArrayList<>();
    }

    // Add new transport information to directory
    public void addTransportInfo(String time, String route, double price) {
        transportInfo = new TransportInfo(time, route, price);
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
    // Inner class for storing information about time, routes and price
    public class TransportInfo {
        private String time,route;
        private double price;

        public TransportInfo(String time, String route, double price) {
            this.time = time;
            this.route = route;
            this.price = price;
        }

        public String getTime() {
            return time;
        }

        public String getRoute() {
            return route;
        }

        public double getprice() {
            return price;
        }
    }
}