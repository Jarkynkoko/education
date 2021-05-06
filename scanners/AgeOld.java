package scanners;

import java.util.Scanner;

public class AgeOld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your age: ");
        int yourAge = scanner.nextInt();
        int retirementAge = 65;
        int result = retirementAge - yourAge;

        System.out.println("because you are " + yourAge  + " you will retire in " + retirementAge);

    }
}
