package hue.edu.xiong.lc0100.lc0150;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main0155 {
    class MinStack {
        LinkedList<Integer> stack;
        PriorityQueue<Integer> priorityQueue;

        public MinStack() {
            stack = new LinkedList<>();
//             大根堆
//            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x, y) -> y - x);
            // 小根堆
            priorityQueue = new PriorityQueue<>((x, y) -> y - x);

        }

        public void push(int val) {
            stack.push(val);
            priorityQueue.add(val);
        }

        public void pop() {
            Integer pop = stack.pop();
            priorityQueue.remove(pop);
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return priorityQueue.peek();
        }
    }
}
