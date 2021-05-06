package Loops;

import java.util.Scanner;

public class backwardWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word:");
        String word = scan.nextLine();

        String rev = "";

        for (int i = word.length()-1; i >=0; i--){
               rev+= word.charAt(i); // rev = rev + word.chatAt(i);

        }
        System.out.println (rev );

    }
}
