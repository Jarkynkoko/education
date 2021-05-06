package Loops;

import java.util.Scanner;

public class transactionBalance {
    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
            int balance =1500;
            int transBal;
            int dec =0;

            while (0 < balance){


                System.out.println("enter transaction amount:");
                transBal= scan.nextInt();

                if (transBal <= balance){
                    System.out.println("Item purchased");
                    balance -=transBal;
                    dec =0;
                }else {
                    System.out.println("Card decline ");
                    dec++;
                }
                if (dec ==3){
                    System.out.println("Card locked");
                    break;
                }

            }
        if (balance ==0){
            System.out.println("You are broke");
        }

    }
}
