import java.io.*;
import java.util.*;

//7.	Текст шифруется по следующему правилу: из исходного текста выбирается 1, 4, 7, 10-й и т.д. (до конца текста) символы,
// затем 2, 5, 8, 11-й и т.д. (до конца текста) символы, затем 3, 6, 9, 12-й и т.д.
// Зашифровать заданный текст

public class Main {
    public static void main(String[] args) throws IOException {
        var file = new File("text4.txt");
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
        int price = 12;
        System.out.println("The price of one word is 12 dollars");
        System.out.print("The final price of your telegram is: ");
        System.out.println(PriceTelegram(list,price));
    }
    public static int PriceTelegram(ArrayList listofwords,int cost) {
        int price = listofwords.size()*cost;
        return price;
    }
}