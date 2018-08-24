import util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2018/8/7 下午1:47
 * @Description:
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> pList = new ArrayList<>();
        List<Integer> qList = new ArrayList<>();
        Object[] i = dfs(p, pList).toArray();
        Object[] j = dfs(q, qList).toArray();
        return Arrays.equals(dfs(p, pList).toArray(), dfs(q, qList).toArray());
    }

    public List<Integer> dfs(TreeNode root, List<Integer> res){
        if (root == null) {
            return res;
        }

        dfs(root.left, res);
        res.add(root.val);
        dfs(root.right, res);

        return res;
    }

    public static void main(String[] args) {
        SameTree sameTree = new SameTree();
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(1);
        System.out.println(sameTree.isSameTree(p, q));
    }
}
