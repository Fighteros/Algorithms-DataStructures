#include <iostream>

// create a stack linked list based
using namespace std;

// make stack generic
template <class T>

class stack
{
    // this is the node
    // which have a value and pointes to
    // the item below it
    struct node
    {
        T item;
        node *next;
    };
    // top of the stack is pointer that points to a node
    node *top, *cur;

public:
    // init stack
    stack()
    {
        top = NULL;
    }

    // push new items
    void push(T newItem)
    {
        node *newItemPtr = new node;
        if (newItemPtr == NULL)
        {
            cout << "Stack push cannot allocate memory";
        }
        else
        {
            newItemPtr->item = newItem;
            newItemPtr->next = top;
            top = newItemPtr;
        }
    }

    bool isEmpty()
    {
        return top == NULL;
    }

    // pops top
    void pop()
    {
        if (isEmpty())
        {
            cout << "Stack is empty on pop";
        }
        else
        {
            node *temp = top;
            top = top->next;
            temp = temp->next = NULL;
            delete temp;
        }
    }

    // returns the popped item
    void pop(T &item)
    {
        if (isEmpty())
        {
            cout << "Stack is empty on pop";
        }
        else
        {
            item = top->item;
            node *temp = top;
            top = top->next;
            temp = temp->next = NULL;
            delete temp;
        }
    }

    // getting stack top
    void getTop(T &stckTop)
    {
        if (isEmpty())
        {
            cout << "Stack is empty on getting top";
        }
        else
        {
            stckTop = top->item;
            cout << stckTop;
        }
    }

    void display()
    {
        cur = top;
        cout << "\nItems in the stack: ";
        cout << "[";
        while (cur != NULL)
        {
            cout << cur->item << " ";
            cur = cur->next;
        }
        cout << "]\n";
    }
};

int main()
{
    stack<int> s;

    s.push(100);
    s.push(200);
    s.push(300);
    s.push(400);
    s.pop();
    int y = 0;
    s.getTop(y);
    s.display();
}