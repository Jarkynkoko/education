package String;

import java.util.Scanner;

public class badWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      /*  User is asked to enter a message to send. You will check if the message
     contains any of these bad words:“idiot, dumb, stupid”
        > if any bad words are in the message change
          them to “smart” and print “your message was changed:
     ” and then print the new message in the next line.
      > if the message had no bad words print “Your message was
           not changed:” and then print the original message in the next line.*/


        System.out.println("Enter the message to sent: ");
        String message = scanner.nextLine();

        String checked = message;
        checked = checked.replace("idiot","smart");
        checked = checked.replace("dumb","smart");
        checked = checked.replace("stupit","smart");

        if (message.equalsIgnoreCase(checked)){
            System.out.println("Your message was not changed");
            System.out.println(message);
        }else {
            System.out.println("Your bad words were removed");
            System.out.println(checked);
        }

      /* if (message.contains("idiot")){
           System.out.println("Your message was changed: " + message.replace("idiot", "smart"));
       }else if (message.contains("dumb")){
           System.out.println("Your message was changed : "  + message.replace("dumb" , "smart"));
       }else if (message.contains("stupit")){
           System.out.println("Your message was changed : " + message.replace("stupit" ,"smart"));
       }else {
           System.out.println("Your message: " + message);
       }*/

        }

    }

