package String;


import java.util.Scanner;

public class Messege2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*User will be given a string:
       “Sender: <James Bond>. From Number: [202-123-3456].
       + Message: {I love programming and problem solving}”
> You will separate these parts and print them separately.
 > Print the following:
“Sender: actualSender”
“Number: actualNumber”
“Message: actualMessage”*/

        System.out.println("Enter first your name than number:");
        String actualSender = scan.nextLine();
        String actualNumber= scan.nextLine();
        System.out.println("Enter your message:");
        String actualMessage = scan.nextLine();

        System.out.println("Sender: " + actualSender);
        System.out.println("Number: " + actualNumber);
        System.out.println("Message: " +actualMessage);













    }
}
