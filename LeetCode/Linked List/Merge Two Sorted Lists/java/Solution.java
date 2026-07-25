/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


   

   class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node to simplify the result construction
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        // Pointers for both input lists
        ListNode curr1 = list1, curr2 = list2;

        // Merge while both lists have nodes
        while (curr1 != null && curr2 != null) {
            if (curr1.val < curr2.val) {
                temp.next = curr1;
                curr1 = curr1.next;
            } else {
                temp.next = curr2;
                curr2 = curr2.next;
            }
            temp = temp.next;
        }

        // Attach the remaining part (only one of these will be non-null)
        if (curr1 != null) temp.next = curr1;
        if (curr2 != null) temp.next = curr2;

        // Return the head of the merged list
        return dummyNode.next;
    }
}
