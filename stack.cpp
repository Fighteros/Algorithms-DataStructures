#include <iostream>

using namespace std;

const int MAX_SIZE = 100;
template <class t>

class stack
{
    int top;
    t item[MAX_SIZE];

public:
    stack() : top(-1) {}

    void push(t element)
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

    void pop(t &element)
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

    void getTop(t &stackTop)

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

    stack<int> s;
    s.push(5);
    s.push(10);
    s.push(15);
    s.push(20);
    s.pop();
    s.push(7);
    s.print();
}