// Reverse a singly linked list 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Iterative Solution 
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev=null;
        while (head!=null){
            ListNode next=head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}




// Recursive Solution 


class Solution1 {
    public ListNode reverseList(ListNode head) {
       return reverseListNode(head, null);
}
    public ListNode reverseListNode(ListNode head, ListNode prev){
        
        if (head==null)
            return prev;
        ListNode next=head.next;
        head.next=prev;
        return reverseListNode(next,head);
    }   
}
