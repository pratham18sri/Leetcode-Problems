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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // base case
        if(head==null) return null;
       // first count size
       ListNode temp=head;
       int size=0;
       while( temp!=null){
        size++;
        temp=temp.next;
       }
        //fromula idx=size-n+1;
        int idx=size-n+1;
        // base case 
        if (idx == 1) {
            return head.next;
        }
        //   set temp again to head
        temp=head;
        //    travel to just beforre to that idx
        for( int i=1;i<idx-1;i++){
            temp=temp.next;
        }
        if( temp.next!=null){
            temp.next=temp.next.next;
        }
        return head;
    }
}