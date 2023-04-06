import java.util.Scanner;
import java.util.stream.IntStream;
public class Main {
    private static long gcd(long a, long b) // Greatest Common Divisor
    {
        while (b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static long gcd(int[] input) {
        long result = input[0];
        for (int i = 1; i < input.length; i++)
            result = gcd(result, input[i]);
        return result;
    }
    private static long lcm(long a,long b){
        return a / gcd(a,b) * b;
    }
    private static long lcm(int[] input) {
        long result = input[0];
        for (int i = 1; i < input.length; i++) {
            if ((input[i] == 0 || input[0] == 0)
                    || (input[i] < 0 || input[0] < 0))
                break;
            result = lcm(result, input[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.print("Input a total positive number n>0: ");
            num = in.nextInt();
            if (num > 0) {
                break;
            }
        }
        int nums[] = new int[num];
        System.out.println("Input one at the time int numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Prime numbers are:");
        for (int k : nums) {
            boolean isPrime = true;
            for (int j = 2; j < k; j++) {
                if (k % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(k);
        }
        in.close();
        System.out.print("GCD:");
        System.out.println(gcd(nums));
        System.out.print("LCM:");
        System.out.println(lcm(nums));

    }
}