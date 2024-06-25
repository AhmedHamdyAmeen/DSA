package com.ameen.ds.queue;

import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int size;
    private int capacity;
    private int front; // pointer to the first of the queue from where the element removed.
    private int rear; // pointer to the end of the queue in where the element added.
    
    
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        // if rear == size -1
        return size == capacity;
    }
    
    public int size() {
        return size;
    }
    
    public void enqueue(int item) {
        if (isFull()) throw new IllegalStateException("Queue is full");
        
        rear = (rear + 1) % capacity;  //  note: we used the (%) operator to implementing a circular queue. Ensures that rear wraps around to the beginning of the array when it reaches the end.
        queue[rear] = item;
//        rear++;
        size++;
    }
    
    public int dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        
        int item = queue[front];
        front = (front + 1) % capacity; // Ensures that `front` wraps around to the beginning of the array when it reaches the end.
        // Wrap Around: The modulus operator helps in wrapping the `rear` index back to 0 when it reaches the capacity of the queue. This ensures that the index stays within the bounds of the array.
        size--;
        
        return item;
    }
    
    public int front() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return queue[front];
    }
    
    @Override
    public String toString() {
        return "Queue{" + Arrays.toString(this.queue) + "}";
    }
}
