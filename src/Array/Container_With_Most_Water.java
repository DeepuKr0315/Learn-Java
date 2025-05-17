package Array;
import java.util.*;
public class Container_With_Most_Water {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] height = new int[size];
        System.out.println("Enter heights: ");
        for(int i = 0; i < size; i++){
            height[i] = sc.nextInt();
        }
        int max_area = maxArea(height);
        System.out.println("The maximum amount of water a container can store: "+ max_area);
    }
    public static int maxArea(int[] height){
        int left = 0;
        int right = height.length - 1;
        int max_area = 0;
        while (left < right){
            int width = right - left;
            int currentArea = 0;
            if(height[left] < height[right]){
                currentArea = height[left] * width;
            }else{
                currentArea = height[right] * width;
            }
            if (max_area < currentArea){
                max_area = currentArea;
            }
            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max_area;
    }
}
