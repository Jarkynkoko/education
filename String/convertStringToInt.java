package String;

import java.util.Scanner;

public class convertStringToInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();//"I am 23 years old"

        int am = str.indexOf("am")+3;
        int years = str.indexOf("years");

        String age = str.substring(am,years-1);
        int ageNum= Integer.valueOf(age);
        ageNum += 5;
        System.out.println("In 5 years you will be " + ageNum);


    }
}
