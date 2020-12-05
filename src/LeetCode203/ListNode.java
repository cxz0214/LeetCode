package LeetCode203;

public class ListNode {
     public int val;
     public ListNode next;
     public ListNode(int x) { val = x; }
     public ListNode(int[] arr){
          if(arr == null || arr.length == 0)
               throw new IllegalArgumentException("数组不能为空！");
          this.val = arr[0];
          ListNode cur = this;
          for(int i = 1 ; i < arr.length; i++){
               cur.next = new ListNode(arr[i]);
               cur = cur.next;
          }
     }
     @Override
     public String toString(){
          StringBuilder builder = new StringBuilder();
          builder.append("front:");
          ListNode cur = this;
          while(cur != null){
               builder.append(cur.val + "->");
               cur = cur.next;
          }
          builder.append("NULL");
          return builder.toString();

     }
}
