package Tree;

public class Root_Equals_Sum_of_Children {
    public static boolean checkTree(TreeNode root){
        if(root == null || root.right == null && root.left == null){
            return true;
        }
        if(!checkTree(root.left) || !checkTree(root.right)){
            return false;
        }
        int x = 0;
        if(root.left != null){
            x = (root.left.left == null && root.left.right == null) ? root.left.val : 2 * root.left.val;
        }
        int y = 0;
        if(root.right != null){
            y = (root.right.left == null && root.right.right == null) ? root.right.val : 2 * root.right.val;
        }
        return (root.val == x + y);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);

        System.out.println(checkTree(root));
    }
}
