import java.util.*;
import java.util.Stack;

//8.	Задана строка, состоящая из символов '(', ')', '[', ']', '{', '}'.
//        Проверить правильность расстановки скобок. Использовать стек.
public class Main {

    public static boolean parsing(String st) {
        var symbols = st.toCharArray();
        HashMap<String, String> test = new HashMap<>();
        test.put("{","}");
        test.put("[","]");
        test.put("(",")");
        var list = new Stack<>();
        for (int i = 0; i < symbols.length; i++) {
            String symbol = st.substring(i, i + 1);
            if (test.containsKey(symbol)) {
                list.push(symbol);
                System.out.print("Stack in");
                System.out.println(symbol);
                continue;
            }
            else if (test.get(list.peek()).equals(symbol)) {
                System.out.print("Stack out");
                System.out.println(symbol);
                list.pop();
            }
        }
        if (!list.empty()){
            System.out.println("Wrong");
            list.clear();
            return false;
        }
        else return true;
    }
    public static void main(String[] args) {
        var str = "({[]})";
        System.out.println(parsing(str));
    }
}