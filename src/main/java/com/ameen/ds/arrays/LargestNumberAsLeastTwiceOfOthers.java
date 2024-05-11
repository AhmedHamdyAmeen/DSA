package com.ameen.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNumberAsLeastTwiceOfOthers {

    public static void main(String[] args) {
        
        int[] nums1 = {3, 6, 1, 0};
        System.out.println("Output for nums1: " + dominantIndex(nums1)); // Output: 1
        
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Output for nums2: " + dominantIndex(nums2)); // Output: -1
    }
    
    // The Best solution using two pointers technique
    public static int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int index = -1;
        int len = nums.length; // to decrease the time complexity.
        
        // Find the largest and second largest elements and their indices
        for (int i = 0; i < len; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                index = i;
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        
        // Check if the largest element is at least twice as much as every other number
        if (largest >= 2 * secondLargest) {
            return index;
        } else {
            return -1;
        }
    }

    public static int dominantIndex2(int[] nums) {

        int [] numbers = Arrays.copyOf(nums, nums.length);

        Arrays.sort(nums);
        int largestElement = nums[nums.length - 1];
        int secondLargestElement = nums[nums.length - 2];

        if (largestElement >= secondLargestElement * 2) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == largestElement) {
                    return i;
                }
            }
        }

        return -1;
    }
    

    
    public static int dominantIndex3(int[] nums) {
        int max = 0;
        int index = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] * 2) > max) return -1;
        }
        
        return -1;
    }
}

// Cherry Pick. Cherry Pick.
// Brute force approach




