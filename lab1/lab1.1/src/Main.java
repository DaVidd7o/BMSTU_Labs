import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.Приветствовать любого пользователя при вводе его имени через командную строку
        Scanner vvod = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.println("Hello " + vvod.nextLine());
        }
    }
}