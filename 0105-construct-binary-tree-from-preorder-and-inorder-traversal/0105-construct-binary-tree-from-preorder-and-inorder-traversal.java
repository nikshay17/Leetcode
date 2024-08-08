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
    int preindex=0;
    public int indexFinder(int [] inorder,int left,int right,int val){
        for(int i=left;i<=right;i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return -1;
    }
    
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return bTree(preorder,inorder,0,inorder.length-1);
        
    }
    
    public TreeNode bTree(int[]preorder,int [] inorder,int left,int right){
        if(left>right){
            return null;
        }
        
        TreeNode root=new TreeNode(preorder[preindex++]);
        
        if(left==right){
            return root;
        }
        int index=indexFinder(inorder,left,right,root.val);
        
        root.left=bTree(preorder,inorder,left,index-1);
        root.right=bTree(preorder,inorder,index+1,right);
        
        return root;
        
        
        
        
        
    }
}