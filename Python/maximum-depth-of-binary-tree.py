"""
Time:  O(n)
Space: O(h), h is height of binary tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

"""

class Node:
    def __init__(self, data):
        self.data=data
        self.left=None
        self.right=None

class Solution(object):
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root is None:
            return 0
        else:
            return 1+ max(self.maxDepth(root.left), self.maxDepth(root.right))
        
        
