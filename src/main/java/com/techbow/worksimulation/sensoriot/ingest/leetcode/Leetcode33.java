package com.techbow.worksimulation.sensoriot.ingest.leetcode;
/*
33. Search in Rotated Sorted Array

        Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

        (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

        You are given a target value to search. If found in the array return its index, otherwise return -1.

        You may assume no duplicate exists in the array.

        Your algorithm's runtime complexity must be in the order of O(log n).

        Example 1:

        Input: nums = [4,5,6,7,0,1,2], target = 0
        Output: 4
        Example 2:

        Input: nums = [4,5,6,7,0,1,2], target = 3
        Output: -1

 */

public class Leetcode33 {

        public int search(int[] nums, int target) {
            if(nums == null || nums.length == 0) return -1;
            if(nums.length == 1) return (nums[0] == target)? 0: -1;

            int left = 0;
            int right = nums.length -1;
            int mid = left + (right - left) / 2;

            while(left + 1 < right) {
                mid = left + (right - left) / 2;
                if (nums[mid] == target ) return mid;
                if (nums[left] < nums[mid]) {
                    if (target >= nums[left] && target < nums[mid]){
                        right = mid;
                    } else {
                        left = mid;
                    }
                } else if (nums[mid] < nums[right]) {
                    if(target > nums[mid] && target <= nums[right]) {
                        left = mid;
                    } else {
                        right = mid;
                    }
                }
            }
            if(nums[left] == target) return left;
            if(nums[right] == target) return right;
            return -1;
        }
}

