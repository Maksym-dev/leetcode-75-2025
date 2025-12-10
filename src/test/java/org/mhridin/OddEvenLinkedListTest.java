package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class OddEvenLinkedListTest extends TestCase {

    public void testOddEvenListCase1() {
        OddEvenLinkedList.ListNode head = new OddEvenLinkedList.ListNode(1);
        head.next = new OddEvenLinkedList.ListNode(2, new OddEvenLinkedList.ListNode(3,
                new OddEvenLinkedList.ListNode(4, new OddEvenLinkedList.ListNode(5))));

        OddEvenLinkedList.ListNode result = OddEvenLinkedList.oddEvenList(head);

        Assert.assertEquals(1, result.val);
        Assert.assertEquals(3, result.next.val);
        Assert.assertEquals(5, result.next.next.val);
        Assert.assertEquals(2, result.next.next.next.val);
        Assert.assertEquals(4, result.next.next.next.next.val);
    }

    public void testOddEvenListCase2() {
        OddEvenLinkedList.ListNode head = new OddEvenLinkedList.ListNode(2);
        head.next = new OddEvenLinkedList.ListNode(1, new OddEvenLinkedList.ListNode(3,
                new OddEvenLinkedList.ListNode(5, new OddEvenLinkedList.ListNode(6,
                        new OddEvenLinkedList.ListNode(4, new OddEvenLinkedList.ListNode(7))))));

        OddEvenLinkedList.ListNode result = OddEvenLinkedList.oddEvenList(head);

        Assert.assertEquals(2, result.val);
        Assert.assertEquals(3, result.next.val);
        Assert.assertEquals(6, result.next.next.val);
        Assert.assertEquals(7, result.next.next.next.val);
        Assert.assertEquals(1, result.next.next.next.next.val);
        Assert.assertEquals(5, result.next.next.next.next.next.val);
        Assert.assertEquals(4, result.next.next.next.next.next.next.val);
    }
}