package com.techbow.worksimulation.sensoriot.ingest.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author BorisMirage
 * Time: 2019/11/16 15:44
 * Created with IntelliJ IDEA
 */

class LC1192Test {

    @Autowired
    private LC1192 lc1192 = new LC1192();

    @Before
    public void init() {
        criticalConnections();
    }

    @Test
    public void criticalConnections() {
        List<List<Integer>> tmp = new LinkedList<>();
        List<Integer> l = new LinkedList<>();
        l.add(0);
        l.add(1);
        tmp.add(l);

        l = new ArrayList<>();
        l.add(1);
        l.add(2);
        tmp.add(l);

        l = new ArrayList<>();
        l.add(2);
        l.add(0);
        tmp.add(l);

        l = new ArrayList<>();
        l.add(1);
        l.add(3);
        tmp.add(l);

        List<Integer> out = new LinkedList<>();
        out.add(1);
        out.add(3);
        List<List<Integer>> correct = new LinkedList<>();
        correct.add(out);

        Assert.assertEquals(correct, lc1192.criticalConnections(4, tmp));
//        System.out.println(lc1192.criticalConnections(4, tmp));
//        System.out.println(new LC1192().criticalConnections(0, new LinkedList<>()));

    }
}