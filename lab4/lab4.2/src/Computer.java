import java.util.ArrayList;

class ComputerDirectory {
    // Main class for storing directory of public transport
    ArrayList<ComputerInfo> directory;
    ComputerInfo ComputerInfo;

    // Constructor for creating new directory
    public ComputerDirectory() {
        directory = new ArrayList<>();
    }

    // Add new transport information to directory
    public void addComputerInfo(String OS, String processor, double RAM) {
        ComputerInfo = new ComputerInfo(OS, processor, RAM);
        directory.add(ComputerInfo);
    }

    // Get transport information by index
    public ComputerInfo getComputerInfo(int index) {
        return directory.get(index);
    }

    // Get total number of transport information in directory
    public int getSize() {
        return directory.size();
    }
    // Inner class for storing information about time, routes and price
    public class ComputerInfo {
        private String OS,processor;
        private double RAM;


        public ComputerInfo(String OS, String processor, double RAM) {
            this.OS = OS;
            this.processor = processor;
            this.RAM = RAM;
        }

        public String getOS() {
            return OS;
        }

        public double getRAM() {
            return RAM;
        }

        public String getProcessor() {
            return processor;
        }
    }
}