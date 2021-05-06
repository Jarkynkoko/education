package Methods;

import java.util.Scanner;

public class timePrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean time = true;
        int hour = scan.nextInt();
        int minutes = scan.nextInt();
        amPmTime(hour,minutes,false);
    }
    public static void amPmTime(int hour, int minutes, boolean amOrPm){

        if ((hour > 0 && hour<= 12)&& minutes >=0 && minutes<=59){

            String date = hour + ":" + minutes;

            if (amOrPm){
                date += " AM";
            }else {
                date += " PM";
            }
            System.out.println(date);
        }else {
            System.out.println("Invalid amOrPm information given");
        }
    }

}
