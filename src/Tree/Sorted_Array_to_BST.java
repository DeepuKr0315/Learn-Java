// Problem link = https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/

package Tree;

public class Sorted_Array_to_BST {

    public static TreeNode sortedArrayToBST(int[] nums){
        Integer right = null;
        return helper(nums, 0, right);
    }
    public static TreeNode helper(int[] nums, int left, Integer right){
        if(right == null){
            right = nums.length - 1;
        }
        if(left > right){
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid - 1);
        node.right = helper(nums, mid + 1, right);
        return node;
    }
    public static void main(String[] args){
        int[] nums = {-10,-3,0,5,9};

        System.out.println(sortedArrayToBST(nums));
    }
}
