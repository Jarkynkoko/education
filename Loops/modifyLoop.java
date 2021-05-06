package Loops;

import java.util.Scanner;

public class modifyLoop {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
        String pass = "secret435";



        for (int i = 1; i < 4; i++){
            System.out.println("Enter your pass");
            String userPass = scan.nextLine();

            if (!userPass.equals(pass)){
              continue;

            }else {
                System.out.println("Welcome");
            }


            }
        }

    }

