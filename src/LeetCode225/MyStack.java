package LeetCode225;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class MyStack {
    private LinkedList<Integer> queue1;
    private LinkedList<Integer> queue2;
    private boolean direction;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    /** Push element x onto stack. */
    public void push(int x) {
        queue1.offer(x);
    }
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(!queue1.isEmpty() && !direction){
            while(queue1.size() != 1){
                queue2.offer(queue1.poll());
            }
            direction = false;
            return queue1.poll();
        }else{
            if(queue2.isEmpty()){
                direction = false;
                return pop();
            }
            while(queue2.size() != 1){
                queue1.offer(queue2.poll());
            }
            direction = true;
            return queue2.poll();

        }

    }
    /** Get the top element. */
    public int top() {
        if(!queue1.isEmpty() && !direction){
            while(queue1.size() != 1){
                queue2.offer(queue1.poll());
            }
            direction = false;
            return queue1.peek();
        }else{
            if(queue2.isEmpty()){
                direction = false;
                return top();
            }
            while(queue2.size() != 1){
                queue1.offer(queue2.poll());
            }
            direction = true;
            return queue2.peek();

        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }

}
