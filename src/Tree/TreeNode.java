package Tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){ this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return toStringHelper(this);
    }

    private String toStringHelper(TreeNode node) {
        if (node == null) return "null";
        return node.val + " -> (L: " + toStringHelper(node.left) + ", R: " + toStringHelper(node.right) + ")";
    }

}
