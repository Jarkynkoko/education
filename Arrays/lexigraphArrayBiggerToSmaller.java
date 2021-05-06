package Arrays;

import java.util.Arrays;

public class lexigraphArrayBiggerToSmaller {
    public static void main(String[] args) {

        int [] nums  = {31, 20, 25, 98, 3, 48, 26, 12};
        Arrays.sort(nums);
        System.out.println("Biggest number " + nums[nums.length-1]);
        System.out.println("Smallest number " + nums[0]);

        for (int i = nums.length-1; i >= 0; i--){
        }
        System.out.println(Arrays.toString(nums));


    }
}
