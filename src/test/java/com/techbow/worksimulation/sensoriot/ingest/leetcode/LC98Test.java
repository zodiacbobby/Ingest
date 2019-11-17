package com.techbow.worksimulation.sensoriot.ingest.leetcode;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.powermock.api.mockito.PowerMockito.when;

class LC99Test {

    //@Autowired
    private LC98 lc98;

    @Before
    public void init() {

        lc98 = new LC98();
    }

    @Test
    public void testLengthOf() {

        //when(lc98.isValidBST(any())).thenReturn(1);

        TreeNode testCase1 = new TreeNode(3);
        testCase1.left = new TreeNode(2);
        testCase1.right = new TreeNode(4);
        boolean result = false;
        result = lc98.isValidBST(testCase1);
        boolean expectation = true;
        assertEquals(result, expectation);
    }
}