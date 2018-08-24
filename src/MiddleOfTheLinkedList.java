import util.ListNode;

import java.util.Stack;

/**
 * @Author: Poldi
 * @Date: 2018/8/17 上午10:42
 * @Description:
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode rate = head;
        while (rate != null && rate.next != null){
            if (rate.next != null && rate.next.next == null){
                return temp.next;
            }
            temp = temp.next;
            rate = rate.next.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();
        ListNode res = middleOfTheLinkedList.middleNode(l1);
        System.out.println(res);
    }
}
