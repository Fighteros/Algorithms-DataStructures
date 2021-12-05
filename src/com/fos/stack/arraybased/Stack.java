package com.fos.stack.arraybased;


public class Stack {
    static final int MAX = 6;
    private int top;
    private int[] item = new int[MAX];

    // Colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public Stack() {
        top = -1;
    }

    public void push(int number) {
        if (top >= MAX - 1) {
            System.out.println(ANSI_RED + "Stack Full on push" + ANSI_RESET);
        } else {
            item[++top] = number;
            System.out.println(ANSI_GREEN + item[top] + " is pushed successfully " + ANSI_RESET);
        }
    }

    /**
     * this function checks if stack is empty
     */
    public boolean isEmpty() {
        return top < 0;
    }

    /**
     * checks if stack is full
     */
    public boolean isFull() {
        return !isEmpty();
    }


    /**
     * this function only pops latest number without returning it
     * if stack isn't empty
     */
    public void pop() {
        if (isEmpty()) {
            System.out.println(ANSI_RED + "Stack empty on pop" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN+ "Popped "+ item[top--]+ " Successfully" + ANSI_RESET);
        }
    }

    /**
     * this function returns 0 if stack is empty
     * returns the number - latest number- if stack is not empty
     */
    public int popAndGet() {
        if (isEmpty()) {
            System.out.println(ANSI_RED + "Stack empty on pop" + ANSI_RESET);
            return 0;
        } else {
            return item[top--];
        }
    }

    /**
     * this function returns the top number of stack and <tt>Prints</tt> it if it isn't empty
     */
    public int getTop() {
        if (isEmpty()) {
            System.out.println(ANSI_RED + "stack empty on top" + ANSI_RESET);
            return 0;
        } else {
            System.out.println(ANSI_GREEN + item[top] + ANSI_RESET);
            return item[top];
        }
    }

    /**
     * prints all {@link Stack} elements
     */
    public void print() {
        for (int j = top; j > 0; j--) {
            System.out.print(ANSI_GREEN + item[j] + " " + ANSI_RESET);
        }
        if(isEmpty()) {
            System.out.println(ANSI_RED+ "Stack is Empty!"+ ANSI_RESET);
        }
    }

    /**
     * makes index as initiated
     * */
    public void emptyStack() {
        if(!isEmpty()){
            top = -1;
            System.out.println(ANSI_GREEN+ "Successfully clear the stack " + ANSI_RESET);
        }else {
            System.out.println(ANSI_RED+ "Stack is already empty!");
        }
    }



}
