import util.ListNode;

/**
 * @Author: Poldi
 * @Date: 2018/8/1 下午4:21
 * @Description:
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return dfs(head);
    }

    public ListNode dfs(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode temp = head;
        head = dfs(temp.next);
        temp.next.next = temp;
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.reverseList(l1);
    }
}
