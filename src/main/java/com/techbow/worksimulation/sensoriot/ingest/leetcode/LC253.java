package com.techbow.worksimulation.sensoriot.ingest.leetcode;

import org.springframework.stereotype.Component;

import java.util.Arrays;

// 253. Meeting Rooms II
//@Component
public class LC253 {
    public int minMeetingRooms(int[][] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int start = 0, end = 0;
        int max = 0, count = 0;
        while (start < starts.length) {
            if (starts[start] < ends[end]) { // !!!!!!!!!!
                count++;
                max = Math.max(count, max);
                start++;// !!!!!!!!!!
            } else {
                count--;
                end++; // !!!!!!!!!!
            }
        }
        return max;
    }


}
