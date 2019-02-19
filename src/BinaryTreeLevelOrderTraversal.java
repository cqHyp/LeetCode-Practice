import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-02-19 10:40
 * @Description: 102. Binary Tree Level Order Traversal
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    public static void dfs(TreeNode node, List<List<Integer>> res, int deepth) {
        if (node == null) return;

        if (deepth >= res.size()) {
            res.add(new ArrayList<>());
        }

        res.get(deepth).add(node.val);

        dfs(node.left, res, deepth + 1);
        dfs(node.right, res, deepth + 1);
    }
}
