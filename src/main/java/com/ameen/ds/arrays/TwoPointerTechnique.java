package com.ameen.ds.arrays;

import java.util.Arrays;

public class TwoPointerTechnique {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] indices = twoSum(numbers, target);
        System.out.println("Indices of the two numbers that sum up to " + target + ": " + Arrays.toString(indices));
    }
    

    // Given a sorted array of integers
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int sum = 0;
        
        while (left < right) {
            sum = numbers[right] + numbers[left];
            
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++; // Move the left pointer to the right.
            } else {
                right--; // Move the right pointer to the left.
            }
        }
        
        
        return new int[]{-1, -1}; // There is no pair exist.
    }
    
}

/*

    Allow us to keep track, simultaneously, of two elements inside a given array, allowing us to process two elements per iteration, instead of one.
    
    One of the pointer moves at the slow pace while the other pointer moves at the faster pace. (one from the beginning and the other form the end until they both meet).

    The two-pointer technique is commonly used to solve problems such as
        - finding pairs that satisfy certain conditions,
        - searching for a target value,
        - or partitioning the data structure in some way.

 
*/