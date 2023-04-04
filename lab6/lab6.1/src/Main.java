    import java.io.*;
    import java.util.*;
import  java.io.*;
//7.	Ввести строки из файла, записать в список ArrayList.
//        Выполнить сортировку строк, используя метод sort() из класса Collections.
public class Main {
    public static void main(String[] args) throws Exception{
        var fr  =  new FileReader("src/test.txt");
        var reader = new BufferedReader(fr);
        var line = reader.readLine();
        var list1 = new ArrayList<String>();
        while (line!= null) {
            list1.add(line);
            line = reader.readLine();
        }
        System.out.println("Unsorted list");
        for (String next: list1) {
            System.out.println(next);
        }
        Collections.sort(list1);
        System.out.println("------");
        System.out.println("Sorted list");
        for (String next: list1) {
            System.out.println(next);
        }
    }
}