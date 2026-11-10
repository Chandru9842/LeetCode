class Solution {
    public int maxSubArray(int[] nums) {
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         max=Math.max(sum,max);

        //     }
        // }
        // return max;

        // int max=nums[0];
        // int curr=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     curr=Math.max(nums[i],nums[i]+curr);
        //     max=Math.max(curr,max);
        // }
        // return max;


        int n=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
           max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
            // return max;
           

        }
        return max;
    
    }
}