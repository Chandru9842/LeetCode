class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int move=0;
        int n=nums.length;
        int mid=nums[n/2];
        for(int i:nums){
            move+=Math.abs(i-mid);
        }
        return move;
    }
}

// if teh array is sorted means take the middle ele and tarvesre the arrayt and sub this is algo we need know 

// [1,10,2,9]
// sorte after 
// 1,2,9,10==<>16 we got aa n ans;