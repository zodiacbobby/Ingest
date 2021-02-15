package com.techbow.worksimulation.sensoriot.ingest.LeetCode;

public class LeetCode147 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }

    public class Solution {
        public ListNode insertionSortList(ListNode head) {
            if(head == null || head.next == null) return head;

            ListNode dummy = new ListNode(0);
            ListNode cur = head;
            ListNode prev = dummy;
            ListNode insertNode = null;
            while(cur != null){
                prev = dummy;
                while(prev.next != null && cur.val > prev.next.val){
                    prev = prev.next;
                }

                insertNode = cur;
                cur = cur.next;
                insertNode.next = prev.next;
                prev.next = insertNode;

            }
            return dummy.next;
        }
    }

}
