package selfPractice;

import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        // Your code here
        //------------------------------------------------

        if (n.contains("x")){
            System.out.println(n.substring(1,-1));
        }
    }
}
