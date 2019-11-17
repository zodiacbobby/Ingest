package com.techbow.worksimulation.sensoriot.ingest.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LC253Test {

//@Autowired

    private LC253 lc253 = new LC253();

    @Before
    public void init() {
        lc253 = new LC253();
    }

    @Test
    public void testNumOfMeetingRooms() {
        int[][] intervals = new int[][] { {0, 30}, {5, 10}, {15, 20}};
        int res = lc253.minMeetingRooms(intervals);
        int expectation = 2;
        assertNotNull(res);
        assertEquals(res, expectation);
    }


}