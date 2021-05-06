package Arrays;

import java.util.Scanner;

public class LastContainsFirstArraysLoop {

    public static void main(String[] args) {

        String [] names = {"James", "Sam","Adam", "Elize", "Jamie", "Banzema", "Sandy"};

        for (int i = 0; i < names.length; i ++) {
            int lastChar = names[i].length()-1;
            System.out.println(names[i].charAt(lastChar));}

        System.out.println("--------------------------");

           for (int i = 0; i < names.length; i ++){

               if (names[i].endsWith("s")){

                   System.out.println(names[i]);
               }
           }
        System.out.println("-------------------------");

           for (int i = 0; i < names.length; i++){

               if (names[i].toLowerCase().contains("s")){
               System.out.println(names[i]);
               }
           }
               Scanner scan = new Scanner(System.in);
               System.out.println("Enter string: ");

               String user = scan.nextLine();

               for (int i = 0; i < user.length(); i++) {
                   if (names[i].contains(user)) {
                       System.out.println(names[i]);
                   }
               }


    }
}












