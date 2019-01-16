import util.TreeNode;

/**
 * @Author: Poldi
 * @Date: 2018/9/21 上午10:39
 * @Description:
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSameNode(root.left, root.right);
    }

    boolean isSameNode(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if ((left == null && right != null) || (left != null && right == null) || left.val != right.val) return false;
        return isSameNode(left.left, right.right) && isSameNode(left.right, right.left);
    }
}
