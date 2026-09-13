class Solution {
    public int trap(int[] nums) {
        int left[]=new int[nums.length];
        int n=nums.length;
        int right[]=new int[nums.length];
        int max=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>=max){
                max=nums[i];
            }
            left[i]=max;
        }
        max=-1;
          for(int i=n-1;i>=0;i--){
            if(nums[i]>=max){
                max=nums[i];
            }
            right[i]=max;
        }
        int total=0;
        for(int i=0;i<n;i++){
            total+=Math.min(left[i],right[i])-nums[i];

        }
        return total;

        
    }
}