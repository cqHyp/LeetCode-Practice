package util;

import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-02-18 11:14
 * @Description:
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
