package ds.stack.linked;

import ds.Colorized;

public class Stack<T> implements Colorized {
    Node<T> top, cur;

    public Stack() {
        top = null;
    }

    /**
     * this function pushes into the stack
     * */
    public void push(T newItem) {
        Node<T> nextItem = new Node<T>();
        if(nextItem == null) {
            System.out.println(ANSI_RED+ "Stack push can't allocate memory"+ANSI_RESET);
        }else {
            nextItem.item = newItem;
            nextItem.next = top;
            top = nextItem;
            System.out.println(ANSI_GREEN+ "Pushed " + newItem + " Successfully" + ANSI_RESET);
        }
    }

    /**
     *  checks if stack is empty
     * */
    public boolean isEmpty() {
        return top == null;
    }


    /**
     *  pops top element
     * */
    public void pop() {
        if(isEmpty()){
            System.out.println(ANSI_RED+ "Stack empty on pop" + ANSI_RESET);
        }else {
            Node<T> temp = top;
            top = top.next;
            temp.next = null;
        }
    }
    /**
     *  pops and returns the top element
     * */
    public T popGet() {
        if(isEmpty()){
            System.out.println(ANSI_RED+ "Stack empty on pop" + ANSI_RESET);
            return null;
        }else {
            return  top.item;
        }
    }

    /**
     * this returns the top of the stack
     * */
    public T getTop() {
        if(isEmpty()) {
            System.out.println(ANSI_RED+ "Stack empty there's no top" + ANSI_RESET);
            return null;
        }else {
            System.out.println(ANSI_GREEN+ top.item+ ANSI_RESET);
            return top.item;
        }
    }

    /**
     *  this diplays the stack
     * */
    public void print() {
        cur = top;
        System.out.println("\nItems in the stack: ");
        System.out.print("[ ");
        while(cur != null){
            System.out.print(ANSI_GREEN+ cur.item+ ANSI_RESET+ " ");
            cur = cur.next;
        }
        System.out.println("]");
    }


}
