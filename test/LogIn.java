package test;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String passName = "Daniel";
        String passCode = "kokoeva88";

        System.out.println("Enter your usename:");
        String useName = input.nextLine();


        if (useName.equals(passName)) {

            System.out.println("Please enter your password");
            String useCode = input.nextLine();
            if(useCode.equals(passCode)){
                System.out.println("Successful login");
            }
            else {
                System.out.println("Wrong password");
            }
        }

        else{
            System.out.println("Invalid usename.Try again");
        }

    }
}
