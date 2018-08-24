import util.ListNode;

/**
 * @Author: Poldi
 * @Date: 2018/8/1 下午3:17
 * @Description:
 */
public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        return dfs(head);
    }

    public ListNode dfs(ListNode head){
        if (head.next == null) return head;

        if (head.val == head.next.val){
            return dfs(head.next);
        }else {
            head.next = dfs(head.next);
            return head;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedListII removeDuplicatesFromSortedListII = new RemoveDuplicatesFromSortedListII();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(1);
        l1.next.next.next = new ListNode(2);
        l1.next.next.next.next = new ListNode(3);
        removeDuplicatesFromSortedListII.deleteDuplicates(l1);
    }
}
