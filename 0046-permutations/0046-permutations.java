class Solution {
    List<List<Integer>> luck=new ArrayList<>();
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        
        permute2(nums,0,nums.length-1);
        return luck;
        
        
        
        
    }
    public void permute2(int []nums,int l,int r){
        if(l==r){
            List<Integer> h=new ArrayList<>();
            for(int i:nums){
                h.add(i);
            }
            luck.add(h);
            
        }
        
        for(int i=l;i<=r;i++){
            swap(nums,l,i);
            permute2(nums,l+1,r);
            swap(nums,l,i);
            
        }
        
    }
}