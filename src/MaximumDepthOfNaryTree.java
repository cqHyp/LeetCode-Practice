import util.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-02-18 11:15
 * @Description: 559 Maximum Depth of N-ary Tree
 */
public class MaximumDepthOfNaryTree {
    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int max = 0;
        if (root.children != null) {
            for (Node child : root.children) { //replace left&right to for loop
                int value = maxDepth(child);

                if (value > max) {
                    max = value;
                }
            }
        }
        return max + 1;
    }


    public static void main(String[] args) {
        Node child5 = new Node(5, null);
        Node child6 = new Node(6, null);

        List<Node> childrenSub = new ArrayList<>();
        childrenSub.add(child5);
        childrenSub.add(child6);

        Node child3 = new Node(3, childrenSub);
        Node child2 = new Node(2, null);
        Node child4 = new Node(4, null);

        List<Node> childrenAut = new ArrayList<>();
        childrenAut.add(child3);
        childrenAut.add(child2);
        childrenAut.add(child4);

        Node root = new Node(1, childrenAut);
        MaximumDepthOfNaryTree.maxDepth(root);
    }
}
