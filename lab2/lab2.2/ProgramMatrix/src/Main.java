import java.util.*;
public class Main {
    static void Matrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void rotateMatrix270(int[][] a) {
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = a[j][a.length - i - 1];
            }
        }
        System.out.println("Rotating by 270 degree");
        Matrix(b);
    }

    static void rotateMatrix90(int[][] a) {
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[j][i] = a[a.length - i - 1][j];
            }
        }
        System.out.println("This matrix is rotated by 90 degree:");
        Matrix(b);
    }

    static void rotateMatrix180(int[][] a) {
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[j][i] = a[a.length - j - 1][a.length - i - 1];
            }
        }
        System.out.println("This matrix is rotated by 180 degree:");
        Matrix(b);
    }
    static int det(int a[][]){
        int n = a.length;
        if(n == 1) return a[0][0];
        int ans = 0;
        int B[][] = new int[n-1][n-1];
        int l = 1;
        for(int i = 0; i < n; ++i){
            int x = 0, y = 0;
            for(int j = 1; j < n; ++j){
                for(int k = 0; k < n; ++k){
                    if(i == k) continue;
                    B[x][y] = a[j][k];
                    ++y;
                    if(y == n - 1){
                        y = 0;
                        ++x;
                    }
                }
            }
            ans += l * a[0][i] * det(B);
            l *= (-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = {{12, 2, 3}, {43, 5, 6}, {73, 8, 9}};
        System.out.println("Original matrix:");
        Matrix(a);
        rotateMatrix90(a);
        rotateMatrix180(a);
        rotateMatrix270(a);
        System.out.println(det(a));

    }
}