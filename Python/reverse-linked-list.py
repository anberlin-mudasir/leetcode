""" Reverse a Singly linked list
# Time:  O(n)
# Space: O(1)

"""



class Node:
    def __init__(self, data):
        self.data=data
        self.next=None
    

class Solution(object):
    def reverseList(self, head):
        prev = None
        while head:
            curr = head
            head = head.next
            curr.next = prev
            prev = curr
        return prev
        
        

if __name__ == "__main__":
    head = Node(1)
    head.next = Node(2)
    head.next.next = Node(3)
    head.next.next.next = Node(4)
    head.next.next.next.next = Node(5)
    print Solution().reverseList(head)

