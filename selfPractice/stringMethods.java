package selfPractice;

import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "My favorite fruit is an apple";
        String fruit = "orange";
        String word = "My";
        String word2 = "";

        System.out.println(str.equals(fruit));
        System.out.println(str.equals(word));
        System.out.println(word.equals(str));
        System.out.println(fruit.equals(word));
        System.out.println(!(fruit.equals(word)));

        System.out.println(fruit.length());
        System.out.println();



       /* System.out.println(word.charAt(1));
        System.out.println(str.charAt(7));
        System.out.println(fruit.charAt(-2));

        System.out.println(str.isEmpty());
        System.out.println(word2.isEmpty());

        System.out.println(str.contains(word));
        System.out.println(str.contains(fruit));*/

    }
}
