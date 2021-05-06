package selfPractice;

import java.util.Scanner;

public class enterCampusTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the campus open time: ");
        int enterTime = scanner.nextInt();

        if (enterTime >= 8 && enterTime <= 23){
            System.out.println("The campus is open");
        } else if (enterTime > 23){
            System.out.println("Invalid time");
        }else {
            System.out.println("Is closed");
        }
    }
}
