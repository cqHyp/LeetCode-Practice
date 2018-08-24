import util.ListNode;

import java.util.Stack;

/**
 * @Author: Poldi
 * @Date: 2018/8/17 上午10:18
 * @Description:
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode temp = head;
        ListNode rate = head;
        Stack<Integer> stack = new Stack<>();
        stack.push(head.val);
        while (rate.next != null && rate.next.next != null) {
            temp = temp.next;
            rate = rate.next.next;
            stack.push(temp.val);
        }
        if (rate.next == null) stack.pop();
        while (temp.next != null){
            temp = temp.next;
            if (temp.val != stack.peek()){
                return false;
            }
            stack.pop();
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        System.out.println(palindromeLinkedList.isPalindrome(l1));
    }
}
