package selfPractice;

import java.util.Scanner;

public class switchO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter width and height:");
        int Width = scan.nextInt();
        int Height =  scan.nextInt();

        int area =  Width*Height;
        int perimeter = (Width + Height)*2;

        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);

    }
}


