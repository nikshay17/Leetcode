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
    public void swap(TreeNode first,TreeNode second){
        if(first!=null && second!=null){
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        }
    }
    TreeNode prev=null;
        TreeNode first=null;
        TreeNode second=null;
    public void recoverTree(TreeNode root) {
        
        rT(root);
        swap(first,second);
        
        
    }
    public void rT(TreeNode root){
        if(root==null){
            return;
        }
        
        rT(root.left);
        if(prev!=null && prev.val>root.val){
            if(first==null){
                first=prev;
            }
            second=root;
            
        }
        prev=root;
        
        rT(root.right);
        
        
        
    }
}