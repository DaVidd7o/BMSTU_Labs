import java.util.Scanner;

//7.Определить класс Дробь в виде пары (m,n).
//  Класс должен содержать несколько конструкторов. Реализовать методы для сложения, вычитания, умножения и деления дробей.
//  Объявить массив из k дробей, ввести/вывести значения для массива дробей.
//  Создать массив объектов и передать его в метод, который изменяет каждый элемент массива с четным индексом
//  путем добавления следующего за ним элемента массива.
public class Main {
    public static void main(String[] args) {
        Fraction tom = new Fraction(1,4); // вызов второго конструктора с одним параметром
        Fraction andy = new Fraction(2,6);
        tom.sum(tom,andy);
        tom.sub(tom,andy);
        tom.mul(tom,andy);
        tom.div(tom,andy);

        Scanner in = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.print("Input a number of Fractions for array: ");
            num = in.nextInt();
            if (num > 0) {
                break;
            }
        }
        int nums[] = new int[num*2];
        System.out.println("Input one at the time int numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        Fraction[] arr = new Fraction[num];
        int k=0;
        System.out.println("The input array of fractions:");
        for (int i=0;i<nums.length-1;i+=2) {
            int numerator = nums[i];
            int determinator = nums[i+1];
            arr[k] = new Fraction(numerator,determinator);
            System.out.println(arr[k].m);
            System.out.println(arr[k].n);
            System.out.println("---");
            k++;

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

class Fraction{  // имя

    int m,n; // числитель и знаменатель
    public Fraction() {}

    public Fraction(int m, int n) {
        this.m = m;
        this.n = n;
    }

    private static int gcd(int a, int b) // Greatest Common Divisor
    {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int gcd(int[] input) { // Greatest Common Divisor
        int result = input[0];
        for (int i = 1; i < input.length; i++)
            result = gcd(result, input[i]);
        return result;
    }
    private static int lcm(int a,int b){
        return a / gcd(a,b) * b;
    }
    private static int lcm(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            if ((input[i] == 0 || input[0] == 0)
                    || (input[i] < 0 || input[0] < 0))
                break;
            result = lcm(result, input[i]);
        }
        return result;
    }

    void displayInfo(Fraction res,String operation){
        System.out.println(res.m);
        System.out.print(res.n);
        System.out.println(operation);
    }

    public Fraction sum(Fraction first, Fraction second){
        Fraction result = new Fraction();
        if (first.n==second.n) {
            result.m = first.m + second.m;
            result.n = first.n;
        }
        else {
            int LCM = lcm(first.n,second.n);
            result.m =first.m*(LCM/ first.n)+second.m*(LCM / second.n);
            result.n = LCM;
            }
        displayInfo(result," Sum");
        return result;
    }
    public void edit(Fraction[] array_for_edit){
        for (int i=0;i<array_for_edit.length-1;i++) {
            if (i % 2 == 0) {
                array_for_edit[i] = sum(array_for_edit[i],array_for_edit[i+1]);
            }
        }
        //displayInfo(result," Sum");
    }
    public void sub(Fraction first, Fraction second){
        Fraction result = new Fraction();
        if (first.n==second.n) {
            result.m = first.m - second.m;
            result.n = first.n;
        }
        else {
            int LCM = lcm(first.n,second.n);
            result.m =first.m*(LCM/ first.n)-second.m*(LCM / second.n);
            result.n = LCM;
        }
        displayInfo(result," Sub");
    }

    public void mul(Fraction first, Fraction second){
        Fraction result = new Fraction();
        result.n= first.n* second.n;
        result.m= first.m* second.m;
        displayInfo(result," Mul/Div");
    }
    public void div(Fraction first, Fraction second){
        Fraction doubler = new Fraction();
        doubler.m = second.n;
        doubler.n = second.m;
        mul(first,doubler);

    }
}