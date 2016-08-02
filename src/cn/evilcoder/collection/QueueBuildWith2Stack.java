package cn.evilcoder.collection;

import java.util.Stack;

/**
 * 两个栈实现队列
 * Created by huangshanqi on 2016/8/2.
 */
public class QueueBuildWith2Stack {

    private Stack<Integer> in;
    private Stack<Integer> out;

    public QueueBuildWith2Stack() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public boolean isEmpty() {
        return in.isEmpty() && out.isEmpty();
    }

    public int size() {
        return in.size() + out.size();
    }

    public void enQueue(int i) {
        in.push(i);
    }

    public int deQueue() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        if (out.isEmpty()) {
            throw new IllegalArgumentException("the queue is empty.");
        }
        return out.pop();
    }
}
