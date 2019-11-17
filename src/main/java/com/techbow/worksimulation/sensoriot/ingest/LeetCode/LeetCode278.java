package com.techbow.worksimulation.sensoriot.ingest.LeetCode;

public class LeetCode278 {
    public int firstBadVersion(int n) {
        //corner case
        if(n == 1) return 1;

        int left = 1, right = n, mid = 0;

        while(left +1 < right){
            mid = left + (right - left) / 2;
            if(isBadVersion(mid)) right = mid;
            else if(!isBadVersion(mid)) left = mid;
        }
        if(isBadVersion(left)) return left;
        else return right;
    }

    public boolean isBadVersion(int k){
        int target = 500;
        if(k < target) return false;
        else return true;

    }
}