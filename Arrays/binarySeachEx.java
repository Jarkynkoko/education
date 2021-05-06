package Arrays;

import java.util.Arrays;

public class binarySeachEx {
    public static void main(String[] args) {

        int [] nums = {45,23,6,-3,66};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Index of -3 is: " + Arrays.binarySearch(nums,-3));



    }
}
