package test;

import java.util.Scanner;

public class ifElseCup {
    public static void main(String[] args) {
        int passCode = 3241;

        // write a program that asks to enter 4 digit integer via scanner
        // compare the passCode
        // if valid passCode print "Welcome to iPhone"
        // if invalid print "Try again!"
        // Check for Special case: in specific scenaria what gonna happen
        // 1. check for negative numbers. If entered passcode is negative
        // print "No Negative number "
        // 2. passcode must be only 4 digits.
        // if more than 4 digits then print "You must entered more digits"
        // if less than 4 digits print "You entered less digits"

        Scanner input = new Scanner(System.in);
            System.out.println("Write your pass code: ");
            int userPass = input.nextInt();

            if (userPass == passCode) {
                System.out.println("Welcome to your iPhone");
            }

            if (userPass < 0){
            System.out.println("No Negative number");
            }
            else if(userPass < 1000){
            System.out.println("You entered less digits");
            }
            else if(userPass > 9999){
            System.out.println("You entered more digits");
            }

            else {
                System.out.println("Wrong passcode!Try again!");
            }




    }
}
