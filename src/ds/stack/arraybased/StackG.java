package ds.stack.arraybased;

import ds.Colorized;

import java.util.ArrayList;

public class StackG<T> implements Colorized {
    private int top;
    private ArrayList<T> item;
    static private int MAX_SIZE;

    public StackG(int size){
        top = -1;
        MAX_SIZE = size;
        item = new ArrayList<T>(MAX_SIZE);
    }

    public void push(T number) {
        if (top >= MAX_SIZE - 1) {
            System.out.println(ANSI_RED + "Stack Full on push" + ANSI_RESET);
        } else {
            if(item.size() > top + 1){
                item.set(++top, number);
            }
            else {
                ++top;
                item.add(number);
            }
            System.out.println(ANSI_GREEN + item.get(top) + " is pushed successfully " + ANSI_RESET);

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
            System.out.println(ANSI_GREEN+ "Popped "+ item.get(top--)+ " Successfully" + ANSI_RESET);
        }
    }

    /**
     * this function returns 0 if stack is empty
     * returns the number - latest number- if stack is not empty
     */
    public T popAndGet() {
        if (isEmpty()) {
            System.out.println(ANSI_RED + "Stack empty on pop" + ANSI_RESET);
            return null;
        } else {
            return item.get(top--);
        }
    }

    /**
     * this function returns the top number of stack and <tt>Prints</tt> it if it isn't empty
     */
    public T getTop() {
        if (isEmpty()) {
            System.out.println(ANSI_RED + "stack empty on top" + ANSI_RESET);
            return null;
        } else {
            System.out.println(ANSI_GREEN + item.get(top) + ANSI_RESET);
            return item.get(top);
        }
    }

    /**
     * prints all {@link Stack} elements
     */
    public void print() {
        for (int j = top; j > 0; j--) {
            System.out.print(ANSI_GREEN + item.get(j) + " " + ANSI_RESET);
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
