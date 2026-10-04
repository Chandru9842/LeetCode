class Solution {
    public int maxProduct(int[] nums) {
        // int n=nums.length;
        // int max=Integer.MIN_VALUE;
        // int pre=1;
        // int suff=1;
        // for(int i=0;i<n;i++){
        //     if(pre==0) pre=1;
        //     if(suff==0) suff=1;
        //     pre=pre*nums[i];
        //     suff=suff*nums[n-i-1];
        //     max=Math.max(max,Math.max(pre,suff));

        // }
        // // max=Math.max(max,max(pre,suff));
        // return max;

        int maxval=nums[0];
        int minval=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            int oldMax = maxval;
            int oldMin = minval;

            maxval = Math.max(
                nums[i],
                Math.max(nums[i] * oldMax, nums[i] * oldMin)
            );

            minval = Math.min(
                nums[i],
                Math.min(nums[i] * oldMax, nums[i] * oldMin)
            );
            max=Math.max(max,Math.max(minval,maxval));

        }
        return max;
    }
}