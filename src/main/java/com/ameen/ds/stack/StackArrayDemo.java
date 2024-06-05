package com.ameen.ds.stack;

import java.util.Arrays;

public class StackArrayDemo {
    
    public static void main(String[] args) {
        
        StackArray<String> stackArray = new StackArray<String>(3);
        stackArray.push("Allah");
        stackArray.push("With");
        stackArray.push("Me");
//        stackArray.push("Salma");
        
        System.out.println(Arrays.deepToString(stackArray.arrayStack));
        
        StackArray<Integer> stackArray1 = new StackArray<Integer> (4);
        
        stackArray1.push(11);
        stackArray1.push(22);
        stackArray1.push(33);
        stackArray1.pop();
        stackArray1.push(44);
        
        System.out.println(Arrays.deepToString(stackArray1.arrayStack));
        
        
        StackArrayDynamic<Integer> stackArrayDynamic = new StackArrayDynamic<Integer> ();
        stackArrayDynamic.push(10);
        stackArrayDynamic.push(20);
        stackArrayDynamic.push(30);
        stackArrayDynamic.push(40);
        
        System.out.println(stackArrayDynamic.stackList);
        stackArrayDynamic.pop();
        stackArrayDynamic.pop();
        stackArrayDynamic.pop();
        stackArrayDynamic.pop();
        System.out.println(stackArrayDynamic.stackList);
        
        
        
        
    }
}
