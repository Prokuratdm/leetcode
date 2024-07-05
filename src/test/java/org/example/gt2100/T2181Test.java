package org.example.gt2100;

import org.example.common.ListNode;
import org.junit.jupiter.api.Test;

class T2181Test {

    T2181 t = new T2181();

    @Test
    void mergeNodes() {
        ListNode head =
                new ListNode(0,
                        new ListNode(1,
                                new ListNode(0,
                                        new ListNode(3,
                                                new ListNode(0,
                                                        new ListNode(2,
                                                                new ListNode(2,
                                                                        new ListNode(0)))
                                                )))));
        var result = t.mergeNodes(head);
        int i =0;
    }
}