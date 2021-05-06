package String;

import java.util.Scanner;

public class eMailCreate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Creating an email. Ask user to enter two strings.
        Both of these strings should be at least 6 character long.
        If they are shorter than that print “Invalid data” and program should end.
        If the information provided is valid, you will take the first 4 characters
        of first string and combine them with the last three characters of the second string.
        At the end of your combined string add “@cybertek.com” and print the final string
        as your created email.
        > input: “JamesBond”, Secret
        > output: jameret@cybertek.com*/


                System.out.println("Enter 6 character long your login-name: ");
                String name = scan.nextLine().trim();
                String name2 = scan.nextLine().trim();
                String eMail = " ";


                if (name.length()>=6 && name2.length() >= 6){
                   eMail = name.substring(0,4).toLowerCase();
                   eMail += name2.substring(name2.length()-3).toLowerCase();
                   eMail +="@cybertek.com";
                    System.out.println(eMail);


                }else {
                    System.out.println("Invalid length");
                }
        }




    }

