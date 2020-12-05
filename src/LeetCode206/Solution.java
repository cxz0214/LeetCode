package LeetCode206;
import LeetCode203.ListNode;
public class Solution {
    public ListNode reverseList(ListNode head) {
        /**
         * 非递归解法
         */
//        if( head == null)
//            return null;
//        ListNode pre , cur, next;
//        pre = null;
//        cur = head;
//        next = head.next;
//        while(next != null){
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//            next = next.next;
//        }
//        cur.next = pre;
//        return cur;


//        ListNode pre = null;
//        ListNode cur = head;
//        while(cur != null){
//            ListNode next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//        }
//        return pre;
        /**
         * 递归解法
         */
        if(head == null || head.next == null)
            return head;
        ListNode rev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rev;

    }

    public static void main(String[] args) {
        int[] arr = {12,23,34,5,67};
        ListNode listNode = new ListNode(arr);
        System.out.println(listNode);
        System.out.println((new Solution()).reverseList(listNode));

    }
}
