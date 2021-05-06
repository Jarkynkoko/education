package scanners;

import java.util.Scanner;

public class task2date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Month");
        int month = scanner.nextInt();
        System.out.println("Day");
        int day = scanner.nextInt();
        System.out.println("Year");
        int year = scanner.nextInt();

        String results = "" + month + "/" + day  + "/" + year;

        System.out.println(results);

    }
}
