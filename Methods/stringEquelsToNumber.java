package Methods;

import java.util.Scanner;

public class stringEquelsToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        System.out.println("Enter the word");
        String word = scan.nextLine();
        numberToWords(num,word);

    }
    public static void numberToWords(int num, String word){
    String [] arr = word.trim().split("");
        int numWords = arr.length;
        if (numWords == num){
            System.out.println("Equel");
        }else {
            System.out.println("Not equel");
        }

    }

}
