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
    public int diameterOfBinaryTree(TreeNode root) {
        di(root);
        return maxi;
    }
    int maxi=0;
    public int di(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=di(root.left);
        int rh=di(root.right);
        maxi=Math.max(maxi,lh+rh);
        return 1+Math.max(lh,rh);
    }
}