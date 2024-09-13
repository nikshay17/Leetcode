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
    
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }     
        
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        else if(l2==null){
            return l1;
        }
        l1=reverse(l1);
        l2=reverse(l2);
        
       ListNode l3=null;
        
        ListNode curr3=l3;
        
        ListNode curr2=l2;
        ListNode curr1=l1;
        int rem=0;
        while(curr1!=null && curr2!=null){
            if(curr3==null){
                int sum=curr1.val+curr2.val+rem;
                curr3=new ListNode(sum%10);
                l3=curr3;
                rem=sum/10;
            }
            else{
                int sum=curr1.val+curr2.val+rem;
                curr3.next=new ListNode(sum%10);
                curr3=curr3.next;
                rem=sum/10;
                
            }
            curr1=curr1.next;
                curr2=curr2.next;
            
        }
        
        while(curr1!=null){
            int sum=curr1.val+rem;
            curr3.next=new ListNode(sum%10);
            curr3=curr3.next;
            rem=sum/10;
            curr1=curr1.next;
        }
        
        while(curr2!=null){
            int sum=curr2.val+rem;
            curr3.next=new ListNode(sum%10);
            curr3=curr3.next;
            rem=sum/10;
            curr2=curr2.next;
        }
        
        
        if(rem!=0){
            curr3.next=new ListNode(rem);
            
        }
        
        
        l3=reverse(l3);
        return l3;
        
        
    }
}