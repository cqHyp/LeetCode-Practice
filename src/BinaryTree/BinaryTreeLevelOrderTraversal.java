package BinaryTree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-03-19 16:56
 * @Description:
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        recursion(root, res, 0);
        return res;
    }

    public void recursion(TreeNode root, List<List<Integer>> res, int deep){
        if (root == null) return;

        if (deep >= res.size()) {
            res.add(new ArrayList<>());
        }

        res.get(deep).add(root.val);

        recursion(root.left, res, deep + 1);
        recursion(root.right, res, deep + 1);
    }
}
