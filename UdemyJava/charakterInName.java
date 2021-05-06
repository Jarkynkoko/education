package UdemyJava;

import java.util.Scanner;

public class charakterInName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println(name.length() + " characters are in your name");

    }
}
