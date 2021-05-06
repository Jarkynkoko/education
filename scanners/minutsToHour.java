package scanners;

import java.util.Scanner;

public class minutsToHour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minutes");
        int mins = scanner.nextInt();
        int hours = mins/60;
        int remaindingMins = mins % 60;
        System.out.println(mins + "minutes is " + hours + "hours and "
                + remaindingMins + "minutes" );

    }
}
