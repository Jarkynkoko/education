package InternetPraktice;

import java.util.Scanner;

public class CalculatePhoneBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter word:");
        String str = input.nextLine();

        int index = str.length()/2;
        if (str.length()<3 || str.length()>100){
            System.out.println("Invalid enter");
        }
        else if (str.length()/2==1){
            System.out.println(str.substring(0,index)+"   "+str.substring(index,index+1).toUpperCase()+"     "+str.substring(index+1));
        }
        else if (str.length()%2==0){
            System.out.println(str.substring(0,index-1)+"   "+str.substring(index-1,index+1).toUpperCase()+"   "+str.substring(index+1));
        }

    }
}
