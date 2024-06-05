package com.ameen.ds.stack;


public class StackArray<T> {
    int size;
    int top;
    Object[] arrayStack;
    
    public StackArray(int size) {
        this.size = size;
        this.top = -1;
        arrayStack = new Object[this.size];
    }
    
    public void push(Object newItem) {
        if (isFull()) {
            System.out.println("Stack is Full!");
            return;
        } // Check if the stack is full.
        this.top++;
        arrayStack[top] = newItem;
    }
    
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return null;
        } // Check if the stack is empty.
        T item = (T) arrayStack[top];
        this.top--;
        return item;
    }
    
    
    public Boolean isFull() {
        return (top == size - 1);
    }
    
    public Boolean isEmpty() {
        return (top == -1);
    }
    
    
//    @Override
//    public String toString() {
//        StringBuilder response = new StringBuilder();
//        for (Object stack : arrayStack) {
//            response.append(stack.toString() + " ");
//        }
//        return "Stack: [ " + response + "]";
//    }
    
    
}
