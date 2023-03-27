import java.util.ArrayList;

public class Driver {
    String FirstName,LastName;
    int age,carID;
    boolean active,free;

    public Driver(String firstName, String lastName, int age, int carID, boolean active, boolean free) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        this.carID = carID;
        this.active = active;
        this.free = free;
    }

    public void TicketForRepair(int carID, ArrayList<Auto> list2) {
        for (Auto car : list2){
            if (car.carID==carID) {
                car.ready=false;
                car.OnRepair = true;
            }
        }
    }
    public void ReportOfAuto(Auto car) {
        System.out.printf("Report about the car:%s %d\n",car.car_model,carID);
            if (car.ready) {
                System.out.println("This car is fine and ready to go!: ");
            } else if (!car.breaks) {
                System.out.println("The brakes of this car are not working! ");
            } else if (car.fuel==0) {
                System.out.println("Gasoline is empty: ");
            }
    }
}
