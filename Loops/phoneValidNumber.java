package Loops;

import java.util.Scanner;

public class phoneValidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        boolean validLength= false;
        int count=0;


            if (number.length()== 10){
             validLength = true;

            }else if (number.length()==12){

               if (number.charAt(0) == '(' && number.charAt(4)== ')'){
                   validLength = true;
                   number = number.replace("(","").replace(")","");
               }
            }

            //we check the length so far
            //if valid length we will check if all are numbers
            // if  valid length don't check

            if (validLength){

                for (int i =0; i<number.length();i++){
                    char num = number.charAt(i);

                    if (num >=48 && num <= 57){// '1'  '9'
                        count++;
                    }
                }
                if (count == number.length()){
                    System.out.println("Valid number");

                }else {
                    System.out.println("Invalid number");
                }


            }else {
                System.out.println("Invalid number format");
            }

    }
}
