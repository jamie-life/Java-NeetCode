package ReverseLinkedList;

public class Solution {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

        ListNode head;
        ListNode second;
        ListNode third;
        ListNode fourth;
        ListNode fifth;

        head = new ListNode();
        System.out.println(head +"    head");
        System.out.println(head.next +"    next node");

        second = new ListNode();
        System.out.println(second +"    second");

        third = new ListNode();
        fourth = new ListNode();
        fifth = new ListNode();

        head.val = 1;
        head.next = second;
        System.out.println(head.next +"    head next");

        second.val = 2;
        second.next = third;

        third.val = 3;
        third.next = fourth;

        fourth.val = 4;
        fourth.next = fifth;


        fifth.val = 5;
        fifth.next = null;

        printList(head);
        System.out.println(" ");
        printList(reverseList(head));

    }
    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }


    static void printList(ListNode n)
    {
        // Iterate till n reaches null
        while (n != null) {
            // Print the data
            System.out.print(n.val + " ");
            n = n.next;
        }
    }

}
