class Solution {
    public int smallestIndex(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                int digit=nums[i]%10;
                sum+=digit;
                nums[i]/=10;

            }
            System.out.println(sum);
            if(sum==i){
                ans=Math.min(i,ans);
            }
        }
    if(ans==Integer.MAX_VALUE){
        return -1;
    }
    return ans;
        
    }
}