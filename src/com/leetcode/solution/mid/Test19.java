package com.leetcode.solution.mid;

import java.util.List;

public class Test19 {

    public static int cur = 0;

    static class ListNode {
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
    // 解法1
//    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        // 为了到为后一位可以返回
//        if(head == null){
//            return null;
//        }
//        // 一直往下跟
//        head.next = removeNthFromEnd(head.next, n);
//        // 到这里的时候已经到了最后一个，所以 +1
//        cur++;
//        // 当倒数第n个 和 cur相等，则返回倒数第n个的next，倒数第n个就被去掉了
//        if(n == cur){
//            return head.next;
//        }
//        // 其他的全部正常返回
//        return head;
//    }

    // 解法2
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode a = head;
        ListNode b = head;

        for (int i = 0; i < n; i++) {
            if (a.next != null){
                a = a.next;
            }
            else{
                return head.next;
            }
        }

        while (a.next!=null){
            a = a.next;
            b = b.next;
        }

        b.next = b.next.next;
        return head;
    }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode listNode = removeNthFromEnd(listNode1, 2);
        System.out.println("1");
    }

}
