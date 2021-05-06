package CodingBat;

import java.util.Scanner;

public class StringToChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a three number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a>b && a> c){
            System.out.println(a + " is the greatest number");
        }else if (b>a&&b>c){
            System.out.println(b + " is your gratest number");
        }else{
            System.out.println(c + " is your greatest number");
        }
        /*public boolean in3050(int a, int b) {
  if (a >=30 && a <=40 && b>=30 && b <= 40) {
     return true;
  }
  if ( a >=40 && <=50 && b>= 40 && b <= 50 ) {
   return true;
  }
  return false;


}*/


    }
}
