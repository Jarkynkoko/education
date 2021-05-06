package Loops;

import java.util.Scanner;

public class sumAllValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        double average = 0;

        int sumVallue=0;

        for (int i= num1; i <= num2;i++){
          sumVallue += i;
           average = (num1+num2)/2;
        }
        System.out.println("The sum of " +num1 + " to " + num2 + " is " + sumVallue);
        System.out.println("The average is: "+average );
    }
}
