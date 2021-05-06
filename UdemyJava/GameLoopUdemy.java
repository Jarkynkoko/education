package UdemyJava;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameLoopUdemy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Create a game where the program picks a random number from 1 to 100
         and the player has to guess it. Each time the player makes a guess,
         print “HIGHER” if the guess was too low or “LOWER” if the guess was too high.
          If the player correctly guesses the number, print “CORRECT”, then end the game.

        You can use the line of code below which produces a random number from 1 to 100,
         and stores it in randomNumber.*/

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 100)+1;
        System.out.println(randomNumber);

        int guess=0;
        int count=0;

        do{
            System.out.println("guess the number");
            guess = scan.nextInt();
            count++;
            if (guess>randomNumber){
                System.out.println("LOWER");
            }else if (guess<randomNumber){
                System.out.println("HIGHER");
            }else {
                System.out.println("CORRECT! You random number :"+randomNumber+", you got it in "+count);
            }
        }while (guess!=randomNumber);



    }
}
