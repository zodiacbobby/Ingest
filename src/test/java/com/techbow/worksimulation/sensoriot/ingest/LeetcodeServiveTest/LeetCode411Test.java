package com.techbow.worksimulation.sensoriot.ingest.LeetcodeServiveTest;

import com.techbow.worksimulation.sensoriot.ingest.LeetcodeService.LeetCode411;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class LeetCode411Test {

    @Autowired
    private LeetCode411 lc;

    @Before
    public void init() {

    }

    @Test(expected = RuntimeException.class)
    public void TestLeetCode411() {
        lc.Solution();
    }
}
