package com.ameen.ds.queue;


public class LinkedListQueue<T> {
    
    private class Node<T> {
        T data;
        Node next;
        
        public Node(T data) {
            this.data = data;
        }
    }
    
    
    private Node front;
    private Node rear; // back
    private int size;
    
    
    public LinkedListQueue() {
        front = rear = null;
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return (size == 0);
    }
    
    public int size() {
        return size;
    }
    
    public void enqueue(int item) {
        Node<Integer> node = new Node<Integer>(item);
        
        if (isEmpty()) {
            front = rear = node;
        } else {
            node.next = rear;
//            rear.next = node;
            rear = node;
        }
        
        size++;
    }
    
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = (T) front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return item;
    }
    
    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) this.front.data;
    }
    
}
