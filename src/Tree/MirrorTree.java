// Problem link = https://www.geeksforgeeks.org/problems/mirror-tree/1
// MIRROR TREE

package Tree;

public class MirrorTree {
    void mirrorTree(TreeNode node){
        if(node == null || node.left == null && node.right == null){
            return;
        }
        mirrorTree(node.left);
        mirrorTree(node.right);
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
