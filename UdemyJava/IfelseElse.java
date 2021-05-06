package UdemyJava;

import java.util.Scanner;

public class IfelseElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rollercoaster");
        System.out.print("Enter your height in centimeters: ");
        int height = scanner.nextInt();

        /*if (height < 150){
            System.out.println("Sorry, you do not meet height requirements ");
        }else if (height > 200 ){
            System.out.println("Sorry, you are too tall");
        } else {
            System.out.println("Height accepted.Go ahead!");
        }*/


        /*if (height < 150 || height > 200){
            System.out.println("Sorry, you do not meet height requirements");
        }else {
            System.out.println("Height accepted go ahead!");
        }*/

        if (150 < height && height < 200){
            System.out.println("Height accepted.Go ahead!");
        }else {
            System.out.println("You do not meet height requirements");
        }





    }
}
