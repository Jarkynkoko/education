package Loops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter your adress:");
        String adress= in.nextLine();
        int count = 0;
        while (adress.contains("il")){
          count++;

            System.out.println("enter your adress");
            adress= in.nextLine();
        }
        System.out.println(count);
    }
}
