package Practice;

import java.util.Scanner;

public class PreIncrementing {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Enter your gender");
        char gender = input.nextLine().charAt(0);

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter phone");
        long phoneNumber = input.nextLong();

        System.out.println("Enter your gra");
        double gra = input.nextDouble();

        System.out.println("Name" + name);
        System.out.println("Gender" + gender);
        System.out.println("Your age " + age);
        System.out.println("Phone number " + phoneNumber);
        System.out.println("GRA" + gra);




    }

}
