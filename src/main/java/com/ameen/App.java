package com.ameen;

import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "In The Name of Allah 💪" );
        System.out.println("I love Salomty ❤️");
        
        
        Stack<String> myStack = new Stack<>();
        myStack.push("Allah");
        myStack.push("With");
        myStack.push("Me");
        myStack.push("Salomty");
        
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.search("Me"));
        System.out.println(myStack.peek());
        
        
        
    }
}
