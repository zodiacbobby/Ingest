package com.techbow.worksimulation.sensoriot.ingest.LeetcodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * This is the solution for Leetcode 411
 * @author Yuntao Liang
 * @time 2019.11.16
 */
@Slf4j
@Component
public class LeetCode411 {
    public void Solution() {
        try {
            solve();
        } catch (RuntimeException e) {

            log.error("The Leetcode 411 is too hard, Yuntao can't solve it");

            System.out.println("为了显眼");
            System.out.println("为了显眼");
            System.out.println("为了显眼");
            System.out.println("为了显眼");
            System.out.println("为了显眼");
            System.out.println("为了显眼");
            System.out.println("为了显眼");
            System.out.println("为了显眼");
        }
    }
    private void solve() throws RuntimeException {
        throw new RuntimeException();
    }
}
