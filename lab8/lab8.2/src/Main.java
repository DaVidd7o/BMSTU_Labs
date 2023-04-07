import java.util.concurrent.Semaphore;
import java.util.*;
//	Реализовать многопоточное приложение “Робот”. Надо написать робота, который умеет ходить.
//	За движение каждой его ноги отвечает отдельный поток.
//	Шаг выражается в выводе в консоль LEFT или RIGHT.
public class Main {

    public static void main(String[] args) {
        var robot = new Robot();
        Semaphore sem = new Semaphore(1); // 1 разрешение
        while (robot.active) {
            new Thread(new LeftFootStep("Left",sem)).start();
            new Thread(new RightFootStep("Right",sem)).start();
            System.out.println("Do you want to stop? y/n");
            var in = new Scanner(System.in);
            var letter = in.next().charAt(0);
            if (letter=='n') {
                robot.active = false;
                break;
            }
        }
    }
}
class Robot{
    boolean active = true;
}