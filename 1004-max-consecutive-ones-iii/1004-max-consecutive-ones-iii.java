class Solution {
    public int longestOnes(int[] nums, int k) {
        // int max=0;                             brute force Solution
        // int len=0;
        // for(int i=0;i<nums.length;i++){
        //     int zeros=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==0){
        //             zeros++;
        //         }
        //         if(zeros<=k){
        //             len=j-i+1;
        //             max=Math.max(max,len);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return max;

        // Efficient Solution
        // int max=0;
        // int start=0;
        // int count=0;
        // for(int end=0;end<nums.length;end++){
        //     if(nums[end]==0){
        //         count++;
        //     }
        //     while(count>k){
        //         if(nums[start]==0){
        //             count--;
        //         }
        //         start++;
               
        //     }
        //     max=Math.max(max,end-start+1);//5
        // }
        // return max; 
        int max=0;
        int zeros=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;













        
    }
}