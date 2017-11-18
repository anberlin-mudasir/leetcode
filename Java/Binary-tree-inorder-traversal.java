/*

Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,3,2].

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list= new ArrayList<Integer>();
        Helper(root, list);
        return list;
    } 
     
    private void Helper(TreeNode root, List<Integer> list){
              
        if (root!=null){
         
            Helper(root.left,list);
            list.add(root.val);
            Helper(root.right,list);
            
        }
        
        
        
        
        
    }
}
