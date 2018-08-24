import util.ListNode;

/**
 * @Author: Poldi
 * @Date: 2018/8/2 上午9:54
 * @Description:
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode headListNode = new ListNode(0);
        headListNode.next = head;
        ListNode tempListNode = headListNode;
        while (tempListNode.next != null) {
            if (tempListNode.next.val == val) {
                tempListNode.next = tempListNode.next.next;
            }else {
                tempListNode = tempListNode.next;
            }
        }
        return headListNode.next;
    }

}
