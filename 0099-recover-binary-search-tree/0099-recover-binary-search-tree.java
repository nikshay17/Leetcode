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
    TreeNode prev=null;
    TreeNode first=null;
    TreeNode second=null;
    public void swap( TreeNode a,TreeNode b){
        if(a!=null && b!=null){
            int temp=a.val;
            a.val=b.val;
            b.val=temp;
        }
    }
    public void recover(TreeNode root) {
        if(root==null){
            return;
        }
        
        recover(root.left);
        if(prev!=null && root.val<prev.val){
            if(first==null){
                first=prev;
            
            }
           
            second=root;
        }
        
        prev=root;
        recover(root.right);
        
        
        
    }
    
    
    public void recoverTree(TreeNode root){
        
        recover(root);
        swap(first,second);
        
        
    }
}