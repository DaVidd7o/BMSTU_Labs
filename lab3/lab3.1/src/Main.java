import java.util.Scanner;

//7.Определить класс Дробь в виде пары (m,n).
//  Класс должен содержать несколько конструкторов. Реализовать методы для сложения, вычитания, умножения и деления дробей.
//  Объявить массив из k дробей, ввести/вывести значения для массива дробей.
//  Создать массив объектов и передать его в метод, который изменяет каждый элемент массива с четным индексом
//  путем добавления следующего за ним элемента массива.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums[] = new int[4];
        System.out.println("Input one at the time int numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        Fraction frac1 = new Fraction(nums[0],nums[1]); // вызов второго конструктора с одним параметром
        Fraction frac2 = new Fraction(nums[2],nums[3]);
        frac1.sum(frac1,frac2);
        frac1.sub(frac1,frac2);
        frac1.mul(frac1,frac2);
        frac1.div(frac1,frac2);

        int num = 0;
        while (true) {
            System.out.print("Input a number of Fractions for array: ");
            num = in.nextInt();
            if (num > 0) {
                break;
            }
        }
        int nums1[] = new int[num*2];
        System.out.println("Input one at the time int numbers: ");
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = in.nextInt();
        }
        Fraction[] arr = new Fraction[num];
        int k=0;
        System.out.println("The input array of fractions:");
        for (int i=0;i<nums1.length-1;i+=2) {
            int numerator = nums1[i];
            int determinator = nums1[i+1];
            arr[k] = new Fraction(numerator,determinator);
            System.out.println(arr[k].m);
            System.out.println(arr[k].n);
            System.out.println("---");
            k++;

        }
        Fraction frac3 = new Fraction();
        frac3.edit(arr);
        System.out.println("The edit array of fractions:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i].m);
            System.out.println(arr[i].n);
            System.out.println("---");
        }
    }
}