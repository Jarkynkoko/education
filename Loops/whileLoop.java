package Loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter the nu 0");
        int num = n.nextInt();
        int start = 0;
        while (num>=start){
            System.out.println(start++);

        }

    }
}
