class Solution {
    public int robber(int []nums){
         int n=nums.length;
        int[]dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
        
    }
    public int rob(int[] nums) {
          if (nums.length == 1){
    return nums[0];
      }

      if (nums.length == 2){
    return Math.max(nums[0],nums[1]);
      }
       int[]skiplast=new int[nums.length-1];
       int[]skipfirst=new int[nums.length-1];

       for(int i=0;i<nums.length-1;i++){
        skiplast[i]=nums[i];
        skipfirst[i]=nums[i+1];
       }
       int loopskiplast=robber(skiplast);
       int loopskipfirst=robber(skipfirst);
       return Math.max(loopskiplast,loopskipfirst);

    }
}