package Loops;

import java.util.Random;

public class randomNested {
    public static void main(String[] args) {
        Random random = new Random();

        String number = "";

        for (int i = 0; i <6; i++){
            int ranNum = random.nextInt(10);
            /*     if (number.contains(ranNum+ "")){
                ranNum = random.nextInt(10);
           } */
            while (number.contains(ranNum + "")){
                ranNum = random.nextInt(10);
            }
            number += ranNum;
        }
        //int sixNumber = Integer.valueOf(number);if we want to convert from string to a number.
        System.out.println(number);

    }
}
