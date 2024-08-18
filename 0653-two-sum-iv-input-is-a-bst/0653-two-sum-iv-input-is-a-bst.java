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
    Set<Integer> s=new HashSet<>();
    boolean flag=false;
    public void treefill(TreeNode root,int k){
        if(root==null){
            return;
        }
        treefill(root.left,k);
        
        if(s.contains(k-root.val)){
            flag=true;
            
        }
        s.add(root.val);
        treefill(root.right,k);
    }
    
    public boolean findTarget(TreeNode root, int k) {
        treefill(root,k);
        return flag;
        
        
    }
}