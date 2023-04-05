import java.io.*;
import java.util.*;

//8.	Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами.
//        Между последовательностями подряд идущих букв оставить хотя бы один пробел.
public class Main {
    public static void main(String[] args) throws IOException {
        var file = new File("text2.txt");
        var file2 = new File("Result2.txt");
        var fr = new FileReader(file);
        var reader = new BufferedReader(fr);

        var bf = new BufferedWriter(new FileWriter(file2));
        String line = reader.readLine();
        var regex = "(?<=[a-zA-z])[[^a-zA-Z]&&[^ ]]+(?=[a-zA-z])";
        var regex1 = "[[^a-zA-Z]&&[^ ]]+";
        while (line != null) {
            var str = line.trim().replaceAll(regex, " ");
            bf.write(str.replaceAll(regex1,""));
            bf.newLine();
            bf.flush();
            line = reader.readLine();
        }
        System.out.println("The Deletion is done!");
    }
}