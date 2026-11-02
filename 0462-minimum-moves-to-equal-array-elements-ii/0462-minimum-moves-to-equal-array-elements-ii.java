class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int mid=nums[n/2];
        int move=0;
        for(int i:nums){
            move+=Math.abs(i-mid);

        }
        return move;
        
    }
}