package test;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 integer number:");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max = 0;

        if (num1 > num2 && num1 > num3){
            System.out.println("MAx number is: " + num1);
            max = num1;

        }

        else if (num2 > num1 && num2 > num3) {
            System.out.println("Max number is: " + num2);
            max = num2;
        }

        else if (num3 > num1 && num3 > num2){
            System.out.println("Max number is: " + num3);
            max = num3;
        }

        else if (num1 == num2 && num1 == num3){
            System.out.println("All number are equal" + max);
        }



    }
}
