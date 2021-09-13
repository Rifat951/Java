//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Output: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]




package com.example.junit4;

import java.util.Arrays;

public class Solution {
    public static void twoSum(int[] nums, int target) {

        int val1 = 0;
        int val2;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] + nums[i + 1] == target) {
               val1 = nums[i];
               val2 = nums[i + 1];
               int[] arr = {val1,val2};
               System.out.println(Arrays.toString(arr));
               break;
            } else {
                continue;
            }
        }
    }

    public static void main(String[] args){
        int[] test = {3,2,4};
        int target = 6;
        twoSum(test,target);
    }

}
