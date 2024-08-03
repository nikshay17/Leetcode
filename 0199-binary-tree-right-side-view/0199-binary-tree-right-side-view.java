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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null){
        q.add(root);
        }
        TreeNode curr=root;
        while(q.isEmpty()==false){
            
            int count=q.size();
            
            for(int i=0;i<count;i++){
                curr=q.poll();
                if(i==count-1){
                    l.add(curr.val);
                }
                
                if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
            }
                
            
            
            
            
        }
        return l;
        
        
        
        
            
    }
}