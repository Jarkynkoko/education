package Methods;

import java.util.Arrays;

public class endWith5 {
    public static void main(String[] args) {
        int [] arr = {5,4,6,6,2,5};
        Arrays.sort(arr);
        System.out.println("The biggest number: " + arr[arr.length-1]);
        System.out.println(Arrays.toString(arr));
       // System.out.println(sumArray(arr));//array class
       // System.out.println(sumArray(arr,5));
        System.out.println(sumArray(arr,4));
    }
    public static int sumArray(int [] arr) {
        int sum = 0;
        for (int num : arr) {
            String s = num + "";
            if (s.endsWith("5")) {
                continue;
            }
            sum += num;

            //if (num % 10! = 5){
            // sum += num;
            //}
        }
        return sum;
    }
    public static int sumArray(int [] arr, int number) {
        int sum = 0;
        for (int num : arr) {
             String s = num + "";
             if (!s.endsWith( number + "")) {
               continue;

             } sum += num;
          //  if (num % 10 != number){
            // sum += num;
            //}
        }
            return sum;
    }
}
