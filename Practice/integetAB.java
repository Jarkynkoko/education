package Practice;

import java.util.Scanner;

public class integetAB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int n = scan.nextInt();

        String result = "";
        for(int i = 0; i < str.length();i =i+n){
            result = result + str.charAt(i);
        }
        System.out.println(result);


}
}
