import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the n words to search:");
        String str1 = in.nextLine();
        String[] words = str1.split(" ");
        for(String word : words){
            boolean NotEqual =true;
            char[] helloArray = word.toCharArray();
            for (int i=1;i<helloArray.length-1;i++) {
                if (helloArray[i-1] == helloArray[i]) {
                    NotEqual =false;
                    break;
                }
            }
            if (NotEqual) {
                System.out.print("The right word: ");
                System.out.println(word);
                break;
            }
        }
        //in.close();
        System.out.print("Input the n words to search for a palindromes :");
        String str2 = in.nextLine();
        String MainResultString = "";
        int k =0;
        String[] Palindrome_words = str2.split(" ");
        for(String word : Palindrome_words){
            String result = "";
            char[] Numbers_Array = word.toCharArray();
            for (int i=0;i<Numbers_Array.length;i++) {
                result = word.charAt(i) + result;
            }
            if (word.equals(result) && (k <= 1)) {
                MainResultString = word;
                k++;
            }
        }
        System.out.print("The second palindrome string is: ");
        System.out.println(MainResultString);
        System.out.print("Developer: Grigoryan David. Date of issue of the task: ");
        String Date_issue = "17 ферваля 2023";
        System.out.println(Date_issue);
        System.out.print("Date of completion of the task: ");
        Date date_submit = new Date();
        System.out.println(date_submit);
    }
}