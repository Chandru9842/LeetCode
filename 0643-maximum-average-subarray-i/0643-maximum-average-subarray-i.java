class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int l=0;
        int n=nums.length;
        double max=Integer.MIN_VALUE;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            if(r-l+1>k){
                sum-=nums[l];
                l++;

            }
            if(r-l+1==k){
                // sum/=(double)k;
                max=Math.max(max,(double)sum/k);
            }

        }
        return max;
    }
}