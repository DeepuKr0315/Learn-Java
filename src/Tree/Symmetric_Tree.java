// Problem link = https://leetcode.com/problems/symmetric-tree/description/?envType=problem-list-v2&envId=tree
// 101. Symmetric Tree

package Tree;

public class Symmetric_Tree {
    public static boolean symmetricTree(TreeNode root){
        if(root == null){
            return true;
        }
        return isMirror(root.left, root.right);
    }
    public static boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(symmetricTree(root));
    }
}
