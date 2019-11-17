package com.techbow.worksimulation.sensoriot.ingest.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;
import static reactor.core.publisher.Mono.when;

class LC1_Two_SumTest {
    private LC1_Two_Sum lc1;

    @Before
    public void init() {
        lc1 = new LC1_Two_Sum();
    }

    @Test
    public void testTwoSum() {

     int[] testCase1 = {1, 2, 3, 4, 5};

     //when(lc1.twoSum(anyArray())).thenReturn();


     int testCase2 = 9;
     int[] res = lc1.twoSum(testCase1, testCase2);
     int[] expectation = {3, 4};
     assertEquals(res, expectation);

    }
}