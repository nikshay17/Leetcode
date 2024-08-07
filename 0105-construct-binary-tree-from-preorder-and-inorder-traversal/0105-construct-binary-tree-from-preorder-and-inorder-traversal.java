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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return bTree(preorder,inorder,0,inorder.length-1);
    
    }
    
    public int index(int[] inorder,int start,int end,int val){
        for(int i=start;i<=end;i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return -1;
        
    }
    int preindex=0;
    
    public TreeNode bTree(int [] preorder,int [] inorder,int start,int end){
        
        if(start>end){
            return null;
        }
        
        TreeNode root=new TreeNode(preorder[preindex++]);
        if(start==end){
            return root;
        }
        
        int index=index(inorder,start,end,root.val);
        
        root.left=bTree(preorder,inorder,start,index-1);
        root.right=bTree(preorder,inorder,index+1,end);
        
        return root;
        
        
        
    }
}