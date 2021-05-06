package Practice;

import java.util.Scanner;

public class PracticeBoolean {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int charOne = in.nextInt();
        int charTwo = in.nextInt();
        boolean b = charOne > charTwo;
        System.out.println(b);
        System.out.println("\nTask 2: ");
        boolean check = in.nextBoolean();

        System.out.println(!check);





    }
}
