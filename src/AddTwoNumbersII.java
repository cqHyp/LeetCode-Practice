import util.ListNode;

import java.util.Stack;

/**
 * @Author: Poldi
 * @Date: 2018/8/18 上午9:42
 * @Description:
 */
public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ListNode res = new ListNode(0);
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int sum = 0;
        int index = 0;
        boolean flag = false;
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) {
                sum += s1.peek();
                s1.pop();
            }
            if (!s2.empty()) {
                sum += s2.peek();
                s2.pop();
            }
            if (flag) {
                sum += 1;
            }
            if (sum >= 10) {
                flag = true;
            } else {
                flag = false;
            }
            ListNode temp = new ListNode(sum % 10);
            if (index == 0){
                temp.next = null;
            }else {
                temp.next = res;
            }
            index++;
            res = temp;
            sum = 0;
        }
        if (flag){
            ListNode head = new ListNode(1);
            head.next = res;
            res = head;
        }

        return res;
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
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(0);
        AddTwoNumbersII addTwoNumbersII = new AddTwoNumbersII();
        ListNode listNode = addTwoNumbersII.addTwoNumbers(l1, l2);
        System.out.println(1);
    }
}
