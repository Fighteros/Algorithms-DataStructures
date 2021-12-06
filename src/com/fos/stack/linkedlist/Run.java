package com.fos.stack.linkedlist;

public class Run {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);
        s.print();

        s.pop();
        s.getTop();
    }
}
