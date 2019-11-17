package com.techbow.worksimulation.sensoriot.ingest.leetcode159;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode159Test {
    @Autowired
    private LeetCode159 lc159;

    @Test
    public void name() {
        String testcase1 = "eeecebasad";
        int res = lc159.lengthOfLongestSubstringTwoDistinct(testcase1);
        int expectations = 5;
        assertEquals(res, expectations);
    }


    @org.junit.jupiter.api.Test
    void lengthOfLongestSubstringTwoDistinct() {
    }
}