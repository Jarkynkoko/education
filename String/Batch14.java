package String;

import java.util.Scanner;

public class Batch14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  word = "java";

        String fixed = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        System.out.println(fixed);


        String word2 = "Kevin fell from his bike";
        int from = word2.indexOf(" from");
        String word3 = word2.substring(0,from);
        System.out.println(word3);
        System.out.println(word2.substring(from+1) + " " + word3);
        System.out.println(word2.substring(from) + " " + word3);
        System.out.println(word2.substring(from-1) + " " + word3);

    }
}
