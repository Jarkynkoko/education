package test;

import java.util.Scanner;

public class numberOfOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Print out 5 integer number: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();
        int evens = 0;
        int odds = 0;

        if (number1 % 2 == 0){
            evens++;
        }
        else {
            odds ++;
        }

        if (number1 % 2 == 0){
            evens++;
        }
        else {
            odds ++;
        }
        if (number2 % 2 == 0){
            evens++;
        }
        else {
            odds ++;
        }
        if (number3 % 2 == 0){
            evens++;
        }
        else {
            odds ++;
        }
        if (number4 % 2 == 0){
            evens++;
        }
        else {
            odds ++;
        }
        if (number5 % 2 == 0){
            evens++;
        }
        else {
            odds ++;
        }

        System.out.println("Total even numbers: " + evens);
        System.out.println("Total odd numbers: " + odds);










    }
}
