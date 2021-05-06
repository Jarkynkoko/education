package Practice;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class loopArrayBiggestNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 number ");
        int nums = 0;
        int max = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("Enter num " + (i+1) + " : ");
             nums = scan.nextInt();
            if (nums > max){
                max = nums;
            }
        }
        System.out.println("The biggest number is: "+ max);


    }
}
