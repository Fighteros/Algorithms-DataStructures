package com.fos.stack.arraybased;

public class Run {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println("stack is empty ? " + s.isEmpty());
        s.pop();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        System.out.println("stack is Full ? " + s.isFull());
        s.pop();
        s.getTop();
        int y = s.popAndGet();
        System.out.println(y);
        s.getTop();
        s.pop();
        s.getTop();
        s.emptyStack();
        s.print();

        System.out.println("================");
    /* here is generic stack */
        StackG<Integer> stackG = new StackG<>(6);
        System.out.println("stack is empty ? " + stackG.isEmpty());
        stackG.pop();
        stackG.push(1);
        stackG.push(2);
        stackG.push(3);
        stackG.push(4);
        stackG.push(5);
        stackG.push(6);
        stackG.push(7);
        System.out.println("stack is Full ? " + stackG.isFull());
        stackG.pop();
        stackG.getTop();
        int G = stackG.popAndGet();
        System.out.println(G);
        stackG.getTop();
        stackG.pop();
        stackG.getTop();
        stackG.emptyStack();
        stackG.print();
    }
}
