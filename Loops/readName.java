package Loops;

import java.util.Scanner;

public class readName {
    public static void main(String[] args) {

        //for (int i = 0; i < 5; i++)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();



        for (int i =0; i < 15; i++){
            System.out.println(name + " " + i);
        }
        for (int i =0;i< name.length(); i++){
            System.out.println(name.charAt(i) + " for index " + i);
        }

    }
}
