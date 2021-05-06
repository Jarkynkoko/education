package UdemyJava;

import java.util.Scanner;

public class udemyTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println(" You have lived " + age + "." );
        int retireAge = age += 3;
        System.out.println("In another 3 years you will be " +  retireAge );




    }
}
