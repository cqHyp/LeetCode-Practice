import util.ListNode;

/**
 * @Author: Poldi
 * @Date: 2018/8/1 上午10:01
 * @Description:
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }else if (lists.length == 1){
            return lists[0];
        }
        ListNode res = lists[0];
        for (int i = 0; i < lists.length - 1; i++) {
            res = dfs(res, lists[i + 1]);
        }
        return res;
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
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        ListNode[] listNodes = {l1,l2,l3};
        mergeKSortedLists.mergeKLists(listNodes);
    }


}
