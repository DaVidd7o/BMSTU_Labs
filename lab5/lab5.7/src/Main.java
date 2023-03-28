import  java.io.*;
import java.nio.file.Files;
import  java.util.*;
//Прочитать текст Java-программы и удалить из него все
//“лишние” пробелы и табуляции, оставив только необходимые для разделения операторов
public  class     Main {
    public static void main(String[] args) throws IOException {
        FileReader fr  =  new FileReader("src/Main.java");
        BufferedReader reader = new BufferedReader(fr);
        BufferedWriter bf = null;
            File filePath = new File("DIR");
                filePath.mkdir();
        File       file = new File(filePath + "\\test.txt");
        try {
            file.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        //FileWriter fw = new FileWriter(file);
        String line = reader.readLine();
        bf = new BufferedWriter(new FileWriter(file));
        String regex = "\\s+";
        String replac = " ";
        String tab = "";
        while (line != null) {
            String Str = line.trim();
            String filtered = Str.replaceAll(regex, replac);
            filtered = (new StringBuilder(filtered)).insert(0, tab).toString();
            if ((filtered.endsWith("{"))) {
                tab = tab.concat("\t");
            }
            else if (filtered.endsWith("}")) {
                filtered = filtered.substring(1);
                tab = tab.substring(1);
            }
            bf.write(filtered);
            bf.newLine();
            bf.flush();
            line = reader.readLine();
        }
    }
}