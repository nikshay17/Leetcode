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
    public int countNodes(TreeNode root) {
        TreeNode curr=root;
        int lh=0;
        while(curr!=null){
            lh++;
            curr=curr.left;
            
        }
        
        int rh=0;
        curr=root;
        while(curr!=null){
            rh++;
            curr=curr.right;
        }
        
        if(lh==rh){
            return (int)Math.pow(2,lh)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);  
    
        
                    
        
        
    }
}