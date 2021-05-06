package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class numberCarsLoopArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of car: ");
        int size = input.nextInt();
        input.nextLine();

        String [] myCars = new String[size];

        for (int i = 0; i < myCars.length; i++){

            System.out.println("Enter the car "+ (i+1) + " : ");
            String  car = input.nextLine();
            myCars[i] = car;

        }
        System.out.println(Arrays.toString(myCars));


        }
    }

