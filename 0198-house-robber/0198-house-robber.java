class Solution {
    // int  rob(int[]nums,int index){
    //     if(index>=nums.length){
    //         return 0;
    //     }
    //     int robthat=nums[index]+rob(nums,index+2);
    //     int skip=rob(nums,index+1);
    //     return Math.max(robthat,skip);
    // }

    // public int rob(int[] nums) {
    //    return rob(nums,0);
     public int rob(int[] nums) {
    int n=nums.length;
    if(nums.length<2){
        return nums[0];
    }
    int dp[]=new int[n];
    dp[0]=nums[0];
    dp[1]=Math.max(nums[0],nums[1]);
    for(int i=2;i<nums.length;i++){
        dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
    }
    return dp[n-1];
        
    }
}