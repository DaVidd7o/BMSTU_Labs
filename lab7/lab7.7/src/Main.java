import java.io.*;
import java.util.*;

//7.	Подсчитать, сколько слов в заданном тексте начинается с прописной буквы.
//8.	Подсчитать, сколько раз заданное слово входит в текст.
public class Main {
    public static void main(String[] args) throws IOException {
        var file = new File("text7.txt");
        var reader = new BufferedReader(new FileReader(file));

        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (line != null) {
            for (String element: line.split("\\s")) {
                list.add(element);
            }
            line = reader.readLine();
        }
        reader.close();
        System.out.println("The count of the lowercase words");
        System.out.println(lowercase(list));
        System.out.println("Input the main word");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        System.out.printf("The count of the main word in the text: ",str1);
        System.out.println(entryword(list,str1));
    }
    public static int lowercase(ArrayList listofwords) {
        int count = 0;
        for (Object str : listofwords) {
            char[] array=str.toString().toCharArray();
            if(Character.isLowerCase(array[0])) {
                    count++;
            }
        }
        return count;
    }
    public static int entryword(ArrayList listofwords,String word) {
        int count = 0;
        for (Object str : listofwords) {
            if (str.toString().equals(word)) {
                count++;
            }
        }
        return count;
    }
}