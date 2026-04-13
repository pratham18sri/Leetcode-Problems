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
    public ListNode middleNode(ListNode head) {
        // first fing lenght
        int n=0;
        ListNode temp=head;
        while( temp!=null){
            temp=temp.next;
            n++;
        }
        // chek for even odd
        ListNode slow=head;
        ListNode fast=head;
        if( n%2==0){
            while( fast!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
        }
        else{
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
        }
        return slow;
    }
}