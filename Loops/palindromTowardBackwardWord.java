package Loops;

import java.util.Scanner;

public class palindromTowardBackwardWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word");
        String word = scan.nextLine();
        String backward = "";


        for (int i= word.length()-1;i>=0;i--){
            backward+=word.charAt(i);

        }
        System.out.println(backward);



        if (backward.equals(word)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
