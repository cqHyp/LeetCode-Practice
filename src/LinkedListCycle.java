import util.ListNode;

/**
 * @Author: Poldi
 * @Date: 2018/8/17 下午3:55
 * @Description:
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode temp = head;
        ListNode rate = head;
        while (rate.next != null && rate.next.next != null) {
            temp = temp.next;
            rate = rate.next.next;
            if (temp == rate){
                return true;
            }
        }
        return false;
    }
}
