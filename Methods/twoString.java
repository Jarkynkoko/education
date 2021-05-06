package Methods;

import java.util.Locale;
import java.util.Scanner;

public class twoString {
    public static void main(String[] args) {
           stringContains("james is an agent", "cop");
    }
    public static void stringContains(String str, String str2){
        if (str.contains(str2)){

            str.replace(str2,"");
            System.out.println(str.trim());
        }else {
            System.out.println("Try again");
            Scanner input = new Scanner(System.in);
            String again = input.nextLine();

            if (str.contains(again)){
                System.out.println();

            }else {
                System.out.println("Out of tries");
            }
        }
    }

    }

