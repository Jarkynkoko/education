package InternetPraktice;

import java.util.Scanner;

public class startHi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Your name:");
        String name = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("You have lived " + age + ". In another " +age + " years you will be " +(age*2) + " year old.");
        System.out.println(name.length() +" characters are in your name. ");




    }
}
