package org.example.gt2100;

import org.example.common.ListNode;

public class T2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode result = null;
        ListNode resHead = null;
        int currentVal = 0;
        boolean isNew = true;
        while (head != null) {
            if (head.val == 0) {
                if(!isNew){
                    if(result == null){
                        result = new ListNode(currentVal);
                        resHead = result;
                    }
                    else {
                        result.next = new ListNode(currentVal);
                        result = result.next;
                    }
                    currentVal = 0;
                    isNew = true;
                }
            }
            else{
                isNew = false;
                currentVal += head.val;
            }
            head = head.next;
        }


        return resHead;
    }
}
