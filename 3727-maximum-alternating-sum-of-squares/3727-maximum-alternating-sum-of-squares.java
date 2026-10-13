class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long score=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int half=n/2;
        for(int i=0;i<nums.length;i++){
            if(i<half){
                score-=(long)nums[i];
            }
            else{
                score+=(long)nums[i];
            }
        }
        return score;

        
    }
}