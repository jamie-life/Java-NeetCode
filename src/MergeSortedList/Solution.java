package MergeSortedList;

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

        head = new ListNode();
        second = new ListNode();
        third = new ListNode();

        head.val = 1;
        head.next = second;
        second.val = 2;
        second.next = third;
        third.val = 4;

        // Second List

        ListNode second_head;
        ListNode second_value;
        ListNode third_value;

        second_head = new ListNode();
        second_value = new ListNode();
        third_value = new ListNode();

        second_head.val = 1;
        second_head.next = second_value;
        second_value.val = 3;
        second_value.next = third_value;
        third_value.val = 4;


        printList(mergeTwoLists(head, second_head));


    }

    public static ListNode mergeTwoLists(ListNode first_head, ListNode second_head) {

        ListNode newHead = new ListNode(0);
        ListNode current = newHead;

        while (first_head != null && second_head != null) {
            if (first_head.val <= second_head.val) {
                current.next = first_head;
                first_head = first_head.next;
            } else {
               current.next = second_head;
               second_head = second_head.next;
            }
            current = current.next;
        }

        if (first_head != null) {
            current.next = first_head;
        } else if (second_head != null) {
            current.next = second_head;
        }

        return newHead.next;
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
