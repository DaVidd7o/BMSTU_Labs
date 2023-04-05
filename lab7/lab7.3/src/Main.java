import java.io.*;
import java.util.*;
//В тексте найти и напечатать все слова максимальной и все слова минимальной длины.
public class Main {
    public static void main(String[] args) throws IOException {
        var file = new File("text3.txt");
        var fr = new FileReader(file);
        var reader = new BufferedReader(fr);

        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (line != null) {
            for (String element: line.split("\\s")) {
                list.add(element);
            }
            line = reader.readLine();
        }
        System.out.println("The longest words");
        System.out.println(LongestWords(list));
        System.out.println("The smallest words");
        System.out.println(SmallestWords(list));
    }
    public static ArrayList<String> LongestWords(ArrayList listofwords) {
        ArrayList<String> listfinalBIG = new ArrayList<>();
        int longest_length = 0;
        for (Object str : listofwords) {
            int length = str.toString().length();
            if (length > longest_length) {
                longest_length = length;
                listfinalBIG.clear();
            }
            if (length == longest_length) {
                listfinalBIG.add(str.toString());
            }
        }
        return listfinalBIG;
    }
    public static ArrayList<String> SmallestWords(ArrayList listofwords) {
        ArrayList<String> listfinalSMALL = new ArrayList<>();
        int smallest_length = 100;
        for (Object str : listofwords) {
            int length = str.toString().length();
            if (length < smallest_length) {
                smallest_length = length;
                listfinalSMALL.clear();
            }
            if (length == smallest_length) {
                listfinalSMALL.add(str.toString());
            }
        }
        return listfinalSMALL;
    }
}