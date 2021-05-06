package Loops;

import java.util.Scanner;

public class lettersAtoZ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        char letter = scan.nextLine().toUpperCase().trim().charAt(0);
        if (letter >= 65 && letter <= 90){
            while (letter!=91){
                System.out.println(letter++);
            }
        }else {
            System.out.println("Not valid letter");
        }

    }
}
