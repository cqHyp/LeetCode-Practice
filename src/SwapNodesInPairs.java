import util.ListNode;

/**
 * @Author: Poldi
 * @Date: 2018/7/31 下午3:37
 * @Description:
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {

        return dfs(head, head.next);
    }

    public ListNode dfs(ListNode l1, ListNode l2){
        return l1;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        swapNodesInPairs.swapPairs(head);
    }
}
