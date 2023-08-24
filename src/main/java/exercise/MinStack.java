package exercise;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * &#064;Author  asxy
 * &#064;Version  1.0
 * &#064;Date  2023/8/21
 */
class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        if(val <= min){
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }

    public void pop() {
        if(stack.pop() == min){
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;

    }
}
