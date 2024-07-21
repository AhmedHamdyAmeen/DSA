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
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        
        queue.enqueue(6);
        System.out.println(queue);
        queue.enqueue(7);
        System.out.println(queue);
        
//        queue.enqueue(8);
        
        
        LinkedListQueue<Integer> queue2 = new LinkedListQueue<Integer>();
        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);
        System.out.println(queue2);
        
        
        System.out.println(queue2.dequeue()); // 1
        System.out.println(queue2);
        System.out.println(queue2.front());   // 2
        
    }
    
}
