package scanners;

import java.util.Scanner;

public class Age {
    public static void main(String[]args){
         Scanner input = new Scanner(System.in);
        System.out.println("Enter your height");
         double userHeight = input.nextDouble();
        System.out.println("You are " + userHeight + " meters tall");


         System.out.println("How old?");
        int giveAge = input.nextInt();
        System.out.println("Your age is " + giveAge);
        System.out.println("How old will you retire?");
        int secondAge = input.nextInt();
        System.out.println("you will retire, when you will  " + secondAge);
        System.out.println("Because you are: " + giveAge + " year old,");
        System.out.println("and will retire in: " + secondAge);







    }
}
