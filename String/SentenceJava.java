package String;

import java.util.Scanner;

public class SentenceJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = "Java is a fun language";

        String srt = (sentence.replace("Java", ""));
        System.out.println(srt + " Java");

        System.out.println("Enter your sentence");
        String sen = input.nextLine();

        int space = sen.indexOf(" ");
        String firstWord = sen.substring(0,space);
        String reamin = sen.substring(space + 1);
        System.out.println(reamin + " " + firstWord);



    }
}
