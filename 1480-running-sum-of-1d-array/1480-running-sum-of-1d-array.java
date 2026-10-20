class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans.add(sum);

        }
        int[]ans1=new int[nums.length];
        for(int i=0;i<ans1.length;i++){
            ans1[i]=ans.get(i);
        }
        return ans1;
        
    }
}