//8.	Создать класс Computer (компьютер) с внутренним классом,
//        с помощью объектов которого можно хранить информацию об операционной системе, процессоре и оперативной памяти.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ComputerDirectory system = new ComputerDirectory();
        system.addComputerInfo("Windows","Intel Core I5",8);
        system.addComputerInfo("Linux","AMD",4);
        System.out.println(system.directory.get(1).getOS());
        System.out.println(system.directory.get(0).getRAM());
    }

}