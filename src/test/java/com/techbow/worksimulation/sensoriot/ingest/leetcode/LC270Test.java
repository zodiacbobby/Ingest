package com.techbow.worksimulation.sensoriot.ingest.leetcode;

import com.fasterxml.jackson.core.TreeNode;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC270Test {
    private LC270 lc270 = new LC270();

    @Before
    public void init(){
//        lc270 = new LC270();
    }

    @Test
    public void testTree(){
        TreeNode testCase1 = {2,1,3};
        double target = 3.14;
        int res = lc270.closestValue(testcase1, target);
        int expectation = 0;
        assertNotNull(res);
        assertEquals(res, expectation);
    }
}