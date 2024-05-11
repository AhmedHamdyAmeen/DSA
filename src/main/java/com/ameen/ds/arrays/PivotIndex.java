package com.ameen.ds.arrays;

public class PivotIndex {
    
    public static void main(String[] args) {
        
        int[] a = {1, 2, 6, 6, 36}; // not a pivot index
        int[] b = {1, 7, 3, 6, 5, 6}; // pivot index 3
        
        int pivotIndex = findPivotIndex(b);
        int pivotIndex2 = pivotIndex2(b);
        int pivotIndex3 = findPivotIndex3(b);
        
        System.out.println(pivotIndex);
        System.out.println(pivotIndex2);
        System.out.println(pivotIndex3);
    }
    
    public static int findPivotIndex(int[] nums) {
        
        // 0. Validation
        if (nums.length < 1) return 0;
        // 1. Define the needed variables
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        int currentElement;
        
        // 2. Calculate the total Summation of the Array
        for (int e : nums) {
            totalSum += e;
        }
        
        // 3. Find the Pivot Index
        for (int i = 0; i < nums.length; i++) {
            currentElement = nums[i];
            if (i == 0) { // Initialize Variable in the First iteration.
                rightSum = totalSum - leftSum - currentElement;
            } else {
                rightSum -= currentElement;
            }
            
            // Check if Pivot
            if (leftSum == rightSum) {
                return i;
            }
            
            leftSum += currentElement;
        }
        
        
        // There is no index that satisfies the conditions in the problem statement.
        return -1; // There is no pivot index for this array
        
    }
    
    public static int pivotIndex2(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        
        // 2. Calculate the needed variables
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            rightSum = totalSum - leftSum - nums[i];
            
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1; // There is no pivot index for this array
    }
    
    
    public static int findPivotIndex3(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // If the sum of elements to the left of index i equals the sum of elements to the right
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Return the pivot index
            }
            leftSum += nums[i];
        }
        
        return -1; // No pivot index found
    }
    
    
}

// 1991. Find the Middle Index in Array: is the same idea


