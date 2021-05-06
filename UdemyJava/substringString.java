package UdemyJava;

import java.util.Scanner;

public class substringString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = input.nextLine();
        int space = sentence.indexOf("");
        System.out.println(sentence );

    }
}
