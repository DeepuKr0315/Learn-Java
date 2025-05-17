package Tree;
import com.sun.source.tree.Tree;

import java.util.*;
public class Preorder_Traversal {
    public ArrayList<Integer> preorderTraversal(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
        return res;
    }
}
