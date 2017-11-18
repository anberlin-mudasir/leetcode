/*


Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?




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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Helper(root, list);
        return list;
        
    }
    
    private void Helper(TreeNode root, List<Integer> list) {
        
        if (root!=null){
        list.add(root.val);
        Helper(root.left, list);
        Helper(root.right, list);
        }
    }
}
