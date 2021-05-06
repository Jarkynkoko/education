package scanners;

import java.util.Scanner;

public class wall2 {
 public static void main(String[] args){
     Scanner  scanner = new Scanner(System.in);
     System.out.println("Мonth" );
     int month = scanner.nextInt();
     System.out.println("Day ");
     int day = scanner.nextInt();
     System.out.println("Years ");
     int years = scanner.nextInt();

     String results = "" + month + "/" + day + "/" + years;
  System.out.println(results);
     years += 5;
     day -= 1;

     String result2 =  "" + month + "/" + day + "/" + years;
     System.out.println(result2);














 }
}
