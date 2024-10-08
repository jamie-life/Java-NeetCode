package LinkedListCycle;

import java.util.HashMap;

public class Solution {

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public static void main(String[] args) {

        ListNode head;
        //ListNode second;
        //ListNode third;
        //ListNode fourth;

        head = new ListNode(1);
        //second = new ListNode(2);
        //third = new ListNode(0);
        //fourth = new ListNode(-4);

        //head.next = second;
        //second.next = head;
        //third.next = fourth;
        //fourth.next = second;


        //printList(head);

        //HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        //map.put(head, 1);
        //System.out.println(map);


        System.out.println(hasCycle(head));


    }

    public static boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        while (head != null) {
          if (map.containsKey(head)) {
              return true;
          } else {
              map.put(head, 1);
              head = head.next;
          }
        }
        return false;
    }


//    public static boolean hasCycle(ListNode head) {
//
//        ListNode slow = head, fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (slow == fast)
//                return true;
//        }
//
//        return false;
//    }

    static void printList(ListNode n)
    {
        // Iterate till n reaches null
        int i = 0;
        while (i < 9) {
            // Print the data
            System.out.print(n.val + " ");
            n = n.next;
            i++;
        }
    }
}
