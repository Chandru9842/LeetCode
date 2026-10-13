class Solution {
    public int minimumSwaps(int[] nums) {
        int zeros=0;
        for(int i:nums){
            if(i==0){
                zeros++;
            }
        }
        int z=zeros;
        for(int i=nums.length-1;i>=nums.length-zeros;i--){
            if(nums[i]==0){
                z--;
            }
        }
        return z;

        
    }
}