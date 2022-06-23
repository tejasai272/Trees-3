/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

//TC:O(n) SC: O(height)
    public boolean isSymmetric(TreeNode root) {
     return helper(root.left)&&helper(root.right);   
    }
    
 boolean helper(TreeNode root){
     if(root.left==null && root.right==null)return true;
     else if(root.left!=null && root.right!=null){
             if(root.left==root.right && root.left==root.right){
                return true;
          }
     }
     return false;
 }   
}
