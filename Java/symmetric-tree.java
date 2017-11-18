/*

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3

*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricTree(root.left, root.right);
    }
    
    public boolean isSymmetricTree(TreeNode l, TreeNode r){
        if (l==null || r==null)
            return l==r;
        if (l.val!=r.val)
            return false;
        return isSymmetricTree(l.left, r.right) && isSymmetricTree(l.right,r.left);
            
        
    }
}
