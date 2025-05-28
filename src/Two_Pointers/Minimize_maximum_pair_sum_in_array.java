//https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/

package Two_Pointers;
import java.util.*;
public class Minimize_maximum_pair_sum_in_array {
    public static int min_max_pair_sum(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);
        int minimized_sum = 0;
        while (left < right){
            int curr_sum = nums[left] + nums[right];
            minimized_sum = Math.max(curr_sum, minimized_sum);
            left += 1;
            right -= 1;
        }
        return minimized_sum;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,2,3};
        System.out.println(min_max_pair_sum(nums));
    }
}
