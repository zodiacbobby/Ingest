package com.techbow.worksimulation.sensoriot.ingest.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by leonliang in Nov, 2019
 */
class LC1Test {
    private LC1 lc1 = new LC1();

    @Before
    public void init() {

    }



    @Test
    public void testTwoSum() {
        //when(lc1.twoSum(any())).thenReturn(new int[-1, -1]);

        int[] testCases1 = new int[]{7, 1, 6, 5, 4};
        int target1 = 8;
        int[] res1 = lc1.twoSum(testCases1, target1);
        int[] expectation1 = new int[]{0, 1};
        assertEquals(res1, expectation1);
    }
}