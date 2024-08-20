/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode findMid(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        
        return slow;
        
    }
    
    public ListNode merge(ListNode left,ListNode right){
        ListNode temp=new ListNode(0);
        ListNode dummy=temp;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                dummy.next=left;
                left=left.next;
            }
            else if(left.val>right.val){
                dummy.next=right;
                right=right.next;
                
            }
            dummy=dummy.next;
            
        }
        
        while(left!=null){
            dummy.next=left;
            left=left.next;
            dummy=dummy.next;
        }
        while(right!=null){
            dummy.next=right;
            right=right.next;
            dummy=dummy.next;
        }
        return temp.next;
        
    }
    public ListNode sortList(ListNode head) {
         if (head == null || head.next == null) {
            return head;
        }
        ListNode mid=findMid(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;
        left=sortList(left);
        right=sortList(right);
        
        return merge(left,right);
        
        
        
    }
}