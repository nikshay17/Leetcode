class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int t=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    t=j;
                    break;
                    
                }
            }
            if(t!=nums2.length-1){
                int temp=nums1[i];
                nums1[i]=-1;
            for(int j=t+1;j<nums2.length;j++){
                if(nums2[j]>temp){
                    nums1[i]=nums2[j];
                    break;
                    
                }
                
    
            }
                
                
        }
            else{
                nums1[i]=-1;
            }
        }
        
        return nums1;
        
        
    }
}