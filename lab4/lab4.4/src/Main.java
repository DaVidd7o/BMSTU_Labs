import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Ship ship = new Ship("Антон", 18);

        Ship Cargo = new CargoShip("Беда", 190,500,250);// восходящее преобразование к базовому типу
        Ship TankShip = new Tanker("Путь", 560,890,450); // восходящее преобразование к базовому типу

        List<Ship> sea = Arrays.asList(Cargo, TankShip);
        for (Ship d : sea) {
            d.work();// полиморфный вызов метода
        }
    }
}