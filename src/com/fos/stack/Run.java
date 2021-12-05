package com.fos.stack;

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
    }
}
