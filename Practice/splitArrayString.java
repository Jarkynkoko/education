package Practice;

import java.util.Arrays;

public class splitArrayString {
    public static void main(String[] args) {

        String  str = "Aya and Daniel are our children";
        String [] words = str.split(" ");
        System.out.println("There are " + words.length + " words in the sentence");
        int count = 0;

        for (String word: words){
            count++;
        }
        System.out.println(count + " words in the sentence");



    }
}
