
// Определить частоту повторяемости букв и слов в стихотворении Александра Пушкина
import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("Pushkin.txt");
        File file2 = new File("Result.txt");

        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        FileWriter fw = new FileWriter("Result.txt");
        Map<String, Integer> uniqueWords = new HashMap<String, Integer>();
        Map<Character, Integer> uniqueLetters = new HashMap<Character, Integer>();

        String line = reader.readLine();
        while (line != null) {
            String words[] = line.split(" |, |; " );

            for (String word: words) {
                word = word.toLowerCase();
                if (word=="") {
                    break;
                } else if (!uniqueWords.containsKey(word)) {
                    uniqueWords.put(word,1);
                }
                else {
                    uniqueWords.put(word,uniqueWords.get(word)+1);
                }
                char[] str = word.toCharArray();
                for (int i=0;i<word.length();i++) {
                    if (!uniqueLetters.containsKey(str[i])) {
                        uniqueLetters.put(str[i],1);
                    }
                    else {
                        uniqueLetters.put(str[i],uniqueLetters.get(str[i])+1);
                    }
                }

            }
            line = reader.readLine();
        }
        BufferedWriter bf = null;
        try {
            // create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file2));

            // iterate map entries
            for (Map.Entry<String, Integer> entry :
                    uniqueWords.entrySet()) {

                // put key and value separated by a colon
                bf.write(entry.getKey() + ":"
                        + entry.getValue());

                // new line
                bf.newLine();
            }
            bf.flush();
            bf.newLine();
            for (Map.Entry<Character, Integer> entry :
                    uniqueLetters.entrySet()) {

                // put key and value separated by a colon
                bf.write(entry.getKey() + ":"
                        + entry.getValue());

                // new line
                bf.newLine();
            }
            bf.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        fr.close();
        fw.close();

    }
}