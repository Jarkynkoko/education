package String;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = "October";
        System.out.println("Enter the month: ");
        String user = scanner.nextLine();
        //String b = user.toUpperCase();

        if (user.equalsIgnoreCase(month)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        /* String month1 = month.toLowerCase();
        System.out.println(month1.equels("october"))
         */

        /*boolean check = b.equalsIgnoreCase(month);
        System.out.println(check);
        */



    }
}
