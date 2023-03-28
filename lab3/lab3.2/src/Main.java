public class Main {
    public static void main(String[] args) {
        int n = 3;
        Complex[] vector1 = new Complex[n];
        Complex[] vector2 = new Complex[n];
        for (int i = 0; i < n; i++) {
            vector1[i] = new Complex(i,i+1);
            vector2[i] = new Complex(i + 1, i);
        }
        Complex[] result = new Complex[n];
        for (int i = 0; i < n; i++) {
            result[i] = vector1[i].add(vector2[i]);
        }
        System.out.println("Vector 1: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vector1[i].toString());
        }
        System.out.println("Vector 2: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vector2[i].toString());
        }
        System.out.println("Result: ");
        for (int i = 0; i < n; i++) {
            System.out.println(result[i].toString());
        }
    }
}