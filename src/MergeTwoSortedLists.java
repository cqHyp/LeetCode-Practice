import util.ListNode;

/**
 * @Author: Poldi
 * @Date: 2018/7/31 下午2:35
 * @Description:
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return dfs(l1, l2);
    }

    public ListNode dfs(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = dfs(l1.next, l2);
            return l1;
        } else {
            l2.next = dfs(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode k1 = new ListNode(1);
        k1.next = new ListNode(3);
        k1.next.next = new ListNode(4);
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        mergeTwoSortedLists.mergeTwoLists(l1, k1);
    }
}

