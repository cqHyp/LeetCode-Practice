import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-02-19 10:25
 * @Description: 199. Binary Tree Right Side View
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    public static void dfs(TreeNode node, List<Integer> res, int deepth) {
        if (node == null) return;
        if (deepth == res.size()){
            res.add(node.val);
        }
        dfs(node.right, res, deepth + 1);
        dfs(node.left, res, deepth + 1);
    }
}
