package Loops;

import java.util.Locale;
import java.util.Scanner;

public class wordCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word:");
        String word = scan.nextLine();
        //StringBuilder checked = new StringBuilder();
        String checked = "";

        for(int i=0; i < word.length(); i++) {
            int count = 0;

            if(!checked.contains(word.charAt(i) + "")) {
                for (int j = 0; j < word.length(); j++) {

                    if (word.charAt(i) == word.charAt(j)) {
                        count++;
                    }
                }
                  checked += word.charAt(i) + " ";
                System.out.println(word + " has " + count + " "  + word.charAt(i));
            }

        }
    }
}
