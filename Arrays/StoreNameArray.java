package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StoreNameArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many names you want enter: ");
        int size = scan.nextInt();
        scan.nextLine();

        String [] names = new String[size];

        for (int i = 0; i < names.length; i ++){
            System.out.println("Enter the name: " +(i+1));
            names[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(names));
    }
}
