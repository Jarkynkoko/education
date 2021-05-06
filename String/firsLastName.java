package String;

import java.util.Scanner;

public class firsLastName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      /*  User will be asked to enter two full names ( first and last).
       You will determine if the two entered people are relatives by comparing their last names.
       */
        String name1 = scanner.nextLine().trim();
        String name2 = scanner.nextLine().trim();
        String last1 = name1.substring(name1.indexOf(" ")+1);
        String last2 = name2.substring(name2.indexOf(" ")+1);

        if (last1.equals(last2)){
            System.out.println("relatives");
        }else {
            System.out.println("You are not");
        }





        }




    }

