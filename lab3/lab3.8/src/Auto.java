public class Auto {
    String car_model;
    boolean ready,breaks,OnRepair;
    int fuel,carID;

    public Auto(String car_model, boolean ready, boolean breaks, boolean onRepair, int fuel, int carID) {
        this.car_model = car_model;
        this.ready = ready;
        this.breaks = breaks;
        OnRepair = onRepair;
        this.fuel = fuel;
        this.carID = carID;
    }
}
