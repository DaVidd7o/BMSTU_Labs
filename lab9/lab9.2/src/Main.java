import java.util.*;
//7.	Задана коллекция чисел. Вычесть из каждого значения 10 и получить среднее.
//8.	Задана коллекция чисел. Получить сумму всех кратных 7.
//Использовать ТОЛЬКО методы Stream API. Циклов и условий быть не должно
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(62);list.add(15);list.add(34);list.add(432);list.add(67);
        list.add(91);list.add(52);list.add(14);list.add(284);list.add(86);
        System.out.println("Mean");
        System.out.println(list.stream().mapToInt(x->x-=10).average());
        System.out.println("The sum of the numbers of multiples of 7");
        System.out.println(list.stream().filter(a->a%7==0).mapToInt(b->b).sum());

    }
}