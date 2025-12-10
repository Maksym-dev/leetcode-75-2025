package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DeleteTheMiddleNodeOfALinkedListTest extends TestCase {

    public void testDeleteMiddleCase1() {
        DeleteTheMiddleNodeOfALinkedList.ListNode head = new DeleteTheMiddleNodeOfALinkedList.ListNode(1);
        head.next = new DeleteTheMiddleNodeOfALinkedList.ListNode(3, new DeleteTheMiddleNodeOfALinkedList.ListNode(4,
                new DeleteTheMiddleNodeOfALinkedList.ListNode(7, new DeleteTheMiddleNodeOfALinkedList.ListNode(1,
                        new DeleteTheMiddleNodeOfALinkedList.ListNode(2, new DeleteTheMiddleNodeOfALinkedList.ListNode(6))))));

        DeleteTheMiddleNodeOfALinkedList.ListNode result = DeleteTheMiddleNodeOfALinkedList.deleteMiddle(head);

        Assert.assertEquals(1, result.val);
        Assert.assertEquals(3, result.next.val);
        Assert.assertEquals(4, result.next.next.val);
        Assert.assertEquals(1, result.next.next.next.val);
        Assert.assertEquals(2, result.next.next.next.next.val);
        Assert.assertEquals(6, result.next.next.next.next.next.val);
    }

    public void testDeleteMiddleCase2() {
        DeleteTheMiddleNodeOfALinkedList.ListNode head = new DeleteTheMiddleNodeOfALinkedList.ListNode(1);
        head.next = new DeleteTheMiddleNodeOfALinkedList.ListNode(2, new DeleteTheMiddleNodeOfALinkedList.ListNode(3,
                new DeleteTheMiddleNodeOfALinkedList.ListNode(4)));

        DeleteTheMiddleNodeOfALinkedList.ListNode result = DeleteTheMiddleNodeOfALinkedList.deleteMiddle(head);

        Assert.assertEquals(1, result.val);
        Assert.assertEquals(2, result.next.val);
        Assert.assertEquals(4, result.next.next.val);
    }

    public void testDeleteMiddleCase3() {
        DeleteTheMiddleNodeOfALinkedList.ListNode head = new DeleteTheMiddleNodeOfALinkedList.ListNode(2);
        head.next = new DeleteTheMiddleNodeOfALinkedList.ListNode(1);

        DeleteTheMiddleNodeOfALinkedList.ListNode result = DeleteTheMiddleNodeOfALinkedList.deleteMiddle(head);

        Assert.assertEquals(2, result.val);
    }
}