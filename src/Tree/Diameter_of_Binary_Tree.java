package Tree;

public class Diameter_of_Binary_Tree {
    public static int height(TreeNode root){
        if (root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static int diameter(TreeNode root){
        if (root == null){
            return 0;
        }
        int l_height = height(root.left);
        int r_height = height(root.right);
        int l_diam = diameter(root.left);
        int r_diam = diameter(root.right);
        return Math.max(l_height + r_height, Math.max(l_diam, r_diam));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(diameter(root));
    }
}
