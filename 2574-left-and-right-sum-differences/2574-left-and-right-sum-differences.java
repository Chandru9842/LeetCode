class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n =nums.length;
        int[]left=new int[n];
        left[0]=0;
        int[]right=new int[n];
        right[n-1]=0;
        int[]ans=new int[n];
        for(int i=1;i<=nums.length-1;i++){
           left[i]=left[i-1]+nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
           right[i]=nums[i+1]+right[i+1];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;

        
    }
}