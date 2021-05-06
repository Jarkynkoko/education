package String;

import java.util.Scanner;

public class leghtTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the message");
        String message = input.nextLine();

        if (message.isEmpty()){
            System.out.println("Message is empty");
        }
        if (message.length()>=10){
            System.out.println("Message is good");
        }else {
            System.out.println("Message is shot");
        }



    }
}
