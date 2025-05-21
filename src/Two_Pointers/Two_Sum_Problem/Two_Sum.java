// Problem link = https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
// 167. Two Sum II - Input Array Is Sorted

package Two_Pointers.Two_Sum_Problem;

import java.util.Arrays;

public class Two_Sum {
    public static int[] return2Sum(int[] nums, int target){
        int left = 0;
        int  right = nums.length - 1;
        while(left < right){
            int curSum = nums[left] + nums[right];
            if(curSum == target){
                return new int[]{left + 1, right + 1};
            }else if(curSum < target){
                left += 1;
            }else{
                right -= 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int k = 9;
        System.out.println(Arrays.toString(return2Sum(nums, k)));
    }
}
