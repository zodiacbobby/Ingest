package com.techbow.worksimulation.sensoriot.ingest.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * There are n servers numbered from 0 to n-1 connected by undirected server-to-server connections forming a network where connections[i] = [a, b] represents a connection between servers a and b.
 * Any server can reach any other server directly or indirectly through the network.
 * A critical connection is a connection that, if removed, will make some server unable to reach some other server.
 * Return all critical connections in the network in any order.
 *
 * @author BorisMirage
 * Time: 2019/11/16 15:37
 * Created with IntelliJ IDEA
 */
public class LC1192 {
    int time = 1;       // global time

    /**
     * Tarjan algorithm.
     *
     * @param n           # of vertices
     * @param connections given list contains connections between nodes in graph
     * @return all critical connections in the network in any order
     */
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

        if (n == 0 || connections == null || connections.size() == 0) {
            throw new IllegalArgumentException("Invalid input!");
        }

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (List<Integer> c : connections) {
            graph.get(c.get(0)).add(c.get(1));
            graph.get(c.get(1)).add(c.get(0));
        }
        List<List<Integer>> out = new LinkedList<>();

        int[] timestamp = new int[n];

        dfs(out, graph, 0, -1, timestamp);

        return out;
    }

    private int dfs(List<List<Integer>> out, List<List<Integer>> graph, int current, int previous, int[] timestamp) {
        if (timestamp[current] > 0) {       // avoid add extra edges into output result
            return timestamp[current];
        }

        timestamp[current] = time++;        // set current node timestamp

        int minTimestamp = time;            // initially, the min timestamp current node will get is original one

        for (int next : graph.get(current)) {
            if (next != previous) {
                int neighborTimestamp = dfs(out, graph, next, current, timestamp);      // obtain min timestamp
                minTimestamp = Math.min(minTimestamp, neighborTimestamp);
            }
        }

        if (minTimestamp >= timestamp[current] && previous >= 0) {
            out.add(Arrays.asList(previous, current));
        }

        return Math.min(timestamp[current], minTimestamp);
    }
}