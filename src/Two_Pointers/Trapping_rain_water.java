package Two_Pointers;
import java.util.*;
public class Trapping_rain_water {
    public static int trap(int[] height){
        if (height.length == 0){
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int res = 0;
        while (left < right){
            if (leftMax < rightMax){
                left += 1;
                leftMax = Math.max(height[left], leftMax);
                res += leftMax - height[left];
            }else{
                right -= 1;
                rightMax = Math.max(height[right], rightMax);
                res += rightMax - height[right];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }
}
