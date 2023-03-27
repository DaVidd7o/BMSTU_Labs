import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Doctor doctor = new Doctor("Антон", 18);

        Doctor Surgeon = new SurgenDoctor("Алексей", 19);// восходящее преобразование к базовому типу
        Doctor NeuroSurgeon = new NeuroSurgeon("Игорь", 20); // восходящее преобразование к базовому типу

        List<Doctor> hospital = Arrays.asList(Surgeon, NeuroSurgeon);
        for (Doctor d : hospital) {
            d.work();// полиморфный вызов метода
        }
    }
}