package scanners;

import java.util.Scanner;

public class Wall {
    public static void main(String[] args){
                    Scanner input = new Scanner(System.in);
            System.out.println("What is the wall?");
            String color = input.nextLine();
            System.out.println("What the leghth?");
            int leghth = input.nextInt();
            input.nextLine();
            System.out.println("It is good one?");
            String answer = input.nextLine();
        System.out.println("Color " + color);
        System.out.println("Leghth: " + leghth);
            System.out.println("Good?: " + answer);



    }
}

