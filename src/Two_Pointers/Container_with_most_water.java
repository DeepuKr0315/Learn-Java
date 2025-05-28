package Two_Pointers;

public class Container_with_most_water {
    public static int maxArea(int[] height){
        int max_area = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int width = right - left;
            int cur_area = Math.min(height[left], height[right]) * width;
            max_area = Math.max(cur_area, max_area);
            if(height[left] < height[right]){
                left += 1;
            }else{
                right -= 1;
            }
        }
        return max_area;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}