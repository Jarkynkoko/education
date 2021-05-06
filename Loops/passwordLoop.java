package Loops;

import java.util.Scanner;

public class passwordLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "secret478";

        for (;;){
            System.out.println("PLease enter your password:");
            String userPass = scan.nextLine();
            if (password.equals(userPass)){
                System.out.println("Welcome!");
                break;
                }
            }



        }
    }
