class CarManager {
    private Car[] cars;

    public CarManager(Car[] cars) {
        this.cars = cars;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Car[] getCarsByBrand(String brand) {
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                count++;
            }
        }
        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                result[index] = car;
                index++;
            }
        }
        return result;
    }

    public Car[] getCarsByModelAndAge(String model, int age) {
        int count = 0;
        for (Car car : cars) {
            if (car.getModel().equals(model) && car.getYear() <= (2023 - age)) {
                count++;
            }
        }
        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car.getModel().equals(model) && car.getYear() <= (2023 - age)) {
                result[index] = car;
                index++;
            }
        }
        return result;
    }

    public Car[] getCarsByYearAndPrice(int year, double price) {
        int count = 0;
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price) {
                count++;
            }
        }
        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price) {
                result[index] = car;
                index++;
            }
        }
        return result;
    }
}