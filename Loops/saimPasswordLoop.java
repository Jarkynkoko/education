package Loops;

import java.util.Scanner;

public class saimPasswordLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass = "secret234";

         for (int attempts =0; ;attempts++){
             if (attempts ==3){
                 System.out.println("Your account is locked.Try after 5 hours.");
                 break;
             }
             System.out.println("PLease enter your password:");
             String userPass = scan.nextLine();
             if (pass.equals(userPass)){
                 System.out.println("Welcome!");
                 break;
             }
        }
    }
}
