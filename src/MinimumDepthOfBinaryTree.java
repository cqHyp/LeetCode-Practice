import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-02-19 11:07
 * @Description: 111. Minimum Depth of Binary Tree
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        int res = 0;
        List<Integer> list = new ArrayList<>();
        dfs(root, list, res);
        return res;
    }

    public static void dfs(TreeNode node, List<Integer> list, int deep) {
        if (node == null) return;

    }
}