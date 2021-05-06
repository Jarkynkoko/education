package selfPractice;

import java.util.Scanner;

public class stringMissingChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        if(str.length() == 1){
           str = str+ str + str;
            System.out.println(str);
        }else if(str.length() > 1) {
            String last = str.substring(str.length()-1);
           String str2 = last + str + last;
            System.out.println(str2);
            str = str.substring(0, str.length()-1);

        }







    }
}
