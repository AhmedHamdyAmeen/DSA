package com.ameen.ds.queue;

public class QueueDemo {
    public static void main(String[] args) {
        
        ArrayQueue queue = new ArrayQueue(5);
        System.out.println(queue);
        queue.enqueue(1);
        System.out.println(queue);
        queue.enqueue(2);
        System.out.println(queue);
        queue.enqueue(3);
        System.out.println(queue);
        queue.enqueue(4);
        System.out.println(queue);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
        queue.enqueue(6);
        System.out.println(queue);
        queue.enqueue(7);
        System.out.println(queue);
        
        queue.enqueue(7);
        
    }
    
}
