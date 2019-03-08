import util.TreeNode;

import java.util.*;

/**
 * @Author: Poldi
 * @Date: 2019-02-25 14:23
 * @Description: 863. All Nodes Distance K in Binary Tree
 */
public class AllNodesDistanceKInBinaryTree {
    public static List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> res = new ArrayList<>();
        Map<TreeNode, TreeNode> map = new HashMap<>();
        dfs(root, map, null);
        map.get(target);
        int i = 0;
        while (i <= K) {

        }
        return res;
    }

    public static void dfs(TreeNode root, Map<TreeNode, TreeNode> map, TreeNode parent) {
        if (root == null) return;

        map.put(root, parent);
        dfs(root.left, map, root);
        dfs(root.right, map, root);
    }

    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7);
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        node2.left = node7;
        node2.right = node4;
        TreeNode node6 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5);
        node5.left = node6;
        node5.right = node2;

        TreeNode node0 = new TreeNode(0);
        TreeNode node8 = new TreeNode(8);
        TreeNode node1 = new TreeNode(1);
        node1.left = node0;
        node1.right = node8;

        TreeNode node3 = new TreeNode(3);
        node3.left = node5;
        node3.right = node1;

        AllNodesDistanceKInBinaryTree.distanceK(node3, node5, 2);

    }
}
