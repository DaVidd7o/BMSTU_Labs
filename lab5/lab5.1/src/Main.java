import java.util.Scanner;
//7.Определить класс Дробь в виде пары (m,n).
//  Класс должен содержать несколько конструкторов. Реализовать методы для сложения, вычитания, умножения и деления дробей.
//  Объявить массив из k дробей, ввести/вывести значения для массива дробей.
//  Создать массив объектов и передать его в метод, который изменяет каждый элемент массива с четным индексом
//  путем добавления следующего за ним элемента массива.
public class Main {
    public static void main(String[] args) {
        Fraction tom = new Fraction(1, 4); // вызов второго конструктора с одним параметром
        Fraction andy = new Fraction(2, 6);
        tom.sum(tom, andy);
        tom.sub(tom, andy);
        tom.mul(tom, andy);
        tom.div(tom, andy);

        Scanner in = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.print("Input a number of Fractions for array: ");
            num = in.nextInt();
            if (num > 0) {
                break;
            }
        }
        int nums[] = new int[num * 2];
        System.out.println("Input one at the time int numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        Fraction[] arr = new Fraction[num];
        int k = 0;
        System.out.println("The input array of fractions:");
        try {
            for (int i = 0; i < nums.length - 1; i += 2) {
                int numerator = nums[i];
                int determinator = nums[i + 1];
                arr[k] = new Fraction(numerator, determinator);
                System.out.println(arr[k].m);
                System.out.println(arr[k].n);
                System.out.println("---");
                k++;

            }
        }
        catch (OutOfMemoryError e) {
            System.err.println("Недостаточно памяти");
            e.printStackTrace();
        }
        Fraction alex = new Fraction();
        alex.edit(arr);
        System.out.println("The edit array of fractions:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i].m);
            System.out.println(arr[i].n);
            System.out.println("---");
        }
    }
}

