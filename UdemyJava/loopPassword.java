package UdemyJava;

import java.util.Scanner;

public class loopPassword {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String passWord = "shark50";
        System.out.println("Enter the password: ");
        for (;;){

            String userPass = n.nextLine();
            if (!userPass.equals(passWord)){
                System.out.println("Enter the password: ");
                continue;
            }else {
                System.out.println("ACCESS APPROVED!");
            }
        }


    }
}
