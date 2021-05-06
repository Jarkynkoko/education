package String;

import java.util.Scanner;

public class indexOfWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*1) You have a String with the following value:
        -> “Cybertek is located in Des Plaines”
        The user is asked to enter a part of the string they are
         looking for. Find the position of the String the user is looking for and print it.
                Ex:
        > Input: “located”
         > Output: "located starts at: " 12*/

        System.out.print("Our sentence: ");
        System.out.println("Cybertek is located in Des Plaines");


        String sentence = "Cybertek is located in Des Plaines";
        System.out.println("Print some word from sentence: ");
        String word = scanner.nextLine();
        System.out.println("located starts at: " + (sentence.indexOf(word)));
    }
}
