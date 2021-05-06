package InternetPraktice;

import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Width = scan.nextInt();
        double Height =  scan.nextInt();

        double area =  Width*Height;
        double perimeter = 2*(Width + Height);

        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }
}
