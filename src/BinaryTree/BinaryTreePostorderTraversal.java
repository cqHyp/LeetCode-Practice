package BinaryTree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-03-19 16:20
 * @Description:
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        recursion(root, res);
        return res;
    }

    public void recursion(TreeNode root, List<Integer> res){
        if (root == null) return;

        recursion(root.left, res);
        recursion(root.right, res);
        res.add(root.val);
    }
}
