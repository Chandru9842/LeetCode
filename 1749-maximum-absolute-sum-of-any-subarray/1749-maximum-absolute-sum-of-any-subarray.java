class Solution {
    public int subarraymax(int[]nums,int ans){
        //  ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans=Math.max(sum,ans);
            if(sum<0){
                sum=0;
            }
        }
        return ans;

    }
    public int subarraymin(int[]nums,int ans){
        //   ans=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            nums[i]*=-1;
            sum+=nums[i];
            ans=Math.max(sum,ans);
            if(sum<0){
                sum=0;
            }
        }
        return ans;

    }
    public int maxAbsoluteSum(int[] nums) {
        int maxsub=Integer.MIN_VALUE;
        int minsub=Integer.MIN_VALUE;
        return Math.max(subarraymax(nums,maxsub),subarraymin(nums,minsub));
        
    }
}