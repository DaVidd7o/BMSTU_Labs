import java.util.*;
//7.	Задана коллекция строк. Получить массив уникальных значений.
//8.	Задана коллекция строк. Получить список без дубликатов с сохранением порядка.
//Использовать ТОЛЬКО методы Stream API. Циклов и условий быть не должно
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Ten");
        list.add("Four");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Ten");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        System.out.println("Array with unique values");
        Arrays.stream(list.stream().toArray()).distinct().forEach(x -> System.out.println(x));
        System.out.println("List without duplicates");
        list.stream().toList().stream().distinct().forEach(x -> System.out.println(x));
    }
}