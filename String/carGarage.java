package String;

import java.util.Scanner;

public class carGarage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       /* You have a car garage with these car brands. You will check the cars and print the following messages:
        String cars = "Toyota, BMW, Juguar";
> If the garage is empty print “No cars in your garage”
> If you have a Toyota or Nissan print “There is a Japanese car in your garage”
> If you have a BMW print “There is a German car in your garage”
> If you have a Maserati print “There is an Italian car in your garage”
> If you have a Jaguar print “There is a British car in your garage” —>
> If the garage does not have a car of that type, print “No x cars”
        */

       // String cars = "Toyota, Maserati, Nissan, Jaguar BMW";
        System.out.println("Check your cars: ");
        String check = scan.nextLine();


        if (check.contains("Toyota, Nissan")){
            System.out.println("There is a Japanese car in your garage");
        }else if (check.contains("BMW")){
            System.out.println("There is a German car in your garage");
        }else if (check.contains("Maserati")){
            System.out.println("There is an Italian car in your garage");
        }else if (check.contains("Jaguar")){
            System.out.println("There is a British car in your garage");
        }else {
            System.out.println("No cars in the garage");
        }


    }
}
