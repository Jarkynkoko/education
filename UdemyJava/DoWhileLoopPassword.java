package UdemyJava;

import java.util.Scanner;

public class DoWhileLoopPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         String userPass;

        do {

            System.out.println("Enter the password:");
            userPass = scan.nextLine();
        }while (userPass.equals("shark50"));
        System.out.println("ACCESS APPROVED");


        }

    }
