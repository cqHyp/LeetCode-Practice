package BinaryTree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-03-19 16:12
 * @Description:
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        recursion(root, res);
        return res;
    }

    public void recursion(TreeNode root, List<Integer> res){
        if (root == null) return;
        res.add(root.val);

        recursion(root.left, res);
        recursion(root.right, res);
    }
}
