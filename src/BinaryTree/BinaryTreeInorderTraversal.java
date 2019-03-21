package BinaryTree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-03-19 16:17
 * @Description:
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        recursion(root, res);
        return res;
    }

    public void recursion(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        recursion(root.left, res);
        res.add(root.val);
        recursion(root.right, res);
    }
}
