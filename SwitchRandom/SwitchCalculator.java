package SwitchRandom;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number one");
        double num1 = input.nextDouble();
        System.out.println("Enter the number two");
        double num2 = input.nextDouble();

        input.nextLine();
        System.out.println("Enter the operator:");
        String op = input.nextLine();
        double result = 0;
        boolean valid  = true;

        switch (op){

            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
            default:
                System.out.println("Invalid operator");
                valid = false;

        }
        if (valid){
            System.out.println("" + num1 + op + num2 + " = " + result);
        }
    }

}
