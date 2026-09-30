class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return func(nums,goal)-func(nums,goal-1);

    }
    public int func(int[]nums,int goal){
        
        if (goal < 0) {
            return 0;
        }

        int l = 0;
        int cnt = 0;
        int sum = 0;

        for (int r = 0; r < nums.length; r++) {

            sum += nums[r];

            while (sum > goal) {
                sum -= nums[l];
                l++;
            }
            cnt+=r-l+1;

            // if (sum == goal) {
            //     cnt += r - l + 1;
            // }
        }

        return cnt;
    }
}