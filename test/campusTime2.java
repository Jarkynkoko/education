package test;

import java.util.Scanner;

public class campusTime2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check;
        int time;

        System.out.println("Enter the time your are checking: ");
        time = input.nextInt();

        if (time >= 8 && time <= 23){
            check = true;
        }else {
            check = false;
        }
        if (check){
            System.out.println("campus is open");
        }else {
            if (time < 0 || time >= 24){
                System.out.println("Invalid time");
            }else {
                System.out.println("Campus is closed");
            }
        }
    }
}
