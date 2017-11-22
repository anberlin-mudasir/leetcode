/*
Given a singly linked list, determine if it is a palindrome.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            
                slow=slow.next;
            fast=fast.next.next;
            
            }
        
        if(fast!=null)
            slow=slow.next;   // For odd nodes.
        
        slow=reverse(slow);
        fast=head;
        
        while (slow!=null){
            if(fast.val!=slow.val)
                return false;
            fast=fast.next;
            slow=slow.next;
            
        }
        return true;
    }
    
    
    public ListNode reverse(ListNode head){
        
        ListNode prev=null;
        while (head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
        
    }
}
