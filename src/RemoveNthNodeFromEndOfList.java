import util.ListNode;

/**
 * #19
 * Remove Nth Node From End of List
 *
 * @Author: Poldi
 * @Date: 2018/8/24 上午10:33
 * @Description:
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode res = new ListNode(0);
        while (temp == null) {
            if (temp.next.next == null) {

            }
            temp = temp.next;
        }
        return head;
    }
}
