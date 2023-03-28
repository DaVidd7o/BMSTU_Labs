import  java.io.*;
import  java.util.*;
//Из текста Java-программы удалить все виды комментариев
public  class     Main {
    public static void main(String[] args) throws IOException {
        FileReader fr  =  new FileReader("src/Main.java");
        BufferedReader reader = new BufferedReader(fr);
        BufferedWriter bf;
        File filePath = new File("DIR");
        filePath.mkdir();
        File file = new File(filePath + "\\test5.8.txt");
        /*Из текста Java-программы удалить все виды комментариев
        Из текста Java-программы удалить все виды комментариев
        Из текста Java-программы удалить все виды комментариев
        Из текста Java-программы удалить все виды комментариев
        Из текста Java-программы удалить все виды комментариев
        Из текста Java-программы удалить все виды комментариев*/
        try {
            file.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        //FileWriter fw = new FileWriter(file);
        String line = reader.readLine();
        boolean multiComment = false;
        bf = new BufferedWriter(new FileWriter(file));
        while (line != null) {
            line = line.trim();
            if (line.startsWith("//") && !multiComment ) {
                line = reader.readLine();
                continue;
            } else if (line.startsWith("/*") || (multiComment)) {
                multiComment=true;
                if (line.endsWith("*/")) {
                    multiComment=false;
                }
                line = reader.readLine();
                continue;
            }
            bf.write(line);
            bf.newLine();
            bf.flush();
            line = reader.readLine();
        }
    }
}