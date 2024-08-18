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
    public boolean fT(TreeNode root,int k,HashSet<Integer> s){
        if(root==null){
            return false;
        }
        if(fT(root.left,k,s)==true){
            return true;
        }
        if(s.contains(k-root.val)){
            return true;
        }
        else{
            s.add(root.val);
        }
       return fT(root.right,k,s);
        
        
    }
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> s=new HashSet<>();
        return fT(root,k,s);
        
        
    }
}