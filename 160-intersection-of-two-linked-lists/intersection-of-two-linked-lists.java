/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // base 
        if (headA == null || headB == null) return null;
        //  first we find length for both link list
        int l1=0;
        ListNode temp1=headA;
        while( temp1!=null){
            l1++;
            temp1=temp1.next;
        } 
        int l2=0;
        ListNode temp2=headB;
        while( temp2!=null){
            l2++;
            temp2=temp2.next;
        }
        // than we make temp of both linklist at same idxes so acc to temps the size of both liklist bcmm same
        temp1=headA;
        temp2=headB;
        int move=0;
        if( l1>l2){
            move= l1-l2;
            for( int i=0;i<move;i++){
                temp1=temp1.next;
            }
        }
        else{
            move=l2-l1;
            for( int i=0;i<move;i++){
                temp2=temp2.next;
            }
        }

        while( temp1!=null && temp2!=null){
            if( temp1==temp2){
                return temp1;
            } 
            temp1=temp1.next;
            temp2=temp2.next;
        }
        //  than we move temps is both temps.data is same than we just simple retunre that temp.data
        return null;
    }
}