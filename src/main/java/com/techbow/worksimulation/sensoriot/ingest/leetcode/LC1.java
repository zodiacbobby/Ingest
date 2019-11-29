package com.techbow.worksimulation.sensoriot.ingest.leetcode;


import org.springframework.stereotype.Component;

import java.util.HashMap;


/**
 * Created by leonliang in Nov, 2019
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */


public class LC1 {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("nums is invalid");
        //if(nums == null || nums.length == 0) return new int[]{};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                int[] result = {map.get(target - nums[i]), i};
                return result;
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
    public void main(String[] args) {

    }


}
