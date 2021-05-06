package SwitchRandom;

import java.util.Random;
import java.util.Scanner;
//import java.until*;

public class guessNumberIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();


        int randomNumber = random.nextInt(10);
        randomNumber++;// this is how I get the range to be 1-10
        System.out.println("Guess the number ");
        int guessNum = input.nextInt();
        System.out.println("The random number is: " + randomNumber);
        if (randomNumber == guessNum) {
            System.out.println("Good guess");
        }else if (guessNum < 1 || guessNum > 10){
            System.out.println("Not valid guess");
        } else if (guessNum > randomNumber){
            System.out.println("To high");
        }else if (guessNum < randomNumber){
            System.out.println("Too low");
        }

    }
}
