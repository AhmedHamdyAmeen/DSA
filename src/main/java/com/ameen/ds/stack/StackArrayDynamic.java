package com.ameen.ds.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackArrayDynamic<T> {
    int top;
    List<T> stackList;
    
    public StackArrayDynamic() {
        this.top = -1;
        stackList = new ArrayList<>();
    }
    
    
    public void push(T newItem) {
        if (isFull()) {
            System.out.println("Stack is Full!");
            return;
        } // Check if the stack is full.
        this.top++;
        stackList.add(newItem);
    }
    
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return null;
        } // Check if the stack is empty.
        T item = stackList.remove(stackList.size() - 1);
        this.top--;
        return item;
    }
    
    
//    public void ensureCapacity(int minCapacity) {
//        int oldCapacity =  stackList.length;
//
//        if (minCapacity > oldCapacity) {
//            int newCapacity = oldCapacity * 2;
//            if (newCapacity < minCapacity)
//                newCapacity = minCapacity;
//            stackList = Arrays.copyOf(stackList, newCapacity);
//        }
//    }
    
    public Boolean isFull() {
        return (top == stackList.size());
    }
    
    public Boolean isEmpty() {
        return (top == -1);
    }
}
