import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-06-22 14:58
 * @Description:
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        List<Integer> list = new ArrayList<>();
        recursion(root, list);
        return true;
    }

    private static void recursion(TreeNode root, List<Integer> list){
        if (root == null) return;
        list.add(root.val);
        recursion(root.left, list);
    }
}
