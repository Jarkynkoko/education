package selfPractice;

import java.util.Scanner;

public class strLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String lastFirst;
        int word = str.length()-1;
        String returns = word+"";

        if (str.length()> 2){
            lastFirst = str.substring(1,str.length()-1);
            System.out.println(lastFirst);
            System.out.println(str.substring(word));
            System.out.println(str.substring(0));


        }

    }
}
