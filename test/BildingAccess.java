package test;

import java.util.Scanner;

public class BildingAccess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println(" Enter your age ");
        int age = input.nextInt();

        if (age < 0 || age > 100){
            System.out.println("Invalid age");
        }else if( age>= 30){
            System.out.println("Welcome");
        }else{
            System.out.println("Try again when you are 30");
        }




    }
}
