import util.TreeNode;

/**
 * @Author: Poldi
 * @Date: 2019-03-07 15:36
 * @Description:
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int res = 0;
        dfs(root, res);
        return res;
    }

    void dfs(TreeNode node, int deepth) {
        if (node == null) return;


    }
}
