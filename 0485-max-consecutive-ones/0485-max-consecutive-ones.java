class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int ones=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            // ones++;
            if(nums[r]==1){
                ones++;
            }
            if(nums[r]==0){
                ones=0;
            }
            max=Math.max(max,ones);


        }
        return max;
        
    }
}