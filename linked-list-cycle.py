
# Time:  O(n)
# Space: O(1)
#
# Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
# 
# Follow up:
# Can you solve it without using extra space?
#

# Definition for singly-linked list.

class Node:
    def __init__(self, item):
        self.data=item
        self.next=None

class Solution(object):
    def hasCycle(self, head):
        slow=head
        fast=head
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next

            if fast is slow:
                return True
        return False


"""if __name__=="__main__":
head=Node(1)
head.next=Node(2)
head.next.next=Node(3)
head.next.next.next=Node(4)
head.next.next.next.next=head.next
print (Solution().hasCycle(head))

"""
