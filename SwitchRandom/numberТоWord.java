package SwitchRandom;

import java.util.Scanner;

public class numberТоWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String word = "";

        switch (number){
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "fоur";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            default:
                word = "Invalid number";

        }
        System.out.println(word);

    }
}

