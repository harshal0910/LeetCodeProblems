/*
Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
*/
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
    public ListNode reverseList(ListNode head) {
        //Make before break;
        // if(head==null){
        //     return null;
        // }
        // ListNode n1=head;
        // ListNode n2=head.next;
        // ListNode n3=null;

        // while(n2!=null){
        //     n3=n2.next;
        //     n2.next=n1;
        //     n1=n2;
        //     n2=n3;
        // }
        // head.next=null;
        // return n1;


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
}
