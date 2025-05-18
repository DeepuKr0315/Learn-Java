package Array;

import java.util.Arrays;

public class Merge_sorted_array {
    public static int[] mergeSorted(int[] nums1, int m, int[] nums2, int n){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0){
            if(nums1[i] <= nums2[j]){
                nums1[k] = nums2[j];
                k--;
                j--;
            }else {
                nums1[k] = nums1[i];
                k--;
                i--;
            }
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 0, 0, 0};
        int[] nums2 = {3, 4, 6};
        int m = 3;
        int n = 3;
        System.out.println(Arrays.toString(mergeSorted(nums1, m, nums2, n)));
    }
}
