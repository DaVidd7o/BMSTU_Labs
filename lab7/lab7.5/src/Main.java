import java.io.*;
import java.util.*;

//7.	Текст шифруется по следующему правилу: из исходного текста выбирается 1, 4, 7, 10-й и т.д. (до конца текста) символы,
// затем 2, 5, 8, 11-й и т.д. (до конца текста) символы, затем 3, 6, 9, 12-й и т.д.
// Зашифровать заданный текст

public class Main {
    public static void main(String[] args) throws IOException {
        var file = new File("Coder.txt");
        var reader = new BufferedReader(new FileReader(file));

        String line = reader.readLine();
        String Final1="";
        while (line != null) {
            Final1 = Final1.concat(line);
           // Final1 = Final1.concat(" ");
            line = reader.readLine();
        }
        int dif = coding(Final1);
        System.out.println("The coding process is ended!");
        reader.close();
        decoding(dif);
        System.out.print("The decoding process is ended!");
    }
    public static int coding(String listoflines) throws IOException{
        var file2 = new File("Result.txt");
        var bf = new BufferedWriter(new FileWriter(file2));
        var array = listoflines.toCharArray();
        int l=0;
        for (int i=0;i<3;i++) {
            for (int k=0;k<array.length;k+=3) {
                bf.write(array[k]);
                bf.flush();
                l++;

            }
            System.out.println(l);
            array = Arrays.copyOfRange(array, 1, array.length);
        }
        bf.close();
        return l/3;
    }
    public static void decoding(int step) throws IOException{
        var file = new File("Result.txt");
        var reader = new BufferedReader(new FileReader(file));

        var file2 = new File("decoder.txt");
        var bf = new BufferedWriter(new FileWriter(file2));

        String line = reader.readLine();
        var array1 = line.toCharArray();
        for (int k=0;k<step;k++) {
            for (int i=0;i<3;i++) {
                if (step*i+k>= array1.length) {
                    break;
                }
                bf.write(array1[step*i+k]);
                bf.flush();
            }
        }
        bf.close();
        reader.close();
        return;
    }
}