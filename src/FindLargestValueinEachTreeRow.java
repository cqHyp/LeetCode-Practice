import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2018/3/30 下午4:20
 * @Description: 515. Find Largest Value in Each Tree Row
 */
public class FindLargestValueinEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    public static void dfs(TreeNode node, List<Integer> res, int deepth) {
        if (node == null) return;

        if (deepth == res.size()) {
            res.add(node.val);
        } else {
            res.set(deepth, Math.max(res.get(deepth), node.val));
        }

        dfs(node.left, res, deepth + 1);
        dfs(node.right, res, deepth + 1);
    }
}
