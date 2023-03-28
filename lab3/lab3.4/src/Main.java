
public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(1, "Toyota", "Camry", 2018, "Silver", 25000, "ABC123"),
                new Car(2, "Honda", "Civic", 2019, "Red", 20000, "DEF456"),
                new Car(3, "Toyota", "Corolla", 2017, "Black", 22000, "GHI789"),
                new Car(4, "Ford", "Mustang", 2015, "Yellow", 30000, "JKL012"),
                new Car(5, "Chevrolet", "Camaro", 2016, "White", 28000, "MNO345")
        };

        CarManager cm = new CarManager(cars);

        // Get cars by brand
        Car[] toyotas = cm.getCarsByBrand("Toyota");
        System.out.println("Cars by brand:");
        for (Car car : toyotas) {
            System.out.println(car.toString());
        }

        // Get cars by model and age
        Car[] oldCivics = cm.getCarsByModelAndAge("Civic", 3);
        System.out.println("\nOld cars by model:");
        for (Car car : oldCivics) {
            System.out.println(car.toString());
        }

        // Get cars by year and price
        Car[] expensive2016 = cm.getCarsByYearAndPrice(2016, 25000);
        System.out.println("\nExpensive cars by year:");
        for (Car car : expensive2016) {
            System.out.println(car.toString());
        }
    }
}