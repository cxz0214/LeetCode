package LeetCode203;

public class LeetCode203 {
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            // 递归解法
//            if(head == null)
//                return null;
//            ListNode result = removeElements(head.next,val);
//            if(head.val == val)
//                return result;
//            else{
//                head.next = result;
//                return head;
//            }
            /**
             * 含有虚拟头结点解法
             */
//            ListNode dummyHead = new ListNode(-1);
//            dummyHead.next = head;
//            if(dummyHead.next == null)
//                return null;
//            else{
//                ListNode cur = dummyHead;
//                while(cur.next!= null){
//                    if(cur.next.val == val){
//                        cur.next = cur.next.next;
//                    }else
//                    {
//                        cur = cur.next;
//                    }
//
//                }
//                return dummyHead.next;
//            }
            /**
             * 不含虚拟头结点的解法
             */
            if(head == null)
                return null;
            else {
                while( head!= null && head.val == val){
                    head = head.next;
                }
                if(head == null)
                    return null;
                ListNode cur = head;
                while(cur.next != null){
                    if(cur.next.val == val)
                        cur.next = cur.next.next;
                    else{
                        cur = cur.next;
                    }
                }
                return head;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1};
        ListNode test = new ListNode(arr);
        LeetCode203 leet = new LeetCode203();
        //ListNode res = (leet.new Solution()).removeElements(test,4);
        //System.out.println(res);
        ListNode res2 = (leet.new Solution()).removeElements(test,1);
        System.out.println(res2);
    }
}
