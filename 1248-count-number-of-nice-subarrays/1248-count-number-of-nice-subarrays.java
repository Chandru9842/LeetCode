class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return func(nums,k)-func(nums,k-1);

        
    }
    public int func(int[]nums,int k){
        int odd=0;
        int l=0;
        int cnt=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2!=0){
                odd++;
            }
            while(odd>k){
                if(nums[l]%2!=0){
                    odd--;
                }
                l++;
            }
            cnt+=r-l+1;

        }
        return cnt;
    }
}