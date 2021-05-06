package Practice;

import java.util.Scanner;

public class vendingMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int change, remain, quarters, dimes,nickels, pennies;
        System.out.println("Enter your change");

        change = input.nextInt();
        remain = change;

        quarters = change / 25;// quarter --->> 2
        remain = remain % 25;// 68-50 =18
        dimes = remain / 10;//8
        int remain2 = remain % 10;// 8/ 5=1

        nickels = remain2 / 5;//
        int remain3 = remain2 % 5;

        pennies = remain3;

        System.out.println("Your change Of " + change + "was to convert to ");
        System.out.println("Quarters " + quarters);
        System.out.println("Dimes "+ dimes);
        System.out.println("Nickels " + nickels);
        System.out.println("Pennies " + pennies);

















    }
}
