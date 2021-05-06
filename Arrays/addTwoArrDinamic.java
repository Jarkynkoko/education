package Arrays;

import java.util.Arrays;

public class addTwoArrDinamic {
    public static void main(String[] args) {

        int [] arr1 = {3,2,6,43,7,20, 5, 4 };
        int [] arr2 = {2,7,-10,10,-5,2, 6, 4};
        int small, big;
        boolean same = false;

        if (arr1.length > arr2.length){
            big = arr1.length;
            small = arr2.length;
        }else if (arr2.length > arr1.length){
            big = arr2.length;
            small = arr1.length;
        }else {
            big = arr1.length;
            small = arr2.length;
        }

        int [] sum = new int[big];

        for (int i = 0; i < small; i++){

        sum[i] = arr1[i] + arr2[i];

        }
        if (big ==arr1.length && !same){
            sum [big-1] = arr1[big-1];

        }else if (big ==arr2.length && !same){
            sum[big -1] = arr2[big-1];
        }
        System.out.println(Arrays.toString(sum));
    }
}
