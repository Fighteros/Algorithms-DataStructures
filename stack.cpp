#include <iostream>

using namespace std;

const int MAX_SIZE = 100;

class stack
{
    int top;
    int item[MAX_SIZE];

public:
    stack() : top(-1) {}

    void push(int element)
    {
        if (top >= MAX_SIZE - 1)
        {
            cout << "Stack is full on push ";
        }
        else
        {
            item[++top] = element;
        }
    }

    bool isEmpty()
    {
        return top < 0;
    }

    void pop()
    {
        if (isEmpty())
            cout << "Stack empty on pop";
        else
            top--;
    }

    void pop(int &element)
    {
        if (isEmpty())
        {
            cout << "Stack empty on pop";
        }
        else
        {
            element = item[top];
            top--;
        }
    }

    void getTop(int &stackTop)

    {
        if (isEmpty())
        {
            cout << "Stack empty on get top";
        }
        else
        {
            stackTop = item[top];
            // cout << stackTop << endl;
        }
    }

    void print()
    {
        cout << "[";
        for (int i = top; i >= 0; i--)
        {
            cout << item[i] << " ";
        }
        cout << "]";
        cout << endl;
    }
};

int main()
{

    stack s;
    s.push(5);
    s.push(10);
    s.push(15);
    s.push(20);
    s.pop();
    s.push(7);
    s.print();
}