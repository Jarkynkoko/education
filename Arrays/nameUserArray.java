package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class nameUserArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times do you want enter");
          int size = scan.nextInt();
          scan.nextLine();
         String [] names = new String[size];

         for (int i =0; i < names.length; i++){
             System.out.println("Enter names " + (i+1));
             names[i] = scan.nextLine();
         }
        System.out.println(Arrays.toString(names));
    }
}
