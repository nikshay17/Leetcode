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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return list;
        }
        q.add(root);
        boolean leftToRight=true;
    
    
        
        while(q.isEmpty()==false){
            
                List<Integer> l=new ArrayList<>();
                int count=q.size();
                for(int i=0;i<count;i++){
                    TreeNode curr=q.poll();
                     if (leftToRight) {
                    l.add(curr.val);
                } else {
                    l.add(0, curr.val);
                }
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                    
                }
            leftToRight=!leftToRight;
                
                list.add(l);
                
            
            
             
            
            
            
        }
        return list;
        
    }
    

    
}