package UdemyJava;

import java.util.Scanner;

public class VipEnter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The VIP Lounge");
        System.out.print("Age: ");
        int age = scanner.nextInt();



        if (age >= 18){
            System.out.print("Do you have pass yes/no: ");
            String vipReplay = scanner.next();
            if (vipReplay.equals("yes") || age >= 70){
                System.out.println("Thanks go on in");
            }else {
                System.out.println("You either be over 70 or need to have VIPpass  ");
            }
        } else {
            System.out.println("You must be over 18");
        }

        /*if ((age >= 18 && vipReplay.equals("yes")) || age >= 70){
            System.out.println("Thanks go on in");
        }else {
            System.out.println("Sorry no can do");
        }*/
    }
}
