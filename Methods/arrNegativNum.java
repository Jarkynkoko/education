package Methods;

import java.util.Arrays;

public class arrNegativNum {
    public static void main(String[] args) {
        int [] arr2 = {-4,2,4,-5,2,-8,9};
        //negativeArrNum(arr2);
        //changeNegativeNumbers(arr2,10);
        arraysToString(arr2);
    }
    public static void negativeArrNum(int [] arr){
        for (int arr1: arr){
            if (arr1 < 0){
                System.out.println(arr1);
            }
        }


    }
    public static void changeNegativeNumbers(int []arr, int change){
        for (int i =0; i < arr.length; i++){
            if (arr[i] < 0){
                arr[i] = change;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void arraysToString(int [] arr){
        String result = "[";

        for (int num : arr){
            result += num + ", ";
        }
        result = result.trim().substring(0,result.length()-2) + "]";
        System.out.println(result);
    }
}
