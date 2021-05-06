package UdemyJava;

import java.util.Locale;
import java.util.Scanner;

public class ScannerLesson {
    public static void main(String[] args) {

        /*System.out.println("4.5 - 2.7");
        System.out.format("I have %d cats, %d dogs and %s ", 3, 7, "panther");
        System.out.format("\nI have %.1f cats, %d dogs and %s ", 3.6, 7, "panther");*/
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println(userName + " is a nice name");

        System.out.println("How old are you " + userName + "?");
        int userAge = input.nextInt();
        System.out.println("Your name is " + userName + ", and your are " + userAge + " year old") ;

        System.out.println("\nHow tall are you in meters?");
       double userHeight = input.nextDouble();
        System.out.println("You are " + userHeight + " meters tall");

        System.out.println("Enter your bill total:");
        double bill = input.nextDouble();

        System.out.println("Enter number of people:");
        int people = input.nextInt();


        double split = bill/people;

        System.out.format(" Your bill split between " + people + "," + "for everyone: " + split);









    }
}
