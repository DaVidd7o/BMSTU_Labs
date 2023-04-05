import java.io.*;
import java.util.*;

//7.	В зависимости от признака (0 или 1)
//        в каждой строке текста удалить указанный символ везде, где он встречается,
//        или вставить его после k-гo символа
public class Main {
    public static void main(String[] args) throws IOException {
        var in = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("Input a feature: 0 or 1");
            num = in.nextInt();
            if ((num == 0) || (num ==1)) {
                break;
            }
        }
        System.out.println("Input a letter for deletion or insertion");
        var letter = in.next().charAt(0);
        if (num==0) {
            deletion(letter);
            System.out.println("Deletion is done!");
        } else {
            System.out.println("Input a position for insertion");
            var pos = in.nextInt();
            insertion(pos,letter);
        }
    }
    public static void deletion(char Char) throws IOException {
        var file = new File("text.txt");
        var file2 = new File("Result.txt");
        var fr = new FileReader(file);
        var reader = new BufferedReader(fr);

        var bf = new BufferedWriter(new FileWriter(file2));
        String line = reader.readLine();
            while (line != null) {
                bf.write(line.trim().replaceAll(String.valueOf(Char), ""));
                bf.newLine();
                bf.flush();
                line = reader.readLine();
            }
    }
    public static void insertion(int sign,char Char) throws IOException {
        var file = new File("text.txt");
        var file2 = new File("Result.txt");
        var fr = new FileReader(file);
        var reader = new BufferedReader(fr);

        var bf = new BufferedWriter(new FileWriter(file2));
        String line = reader.readLine();
        while (line != null) {
            var str = line.substring(0, sign) + Char + line.substring(sign + 1);
            bf.write(str);
            bf.newLine();
            bf.flush();
            line = reader.readLine();
        }
    }
}