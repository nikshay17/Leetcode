class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] arr=new int[nums.length-k+1];
        Deque<Integer> de=new ArrayDeque<>();
        
        for(int i=0;i<nums.length;i++){
            if (!de.isEmpty() && de.peek() == i - k) {
                de.poll();
            }
            
            while(!de.isEmpty() && nums[i]>nums[de.peekLast()] ){
                de.pollLast();
            }
            de.add(i);
            
            
            
            if(i>=k-1){
                arr[i-k+1]=nums[de.peek()];
            }
            
            
            
            
            
            
        }
        return arr;
    }
}