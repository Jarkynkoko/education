package Loops;

import java.util.Random;
import java.util.Scanner;

public class GuessLoopRandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        int ranNumber = ran.nextInt(100)+1; // random gives numbers from 0 to 99 and we add 1 to have 100;
        int guess=0;
        int count=0;
        System.out.println(ranNumber);

        do {
             System.out.println("Guess the number");
              guess= scan.nextInt();
              count++;

             if (ranNumber > guess){
                 System.out.println("You guessed low");
             }else if (ranNumber< guess){
                 System.out.println("Too high");
             }else {
                 System.out.println("You guessed right after "+ count+" tries");
             }

         }while (ranNumber !=guess);



        }

    }

