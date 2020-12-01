package LeetCode232;
import java.util.Stack;
public class MyQueue {

    private Stack<Integer> stack1,stack2;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        conversion(false);
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        conversion(true);
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        conversion(true);
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() || stack2.isEmpty();
    }
    private void conversion(boolean direction){
        if(direction){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        else{
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
    }

}