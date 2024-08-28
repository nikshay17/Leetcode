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
class triplet implements Comparable<triplet>{
    ListNode node;
    int ap;
    int vp;
    triplet(ListNode a,int b,int c){
        node=a;
        ap=b;
        vp=c;
    }
    
    @Override
    public int compareTo(triplet k) {
        return Integer.compare(this.node.val, k.node.val);
    }
}
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        PriorityQueue<triplet> pq=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
            pq.add(new triplet(lists[i],i,0));
        }
        }      
        while(!pq.isEmpty()){
            triplet curr=pq.poll();
            temp.next=curr.node;
            temp=temp.next;
            int ap=curr.ap;
            int vp=curr.vp;
            
            if(curr.node.next!=null){
                pq.add(new triplet(curr.node.next,ap,vp+1));
            }
        }
        return dummy.next;
        
        
    }
}