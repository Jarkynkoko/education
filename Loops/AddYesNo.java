package Loops;

import java.util.Scanner;

public class AddYesNo {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        int num =0;
        System.out.println("would you like to add 1");
        String userAdd = i.nextLine();

        while (userAdd.startsWith("y")){//(userAdd.equals("yes")|| userAdd.equals("y"))
            num++;
            System.out.println("would you like to add 1");
            userAdd = i.nextLine();
            }
        System.out.println("Your number: "+num);


        }
    }

