package com.techbow.worksimulation.sensoriot.ingest.leetcode;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

@Component
public class LC300 {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        List<Integer> res = new ArrayList<>();
        res.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int curVal = nums[i];
            int topVal = res.get(res.size() - 1);
            if (curVal > topVal) {
                res.add(curVal);
            } else {
                int left = 0;
                int right = res.size() - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    int midVal = res.get(mid);
                    if (midVal == curVal) {
                        left = mid;
                        right = mid - 1;
                    } else if (midVal < curVal) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                res.set(left, curVal);
            }
        }
        return res.size();
    }
}
