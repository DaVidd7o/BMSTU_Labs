import java.util.*;
public class Main {
    public static void main(String[] args) {
        PublicTransportDirectory system = new PublicTransportDirectory();
        system.addTransportInfo("150 min","From Moscow to Ramenskoe",100);
        system.addTransportInfo("240 min","From Reytov to Ramenskoe",30);
        System.out.println(system.directory.get(1).getTime());
        System.out.println(system.directory.get(0).getRoute());
    }

}