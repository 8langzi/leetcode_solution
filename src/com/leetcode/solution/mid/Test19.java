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
    // �ⷨ1
//    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        // Ϊ�˵�Ϊ��һλ���Է���
//        if(head == null){
//            return null;
//        }
//        // һֱ���¸�
//        head.next = removeNthFromEnd(head.next, n);
//        // �������ʱ���Ѿ��������һ�������� +1
//        cur++;
//        // ��������n�� �� cur��ȣ��򷵻ص�����n����next��������n���ͱ�ȥ����
//        if(n == cur){
//            return head.next;
//        }
//        // ������ȫ����������
//        return head;
//    }

    // �ⷨ2
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
