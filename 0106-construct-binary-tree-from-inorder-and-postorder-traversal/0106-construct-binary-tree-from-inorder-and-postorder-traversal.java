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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int[] postindex={inorder.length-1};
        
        return bTree(inorder,postorder,0,inorder.length-1,postindex);
    }
    public int index(int [] inorder,int start,int end,int val){
        for(int i=start;i<=end;i++){
            if(inorder[i]==val){
                return i;
            }
            
        }
        return -1;

}
    
    public TreeNode bTree(int [] inorder,int [] postorder,int start,int end,int[]postindex){
        if(start>end){
            return null;
        }
        TreeNode root=new TreeNode(postorder[postindex[0]--]);
        if(start==end){
            return root;
        }
        int index=index(inorder,start,end,root.val);
        
        root.right=bTree(inorder,postorder,index+1,end,postindex);
        root.left=bTree(inorder,postorder,start,index-1,postindex);
        
        return root;
        
        
        
    }
}