import java.util.ArrayList;

public class Operator {

    public void SuspendDriver(String name,ArrayList<Driver> list2) {
        for (Driver uber : list2){
            if (uber.LastName.equals(name)) {
                uber.active=false;
            }
        }
        System.out.printf("The driver %s suspended!\n",name);
    }

    public void DistributeRequests(ArrayList<Driver> list_drivers,ArrayList<Auto> list_cars,ArrayList<Trip> list_trips) {
//        var f = list_trips.stream().filter(trip -> !trip.pending);
//        var f2 = list_drivers.stream().filter(driver -> driver.active && driver.carID == 0 && driver.free);
//        f.forEach( trip -> {
//            f2.forEach(driver -> {
//                var filtered_cars = list_cars.stream().filter(car -> car.ready && trip.carID == 0);
//                filtered_cars.forEach();
//            });
//        });
        for (Trip trip: list_trips) {
            System.out.printf("The TRIP from %s to %s \n",trip.departure,trip.destination);
            if (!trip.pending) {
                for (Driver uber : list_drivers) {
                    if (uber.active && uber.carID == 0 && uber.free) {
                        for (Auto car : list_cars) {
                            if (car.ready && trip.carID==0) {
                                trip.carID= car.carID;
                                trip.NameDriver= uber.FirstName;
                                uber.free=false;
                                uber.carID = car.carID;
                                car.ready = false;
                                System.out.printf("This TRIP will do the driver %s with car %s !\n",uber.FirstName,car.car_model);
                                break;
                            }
                        }
                        if (trip.carID==0) {
                            System.out.println("There are not free cars for this TRIP");
                        } else {break;}
                    }
                }
                if (trip.NameDriver=="") {
                    System.out.println("There are not free drivers for this TRIP");
                }
            }
            else {
                System.out.println("This trip is already busy!");
            }
        }

    }
}
