package org.mhridin;

import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumOfALinkedList {

    public static int pairSum(ListNode head) {
        // Store all node values in a list for easy access by index
        List<Integer> nodeValues = new ArrayList<>();

        // Traverse the linked list and collect all values
        ListNode current = head;
        while (current != null) {
            nodeValues.add(current.val);
            current = current.next;
        }

        // Initialize variables for maximum sum and list size
        int maxSum = 0;
        int listSize = nodeValues.size();

        // Calculate twin sums for the first half of the list
        // Each element at index i is paired with element at index (listSize - 1 - i)
        for (int i = 0; i < listSize / 2; i++) {
            int twinSum = nodeValues.get(i) + nodeValues.get(listSize - 1 - i);
            maxSum = Math.max(maxSum, twinSum);
        }

        return maxSum;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
