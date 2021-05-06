package UdemyJava;

import java.util.Arrays;
import java.util.Scanner;

public class arrayExercise4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] foods = new String[3];
        int count = 0;
        System.out.println("Enter your five favorite foood: ");

        for (int i = 0; i < foods.length; i++){
            System.out.print("Food " + (i+1) + " :" );
            foods[i]  = scan.nextLine();
            count ++;

            if (count>=3) {
                System.out.println("NO more memory available");
            }
        }
        System.out.println("Your favorite foods are: ");
        for (int i = 0; i < foods.length; i++){

            System.out.println(foods[i]);
        }

    }
}
