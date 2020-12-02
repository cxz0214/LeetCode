package LeetCode155;

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
//    private Stack<Integer> stack;
//    private Stack<Integer> minStack;
//    public MinStack() {
//       stack = new Stack<>();
//       minStack = new Stack<>();
//    }
//
//    public void push(int x) {
//        stack.push(x);
//        if(minStack.isEmpty())
//            minStack.push(x);
//        else{
//            if(x <= minStack.peek())
//                minStack.push(x);
//        }
//    }
//
//    public void pop() {
//        if(stack.peek().equals(minStack.peek())){
//            stack.pop();
//            minStack.pop();
//        }else{
//            stack.pop();
//        }
//    }
//
//    public int top() {
//       return stack.peek();
//    }
//
//    public int getMin() {
//        return minStack.peek();
//    }

    //链表实现
    private Node head;
    public MinStack() {
        head = null;
    }

    public void push(int x) {
        if(head == null)
            head = new Node(x,x);
        else{
            head = new Node(x ,Math.min(x,head.min),head);
        }
    }

    public void pop() {
        Node temp = head;
        if(head.value == head.min){
            head = head.next;
            temp.next = null;
        }else{
            head.next.min = head.min;
            head = head.next;
            temp = null;
        }
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.min;
    }
    private class Node{
        int value;
        int min;
        Node next;
        public Node(int value,int min,Node next){
            this.value = value;
            this.min = min;
            this.next = next;
        }
        public Node(int value,int min){
            this(value,min,null);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

    }
}
