package String;

import java.util.Scanner;

public class accauntNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");
        String num = input.nextLine();
        String  firstNum = num.substring(0,1);
        boolean invalid = !firstNum.equals("5") || !firstNum.equals("2");

        if (invalid){
            System.out.println("Invalid account number");
        }else{

            if (firstNum.equals("5")){
                if (num.length() == 10)
                System.out.println("Valid 5 accouny");
            } else {
                System.out.println("Invalid 5 account");
            }
        }
        if (firstNum.equals("2")){
            if (num.length() == 7)
                System.out.println("Valid 2 account");
        } else {
            System.out.println("Invalid 2 account");
        }
    }


       }


