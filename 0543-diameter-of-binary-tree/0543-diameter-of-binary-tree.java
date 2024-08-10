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
    public int diameterOfBinaryTree(TreeNode root){
        int a=diameterOfBinaryTre(root);
        return a-1;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTre(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        int d1=1+height(root.left)+height(root.right);
        int d2=diameterOfBinaryTre(root.left);
        int d3=diameterOfBinaryTre(root.right);
        
        return Math.max(d1,Math.max(d2,d3));
        
        
        
        
        
    }
}