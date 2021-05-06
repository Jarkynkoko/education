package Loops;

import java.util.Scanner;

public class shapeNestedLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");

        int user = scan.nextInt();

        for (int i = 0; i < user; i ++ ){

            for ( int j = 0; j < user; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
