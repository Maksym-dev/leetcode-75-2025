package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MaximumTwinSumOfALinkedListTest extends TestCase {

    public void testPairSumCase1() {
        MaximumTwinSumOfALinkedList.ListNode head = new MaximumTwinSumOfALinkedList.ListNode(5);
        head.next = new MaximumTwinSumOfALinkedList.ListNode(4, new MaximumTwinSumOfALinkedList.ListNode(2,
                new MaximumTwinSumOfALinkedList.ListNode(1)));

        int result = MaximumTwinSumOfALinkedList.pairSum(head);

        Assert.assertEquals(6, result);
    }

    public void testPairSumCase2() {
        MaximumTwinSumOfALinkedList.ListNode head = new MaximumTwinSumOfALinkedList.ListNode(4);
        head.next = new MaximumTwinSumOfALinkedList.ListNode(2, new MaximumTwinSumOfALinkedList.ListNode(2,
                new MaximumTwinSumOfALinkedList.ListNode(3)));

        int result = MaximumTwinSumOfALinkedList.pairSum(head);

        Assert.assertEquals(7, result);
    }

    public void testPairSumCase3() {
        MaximumTwinSumOfALinkedList.ListNode head = new MaximumTwinSumOfALinkedList.ListNode(1);
        head.next = new MaximumTwinSumOfALinkedList.ListNode(100000);

        int result = MaximumTwinSumOfALinkedList.pairSum(head);

        Assert.assertEquals(100001, result);
    }
}