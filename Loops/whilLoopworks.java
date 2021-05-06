package Loops;

import java.util.Scanner;

public class whilLoopworks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scan.nextLine();
        while (name.startsWith("j")){
            System.out.println("enter your name");
            name = scan.nextLine();
        }
    }
}
