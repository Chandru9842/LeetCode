class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        int l=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                min=Math.min(r-l+1,min);
                sum-=nums[l];
                l++;


            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
        
    }
}