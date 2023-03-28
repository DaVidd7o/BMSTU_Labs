
// В каждом слове стихотворения Николая Заболоцкого заменить первую букву слова на прописную.
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("Zabolo.txt");

        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        FileWriter fw = new FileWriter("Result.txt");
        char [] a = new char[256];

        String line = reader.readLine();
        while (line != null) {
            String words[] = line.split(" ");
            words[0] = words[0].toLowerCase();
            String lineNew = String.join(" ",words);
            lineNew = lineNew.concat("\n");
            fw.write(lineNew);
            line = reader.readLine();
        }
        fr.close();
        fw.close();

    }
}