package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ReverseLinkedListTest extends TestCase {

    public void testReverseListCase1() {
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(1);
        head.next = new ReverseLinkedList.ListNode(2, new ReverseLinkedList.ListNode(3,
                new ReverseLinkedList.ListNode(4, new ReverseLinkedList.ListNode(5))));

        ReverseLinkedList.ListNode result = ReverseLinkedList.reverseList(head);

        Assert.assertEquals(5, result.val);
        Assert.assertEquals(4, result.next.val);
        Assert.assertEquals(3, result.next.next.val);
        Assert.assertEquals(2, result.next.next.next.val);
        Assert.assertEquals(1, result.next.next.next.next.val);
    }

    public void testReverseListCase2() {
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(1);
        head.next = new ReverseLinkedList.ListNode(2);

        ReverseLinkedList.ListNode result = ReverseLinkedList.reverseList(head);

        Assert.assertEquals(2, result.val);
        Assert.assertEquals(1, result.next.val);
    }

    public void testReverseListCase3() {
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode();

        ReverseLinkedList.ListNode result = ReverseLinkedList.reverseList(head);

        Assert.assertEquals(head, result);
    }
}