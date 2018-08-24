import util.TreeNode;

/**
 * @Author: Poldi
 * @Date: 2018/8/14 上午9:50
 * @Description:
 */
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        int count = 0;
        countTree(root, count);
        return count;
    }

    public void countTree(TreeNode root, int count){
        if (root == null){
            return;
        }
        count++;
        countTree(root.left, count);
        countTree(root.right, count);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        CountCompleteTreeNodes countCompleteTreeNodes = new CountCompleteTreeNodes();
        System.out.println(countCompleteTreeNodes.countNodes(treeNode));
    }
}
