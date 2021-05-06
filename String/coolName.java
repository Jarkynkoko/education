package String;

import java.util.Locale;
import java.util.Scanner;

public class coolName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /*       User is asked to enter their name. You will check if it is a cool name.
                > If the name begins with an ‘a’ or a ‘z’ print “Your name is cool”
                 > Otherwise print “Sorry not a cool name”
        */

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        if (name.substring(0, 1).toLowerCase().equals("a") || name.substring(0, 1).toLowerCase().equals("z")) {
            System.out.println("cool");
        } else {
            System.out.println("not cool");
        }

        // if (name.charAt(0) == 'a' || name.charAt(0)== 'z') also works

        /*if (name.startsWith("A") || name.startsWith("a") || name.startsWith("Z") || name.startsWith("z")) {
            System.out.println(name + " is cool name");
        } else {
            System.out.println("Sorry not a cool name");
        }*/

    }

    }

