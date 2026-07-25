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
    public ListNode getNode(ListNode head,int idx){
        ListNode temp = head;
       for(int i=1;i<idx;i++){
            temp = temp.next;
       }
       return temp;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int i = left,j=right;
         while(i<j){
             ListNode x = getNode(head,i);
             ListNode y = getNode(head,j);
            int temp = x.val;
            x.val = y.val;
            y.val=temp;
            i++;j--;
        }
        
        return head;
    }
}