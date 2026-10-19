class Solution {
    public boolean  increase(int[]nums){

        boolean flag=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                flag=false;
            }
        }
        return flag;

    }
    public boolean decrease(int[]nums){
       
        boolean flag=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                flag=false;
            }
        }
        return flag;

    }
    public boolean isMonotonic(int[] nums) {
        return (increase(nums)||decrease(nums));
        
    }
}