package com.techbow.worksimulation.sensoriot.ingest.leetcode;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.powermock.api.mockito.PowerMockito.when;

class LC300Test {

    private LC300 lc300 = new LC300();

    @Before
    public void init(){

    }

    @Test
    public void testLengthOfLIS() {
        int[] testCase1 = {1,3,4,5,9,11};
        Integer res = lc300.lengthOfLIS(testCase1);
        int expectation = 6;
        assertNotNull(res);
        assertEquals(res,expectation);
    }
}