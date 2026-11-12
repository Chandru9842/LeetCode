class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int min=1;
        int maxlen=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                max++;
                min=1;
            }
            else if(nums[i]>nums[i+1]){
                min++;
                max=1;
            }
            else{
                min=1;
                max=1;
            }
            maxlen=Math.max(maxlen,Math.max(min,max));


        }
        return maxlen;
        
    }
}